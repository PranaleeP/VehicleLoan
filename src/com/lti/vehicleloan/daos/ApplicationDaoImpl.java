package com.lti.vehicleloan.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lti.vehicleloan.beans.PersonalDetails;
import com.lti.vehicleloan.exceptions.VehicleLoanException;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class ApplicationDaoImpl implements ApplicationDao{

	@PersistenceContext	
	private EntityManager manager;
	
	
}
