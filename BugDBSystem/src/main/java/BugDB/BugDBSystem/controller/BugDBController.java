package BugDB.BugDBSystem.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;

import BugDB.BugDBSystem.VO.ErroInfo;
import BugDB.BugDBSystem.domain.*;
import BugDB.BugDBSystem.service.OsService;
import BugDB.BugDBSystem.service.UserService;

@Controller
@RequestMapping("/")
public class BugDBController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private OsService osService;
	//账号安全问题需要解决
	@RequestMapping(value ="user",params = {"userName","password"}, method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String user(HttpServletRequest request,@RequestParam String userName, @RequestParam String password) {		
//		SecurityContextImpl securityContextImpl = (SecurityContextImpl) request
//				 .getSession().getAttribute("SPRING_SECURITY_CONTEXT");
//				// 登录名
//		System.out.println("Username:"+ securityContextImpl.getAuthentication().getName());
		User user = userService.findByUserName(userName);
		Gson gson = new Gson();
		
		if(password.equals(user.getPassword())){
			
			return gson.toJson(user);
		}
		else{
			ErroInfo ei = new ErroInfo();
			ei.setErrCont("User name or password is wrong");
			return gson.toJson(ei);
		}
	}
	@RequestMapping(value ="user", method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String listUser(HttpServletRequest request) {		
//		SecurityContextImpl securityContextImpl = (SecurityContextImpl) request
//				 .getSession().getAttribute("SPRING_SECURITY_CONTEXT");
//				// 登录名
//		System.out.println("Username:"+ securityContextImpl.getAuthentication().getName());
		User user = userService.findByUserName("Leah");
		Gson gson = new Gson();
		
		return gson.toJson(user);
		
	}
	
	@RequestMapping("login")
	public ModelAndView login(){
		return new ModelAndView("login");
	}
	
//	@RequestMapping(value ="os", method = RequestMethod.GET)
//	@Transactional(readOnly = true)
//	public @ResponseBody String os(HttpServletRequest request) {
//		List<Os> result=osService.findAll();
//		Gson gson=new Gson();
//		return gson.toJson(result);
//	}
	
}
