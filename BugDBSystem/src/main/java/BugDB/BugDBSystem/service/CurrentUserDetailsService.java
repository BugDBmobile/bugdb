package BugDB.BugDBSystem.service;

import BugDB.BugDBSystem.domain.CurrentUser;
import BugDB.BugDBSystem.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CurrentUserDetailsService implements UserDetailsService {

	    @Autowired
	    private IUserService userService;

	    public CurrentUser loadUserByUsername(String name) throws UsernameNotFoundException {
	        //Person user = personService.findByName(name).orElseThrow(() -> new UsernameNotFoundException(String.format("User with email=%s was not found", name)));
	    	User user = null;
			try {
				user = userService.findByUserName(name);
			} catch (UsernameNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	    	
	    	return new CurrentUser(user);
	    }
}
