package com.lti.vehicleloan.controllers;

import java.sql.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.vehicleloan.beans.Register;
import com.lti.vehicleloan.exceptions.VehicleLoanException;
import com.lti.vehicleloan.services.ApplicationService;
import com.lti.vehicleloan.services.ApplicationServiceImpl;
import com.lti.vehicleloan.services.VehicleLoanService;
import com.lti.vehicleloan.services.VehicleLoanServiceImpl;


@Controller
public class VehicleLoanController {
	
	@Resource
	private VehicleLoanService services= new VehicleLoanServiceImpl();
	
	@Resource
	private ApplicationService service= new ApplicationServiceImpl();

	@RequestMapping("/home")
	public String getHomePage() 
	{
		return "Home";
	}
	@RequestMapping("/checkE")
	public String getcheckPage() 
	{
		return "CheckEligibility";
	}
	
	@RequestMapping("/checkEligibility")
	public String getEligibility(HttpServletRequest request) {
		try {
			boolean status =services.getEligibility(request);
			if(status)
			{
				return "SuccessInsert";
			}
			
		} catch (VehicleLoanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Home";
	}
	
	@RequestMapping("/registerPage")
	public String getRegisterPage() 
	{
		return "Register";
	}
	@RequestMapping("/login")
	public String LoginPage() 
	{
		return "Login";
	}
	@RequestMapping("/register")
	public  String registerUser(HttpServletRequest request) {

		try {
			services.addUser(request);
		} catch (VehicleLoanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Login";
	}
	
	@RequestMapping("/rlogin")
	public  String loginUser(HttpServletRequest request) {
        
			try {
				boolean verify=services.loginuser(request);
				if(verify)
				{
					return "AppForm1";
				}
			} catch (VehicleLoanException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
         return "Home";
	}

	/*@RequestMapping("/appform1")
	public  String addPDetails(HttpServletRequest request) {
		try {
			service.addDetails(request);
		} catch (VehicleLoanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Home";
	}*/
	}

