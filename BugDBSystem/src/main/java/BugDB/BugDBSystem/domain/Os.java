package BugDB.BugDBSystem.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Os implements Serializable {
	@Id
	private Integer id;
	private String descripiton;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return descripiton;
	}
	public void setDescription(String descripiton) {
		this.descripiton = descripiton;
	}
	
}
