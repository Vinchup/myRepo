package com.java.ldap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@PostMapping("/ldapUserDetails")
	public ResponseEntity<String> userDetails(String username){
		
		UserDetails userDetails = new UserDetails();
		userDetails.setUsername(username);
		String password ="4567";
		
		if(username.equals("arpit1"))
				return ResponseEntity.ok().header("password", password).body(password);
			
			 else return ResponseEntity.badRequest().header("password", password).body(password);
	}
	
}
