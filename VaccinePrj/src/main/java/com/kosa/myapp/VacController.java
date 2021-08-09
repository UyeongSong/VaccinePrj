package com.kosa.myapp;



import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VacController {
	static final Logger logger = LoggerFactory.getLogger(VacController.class);
	
	@Autowired
	IMemberService memberService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String userId, String password, HttpSession session, Model model) {
		MemberVO member = memberService.selectMember(userId);
		if(member != null) {
			String dbpassword = member.getPassword();
				if(dbpassword == null) {
					model.addAttribute("message", "존재하지 않는 아이디 입니다.");
				} else {
					if(dbpassword.equals(password)) {
						session.setAttribute("userid", userId);
						session.setAttribute("name", member.getName());
						session.setAttribute("email", member.getEmail());
						
						return "postlogin";
					}
					else {
						model.addAttribute("message", "wrong_password");
					}
				}
		} else {
			model.addAttribute("message", "user_not_found");
		}
		
		session.invalidate();	
		return "login";
	}
}
