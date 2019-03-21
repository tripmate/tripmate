package kr.co.tripmate.mate.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.tripmate.mate.service.MateService;

@Controller
@RequestMapping(value = "/mate")
public class MateController {

	private static final Logger logger= LoggerFactory.getLogger(MateController.class);
	
	@Inject
	private MateService mateService;
	
	// 동행 목록 화면
	@RequestMapping(value = "/mateList")
	public String mateList(Model model) throws Exception {
	
		return "/mate/mateList";
		
	}
	
	// 동행 목록 조회
	@RequestMapping(value = "/selectMateList", method = RequestMethod.GET)
	public @ResponseBody ModelMap selectMateList(String writer) throws Exception {
		
		ModelMap model = new ModelMap();
		
		model.addAttribute("data", mateService.selectMateList(writer));
		
		return model;
		
	}
	
	// 동행 정보 수정 화면
	@RequestMapping(value = "/mateForm", method = RequestMethod.GET)
	public String mateForm(Model model) throws Exception {
		
		return "/mate/mateForm";
		
	}
	
	// 동행 정보 삭제
	public String deleteMateInfo(@RequestParam("mate_no") int mate_no, RedirectAttributes rttr) throws Exception {
		
		mateService.deleteMateInfo(mate_no);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/mate/mateList";
		
	}
	
}
