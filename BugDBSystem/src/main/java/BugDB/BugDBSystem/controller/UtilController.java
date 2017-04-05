package BugDB.BugDBSystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import BugDB.BugDBSystem.domain.Component;
import BugDB.BugDBSystem.domain.Os;
import BugDB.BugDBSystem.domain.Product;
import BugDB.BugDBSystem.domain.Severity;
import BugDB.BugDBSystem.domain.Status;
import BugDB.BugDBSystem.service.UtilService;
@Controller
@RequestMapping("/")
public class UtilController {
	
	@Autowired
	private UtilService utilservice;

	@RequestMapping(value ="findAllComponent",method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String findAllComponent(HttpServletRequest request) {		
		List<Component> result=utilservice.findAllComponent();
		Gson gson=new Gson();
		return gson.toJson(result);
		}
	
//	@RequestMapping(value ="findAllOs",method = RequestMethod.GET)
//	@Transactional(readOnly = true)
//	public @ResponseBody String findAllos(HttpServletRequest request) {		
//		List<Os> result=utilservice.findAllOs();
//		Gson gson=new Gson();
//		return gson.toJson(result);
//		}
	
	@RequestMapping(value ="findAllOs",method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String findAllOs(HttpServletRequest request) {		
		List<Os> result=utilservice.findAllOs();
		Gson gson=new Gson();
		return gson.toJson(result);
		}
	
	@RequestMapping(value ="findAllProduct",method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String findAllProduct(HttpServletRequest request) {		
		List<Product> result=utilservice.findAllProduct();
		Gson gson=new Gson();
		return gson.toJson(result);
		}
	
	@RequestMapping(value ="findAllSeverity",method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String findAllSeverity(HttpServletRequest request) {		
		List<Severity> result=utilservice.findAllSeverity();
		Gson gson=new Gson();
		return gson.toJson(result);
		}
	
	@RequestMapping(value ="findAllStatus",method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String findAllStatus(HttpServletRequest request) {		
		List<Status> result=utilservice.findAllStatus();
		Gson gson=new Gson();
		return gson.toJson(result);
		}
	}
