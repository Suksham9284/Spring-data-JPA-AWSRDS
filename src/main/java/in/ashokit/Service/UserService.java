package in.ashokit.Service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.Repo.UserRepo;


@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    public void getUser() {
        Optional<User> byId = userRepo.findById(101);
        if (byId.isPresent()) {
            User user = byId.get();
            System.out.println(user);
        } else {
            System.out.println("User not found");
        }
    }

    public void getUsers() {
        Iterable<User> all = userRepo.findByGender("Male");  // corrected here
        all.forEach(System.out::println);
    }

    public void saveUser() {
        User u = new User();
        u.setUserId(101);
        u.setUname("Raju");
        u.setGender("Male");
        u.setCountry("India");
        u.setAge(25);
        userRepo.save(u);  // corrected here
        System.out.println("User inserted");
    }
}
