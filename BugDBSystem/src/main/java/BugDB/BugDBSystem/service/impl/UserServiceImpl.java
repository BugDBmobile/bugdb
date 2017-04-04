package BugDB.BugDBSystem.service.impl;

import BugDB.BugDBSystem.domain.User;
import BugDB.BugDBSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;


public class UserServiceImpl {

	@Autowired
	private UserRepository ur;
	
	@Transactional
	public User save(User user){
		return ur.save(user);
	}
	
	public List<User> findAll(){
		return (List<User>) ur.findAll();
	}
	
	@Transactional
	public void delete(User user){
		this.ur.delete(user);
	}

	public User findByUserName(String name){
		return ur.findByUserName(name);
	}

}
