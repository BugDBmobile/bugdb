package BugDB.BugDBSystem.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import BugDB.BugDBSystem.domain.Bug;
import BugDB.BugDBSystem.domain.Updates;
import BugDB.BugDBSystem.service.BugServiceDB;
import BugDB.BugDBSystem.service.UpdatesService;
import BugDB.BugDBSystem.service.UserService;
import BugDB.BugDBSystem.service.UtilService;
@Controller
@RequestMapping("/")
public class BugController {
	
	@Autowired
	private BugServiceDB bugservice;
	@Autowired
	private UpdatesService updateservice;
	@Autowired
	private UtilService utilservice;
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value ="findByBugNo",params = {"bugNo"}, method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String findByBugNo(HttpServletRequest request,@RequestParam int bugNo){
		Bug result=bugservice.findByBugNo(bugNo);
		Gson gson=new Gson();
		return gson.toJson(result);
	}
	

	@RequestMapping(value ="findByAssigned",params = {"userId"}, method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String findByAssigned(HttpServletRequest request,@RequestParam int userId){
		List<Bug> result=bugservice.findByAssigned(userId);
		Gson gson=new Gson();
		return gson.toJson(result);
	}
	
	@RequestMapping(value ="findByFiledBy",params = {"userId"}, method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String findByFiledBy(HttpServletRequest request,@RequestParam int userId){
		List<Bug> result=bugservice.findByAssigned(userId);
		Gson gson=new Gson();
		return gson.toJson(result);
	}
	
	@RequestMapping(value ="advancedSearch",params = {"productId","component","status","assigned","severity","tag","filedBy"}, method = RequestMethod.GET)
	@Transactional(readOnly = true)
	public @ResponseBody String advancedSearch(HttpServletRequest request,@RequestParam Integer productId,
			@RequestParam Integer component,@RequestParam Integer status,@RequestParam Integer assigned,
			@RequestParam Integer severity,@RequestParam String tag,@RequestParam Integer filedBy) {
		List<Bug> result=bugservice.findByCondition(productId,component,status,assigned,severity,tag,filedBy);
		Gson gson=new Gson();
		return gson.toJson(result);
	}
	
	@RequestMapping(value ="updateBug",params = {"status","assigned","product","subject","bugNo",
			"comments","userId"}, method = RequestMethod.GET)
	@Transactional
	public @ResponseBody String updateBug(HttpServletRequest request,@RequestParam Integer status,
			@RequestParam Integer assigned,@RequestParam Integer product,@RequestParam String subject,
			@RequestParam Integer bugNo,@RequestParam String comments,@RequestParam Integer userId) {
		
		
		//插入updates
		Bug bug=bugservice.findByBugNo(bugNo);
		Updates update=new Updates();
		update.setComments(comments);
		update.setBugId(bugNo);
		update.setUserId(userId);
		update.setTime(Timestamp.valueOf(LocalDateTime.now()));
		
		StringBuilder chg=new StringBuilder("");
		if(bug.getStatusId()!=status){chg.append("(CHG:status-").append(utilservice.findStatusById(bug.getBugNo()).getDescription())
			.append(" to ").append(utilservice.findStatusById(status).getDescription());}	
		if(bug.getAssigned()!=assigned){chg.append("(CHG:assigned-").append(userservice.findById(bug.getAssigned()).getUserName())
			.append(" to ").append(userservice.findById(assigned).getClass());}
		if(bug.getProductId()!=product){chg.append("CHG:product-").append(utilservice.findProductById(bug.getProductId()).getDescription())
			.append(" to ").append(utilservice.findProductById(product).getDescription());}
		
		update.setChg(chg.toString());
		Updates result2=updateservice.save(update);
		int result=bugservice.updateBug(status, assigned, product, subject, bugNo);
		
		Gson gson=new Gson();
		
		return result+"  "+gson.toJson(result2);
	}
	
}
