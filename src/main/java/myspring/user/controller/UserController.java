package myspring.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.user.service.UserService;
import myspring.user.vo.UserVO;

@Controller 
public class UserController {
	@Autowired
	private UserService userService;
	
	public UserController() {
		System.out.println(this.getClass().getName() + "생성자 호출됨");
	}
	
	@RequestMapping("/userList.do")
	public ModelAndView userList() {
		List<UserVO> userVOList = userService.getUserList();
		//ModelAndView(viewName, keyName, valueObject)
		return new ModelAndView("userList", "userList", userVOList);
	}
	
	//getUser.do?id=dooly
	@RequestMapping("/getUser.do")
	public String getUser(@RequestParam("id") String userId, Model model) {
		UserVO userVO = userService.getUser(userId);
		model.addAttribute("user", userVO);
		return "userInfo";
	}
}
