package BugDB.BugDBSystem.service;

import BugDB.BugDBSystem.domain.User;


public interface IUserService {

    Iterable<User> findAll();

    User findByUserName(String name);

}
