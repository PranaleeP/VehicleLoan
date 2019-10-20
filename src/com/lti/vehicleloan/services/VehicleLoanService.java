package com.lti.vehicleloan.services;

import javax.servlet.http.HttpServletRequest;

import com.lti.vehicleloan.beans.Register;
import com.lti.vehicleloan.exceptions.VehicleLoanException;


public interface VehicleLoanService {
	public boolean getEligibility(HttpServletRequest request)throws VehicleLoanException;
	//public Register registerUser(Register reg) throws VehicleLoanException;
	public Register addUser(HttpServletRequest request) throws VehicleLoanException;
	public boolean loginuser(HttpServletRequest request) throws VehicleLoanException;
}
