package project.service.impl;

import java.sql.Connection;

import project.entity.impl.Credit;
import project.persistence.impl.CreditDAOImpl;
import project.service.CreditService;

public class CreditServiceImpl implements CreditService {
	
	private CreditDAOImpl dao;
	
	public CreditServiceImpl(Connection con) {
		super();
		dao = new CreditDAOImpl(con);
	}

	@Override
	public void insert(Credit credit) {	
		dao.insert(credit);
	}

	@Override
	public void update(Credit credit) {
		dao.update(credit);
	}

}
