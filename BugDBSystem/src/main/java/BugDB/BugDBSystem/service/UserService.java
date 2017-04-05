package BugDB.BugDBSystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BugDB.BugDBSystem.domain.User;
import BugDB.BugDBSystem.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository ur;
	
	@Transactional
	public User save(User user){
		return ur.save(user);
	}
	
	@Transactional
	public List<User> findAll(){
		return ur.findAll();
	}
	
	@Transactional
	public void delete(User user){
		this.ur.delete(user);
	}
	@Transactional
	public User findByUserName(String name){
		return ur.findByUserName(name);
	}
	
	@Transactional
	public User findById(int id){
		return ur.findById(id);
	}

}
