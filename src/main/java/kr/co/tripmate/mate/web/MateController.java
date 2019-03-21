package kr.co.tripmate.mate.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.tripmate.mate.service.MateService;
import kr.co.tripmate.mate.vo.MateVO;

@Controller
@RequestMapping(value = "/mate")
public class MateController {

	private static final Logger logger= LoggerFactory.getLogger(MateController.class);
	
	@Inject
	private MateService mateService;
	
	// 동행 목록 화면
	@RequestMapping(value = "/mateList")
	public void mateList(Model model) throws Exception {
	
		model.addAttribute("list", mateService.selectMateList());
		
		// return "/mate/mateList";
		
	}
	
	// 동행 전체 목록 조회
//	@RequestMapping(value = "/selectMateList", method = RequestMethod.GET)
//	public void selectMateList(String writer, Model model) throws Exception {
//		
//		model.addAttribute("list", mateService.selectMateList(writer));
//		
//	}
	
	
	// 동행 정보 수정 화면
	@RequestMapping(value = "/mateForm", method = RequestMethod.GET)
	public String mateForm(@RequestParam(value = "mate_no", required = false) int mate_no, Model model) throws Exception {
		
		model.addAttribute(mateService.selectMateInfo(mate_no));
		
		return "/mate/mateForm";
		
	}
	
	@RequestMapping(value = "/mateForm", method = RequestMethod.POST)
	public String updateMateInfo(MateVO mateVO, RedirectAttributes rttr) throws Exception {
		
		if ( StringUtils.isEmpty(mateVO.getMate_no()) ) {
			mateService.insertMateInfo(mateVO);
		} else {
			mateService.updateMateInfo(mateVO);
		}
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/mate/mateList";
		
	}
	
	// 동행 정보 삭제
	public String deleteMateInfo(@RequestParam("mate_no") int mate_no, RedirectAttributes rttr) throws Exception {
		
		mateService.deleteMateInfo(mate_no);
		
		rttr.addFlashAttribute("msg", "SUCCESS");
		
		return "redirect:/mate/mateList";
		
	}
	
}
