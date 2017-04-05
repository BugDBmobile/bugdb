package BugDB.BugDBSystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BugDB.BugDBSystem.domain.Updates;
import BugDB.BugDBSystem.domain.User;
import BugDB.BugDBSystem.repository.UpdatesRepository;
import BugDB.BugDBSystem.repository.UserRepository;


@Service
public class UpdatesService {
	@Autowired
	private UpdatesRepository ur;
	
	@Transactional
	public Updates save(Updates update){
		return ur.save(update);
	}
	
	@Transactional
	public List<Updates> findByBugId(int bugId){
		return ur.findByBugId(bugId);
	}

}
