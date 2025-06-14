package in.ashokit.entity;

import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
 private Integer userId;
	private String uname;
	private String country ;
	private  String gender;
	private Integer age;
}
	