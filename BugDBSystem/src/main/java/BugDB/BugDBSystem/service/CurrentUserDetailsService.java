package BugDB.BugDBSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import BugDB.BugDBSystem.domain.CurrentUser;
import BugDB.BugDBSystem.domain.User;


@Service
public class CurrentUserDetailsService implements UserDetailsService {

	    @Autowired
	    private UserService userService;

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
