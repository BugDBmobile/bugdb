package BugDB.BugDBSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import BugDB.BugDBSystem.domain.User;


public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
	@Query("select p from User p where userName = ?")
	public User findByUserName(String name);
	
	@Query("select u from User u where id = ?")
	public User findById(int id);
}
