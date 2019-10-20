package com.lti.vehicleloan.services;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.vehicleloan.beans.Register;
import com.lti.vehicleloan.daos.RegisterDao;
import com.lti.vehicleloan.exceptions.VehicleLoanException;

@Service("vehicleLoanService")
@ Transactional(propagation=Propagation.REQUIRES_NEW)
public class VehicleLoanServiceImpl implements VehicleLoanService{
	
	//VehicleLoanServiceImpl impl = new VehicleLoanService();
	@Autowired
	private RegisterDao dao;

	@Override
	public boolean getEligibility(HttpServletRequest request) throws VehicleLoanException {
		double totalEmi = 0;
		double price=Double.parseDouble(request.getParameter("showroomPrice"));
		double annualIncome=Double.parseDouble(request.getParameter("annualSalary"));
		double existingEmi=Double.parseDouble(request.getParameter("existingEmi"));
		int age=Integer.parseInt(request.getParameter("age"));
		if(age >= 21 && age <= 65)
		{	
			annualIncome = annualIncome - (existingEmi*12); //Annual Salary after deduction of existing EMI
			totalEmi = annualIncome * 0.43 * 7; //Maximum EMI to be allowed is 43% of the salary
			if(price < totalEmi)
			{
				System.out.println("Print Eligible");
				return true;
			}
		}
		return false;
	}

	/*@Override
	public Register registerUser(Register reg) throws VehicleLoanException {
		return dao.registerUser(reg);

	}*/

	@Override
	public Register addUser(HttpServletRequest request) throws VehicleLoanException {
	
		String userName=request.getParameter("userName");
		String fName=request.getParameter("firstName");
		String lName=request.getParameter("lastName");
		long phoneNo=Long.parseLong(request.getParameter("phoneNo"));
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String securityQ=request.getParameter("sq");
		System.out.println(securityQ);
		String securityA=request.getParameter("answer");
		
		Register reg = new Register();
		reg.setUserName(userName);
		reg.setFirstName(fName);
		reg.setLastName(lName);
		reg.setPhoneNo(phoneNo);
		reg.setEmail(email);
		reg.setPassword(password);
		reg.setSeqQuestion(securityQ);
		reg.setAnswer(securityA);
		
		//return registerUser(reg);
		return dao.registerUser(reg);
	}

	@Override
	public  boolean loginuser(HttpServletRequest request) throws VehicleLoanException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		
		/*String[] credentials = new String[2];
		credentials[0] =userName;
		credentials[1] =password;*/
		
		boolean status =dao.verifyUser(userName, password);
		if(status) {
		return true;
		}else {
			return false;
		}
	}
	
		
	}


