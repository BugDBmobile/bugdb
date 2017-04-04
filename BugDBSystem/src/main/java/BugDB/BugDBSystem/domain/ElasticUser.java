package BugDB.BugDBSystem.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "user", type = "user", shards = 1, replicas = 0, refreshInterval = "-1")
public class ElasticUser {
	@Id
	private Long id;
	private String userName;
	private String password;
	private String email;
	private String guid;
	private String role;

	public ElasticUser() {
	}

	public ElasticUser(String userName, String password, String email, String guid, String role) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.guid = guid;
        this.role = role;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
