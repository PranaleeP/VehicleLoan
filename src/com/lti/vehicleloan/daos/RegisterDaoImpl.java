package com.lti.vehicleloan.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.lti.vehicleloan.beans.Register;
import com.lti.vehicleloan.exceptions.VehicleLoanException;

@Repository
@Transactional(propagation=Propagation.REQUIRED)
public class RegisterDaoImpl implements RegisterDao{

	@PersistenceContext	
	private EntityManager manager;
	
	@Override
	public Register registerUser(Register reg) throws VehicleLoanException {
		System.out.println(reg);
		manager.persist(reg);
		return reg;
		
	}

	@Override
	public boolean verifyUser(String name, String pass) throws VehicleLoanException {
		//Query qry = manager.createQuery("from Register");
		//List<Employees> empList=qry.getResultList();
		//List<Register> userList = qry.getResultList();
		Register reg =manager.find(Register.class, name);
		System.out.println(reg);
		String password =reg.getPassword();
		System.out.println(password);
		if(pass.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

}
