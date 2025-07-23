package com.tka.p4jspDatabase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.Model_Entity.User;

@Controller						// .html file content
public class webController {

	@GetMapping("/")
	public String getIndexPage() {
		return "index";		// .jsp file
	}
	
	@GetMapping("/get-registerPage")
	public String getRegisterPage() {
		return "userRegForm";
	}
	
	@PostMapping("/insert-user")
	public String insertUser(@ModelAttribute User user) {
		System.out.println("User obj > " + user);
		return "welcome";
	}
	
	@GetMapping("/get-user")
	public String getUser(Model model) {
		// get User data from database
		User user = new User();
		user.setUserName("Roy");
		user.setPassword("124");
		String msg = "User MSG Controller";
		model.addAttribute("pgm", msg);
		model.addAttribute("userObj", user);
		// send {user} from javaController to jsp
		return "userDetails";		// path :static / home.html
	}
	
	@GetMapping("/get-allUser")
	public String getAllUser(Model model) {
		// get all User data from d/b
		List<User> userList = new ArrayList<>();
		userList.add(new User("Rahul", "333"));
		userList.add(new User("Mirza", "666"));
		userList.add(new User("Kabir", "999"));
		userList.add(new User("Prem", "444"));		
		model.addAttribute("userList", userList);
		// send {userList} from javaController to jsp
		return "allUserDetails";	// path :static / home.html
	}
	
	
}
