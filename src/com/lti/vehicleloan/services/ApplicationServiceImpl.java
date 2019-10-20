package com.lti.vehicleloan.services;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.vehicleloan.beans.PersonalDetails;
import com.lti.vehicleloan.daos.ApplicationDao;
import com.lti.vehicleloan.exceptions.VehicleLoanException;

@Service
@ Transactional(propagation=Propagation.REQUIRES_NEW)
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationDao pd;
	
	

	
	
}
