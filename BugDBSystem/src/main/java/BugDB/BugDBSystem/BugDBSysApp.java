package BugDB.BugDBSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class BugDBSysApp{

	@Autowired

	public static void main(String[] args) throws Exception {

		System.setProperty("java.net.preferIPv4Stack", "true"); 
		SpringApplication.run(BugDBSysApp.class, args);
	}
}