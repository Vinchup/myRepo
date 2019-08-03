package com.in28minutes.springboot;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Myuser myuser = repo.findByUsername(username);
		
		if(myuser == null) {
			//Check whether user is present on LDAP server
			try {
				 myuser = getUserFromLdap(username);
				 if(myuser == null) {
					 throw new UsernameNotFoundException("User 404"); 
				 }
			} catch (IOException e) {
				throw new UsernameNotFoundException("User 404");
			}
		}
		return new UserPrincipal(myuser);
	}
	
	public Myuser getUserFromLdap(String username) throws ClientProtocolException,IOException{
		
		Myuser user = new Myuser();
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost("http://localhost:9090/ldapUserDetails"+"?username="+username);
		CloseableHttpResponse response = client.execute(httpPost);
		Header header = response.getFirstHeader("password");
		String password = header.getValue();
		int statusCode = response.getStatusLine().getStatusCode();
		
		switch(statusCode) {
		case 200 : user.setUsername(username);
				   user.setPassword(password);
				   break;	   
		}
		System.out.println(statusCode);
		
		return user;
	}
}
	