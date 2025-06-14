package in.ashokit.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import in.ashokit.entity.User;
import java.util.List;



public interface UserRepo extends JpaRepository<User,Integer>{

	public List<User>findByGender(String  gender);
	


}
