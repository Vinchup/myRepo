package com.in28minutes.springboot;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	CabRepo repo;
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping("/logout-success")
	public String logout() {
		return "logout";
	}
	
	@RequestMapping("/addCabBookinDetails")
	@ResponseBody
	public String addMyCabDetails(MyCab myCab) {
		
		repo.save(myCab);
		return "Details Added Successfully";
	}
	
	@RequestMapping("getCabBookinDetails")
		public String getBookingDetails() {
		
		return "BookingDetails";
	}
	
	@RequestMapping("getBookingDetails")
	public ModelAndView printBookingDetails(String phoneNo) throws ClientProtocolException,IOException{
		
		ModelAndView mv=new ModelAndView("PrintBookingDetails");
		MyCab myCab = repo.findByPhone(phoneNo);
		mv.addObject("obj",myCab);
		return mv;
	}
}
