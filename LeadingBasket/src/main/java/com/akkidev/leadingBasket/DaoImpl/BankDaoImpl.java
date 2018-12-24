package com.akkidev.leadingBasket.DaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.BankDao;

@Service
@Transactional
public class BankDaoImpl implements BankDao {

	
	@Autowired
	EntityManager em;
	
	@Override
	public long getBankCount() {
		
		Query query = em.createQuery("SELECT count(*) FROM bank_master");
		long count = (long) query.getSingleResult();
		return count;
	}

}
