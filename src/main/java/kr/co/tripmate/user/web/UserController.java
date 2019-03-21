package kr.co.tripmate.user.web;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.tripmate.user.service.UserService;
import kr.co.tripmate.user.vo.UserVO;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Inject
	private UserService userService;
	
	@RequestMapping(value = "/userList")
	public String userList(Model model) throws Exception {
		
		return "/user/userList";
		
	}
	
	@RequestMapping(value = "/selectUserList")
	public @ResponseBody ModelMap selectUserList(String name) throws Exception {
		
		List<UserVO> userList = userService.selectUserList(name);
		
		ModelMap model = new ModelMap();
		
		model.addAttribute("data", userList);
		
		return model;
		
	}
	
}
