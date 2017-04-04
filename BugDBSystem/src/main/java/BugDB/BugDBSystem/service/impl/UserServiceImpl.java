package BugDB.BugDBSystem.service.impl;

import BugDB.BugDBSystem.domain.User;
import BugDB.BugDBSystem.repository.UserRepository;
import BugDB.BugDBSystem.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository ur;


    @Override
    public Iterable<User> findAll() {
        return ur.findAll();
    }

    @Override
    public User findByUserName(String name) {
        return ur.findByUserName(name);
    }

}
