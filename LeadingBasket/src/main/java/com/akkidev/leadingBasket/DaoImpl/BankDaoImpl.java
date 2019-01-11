package com.akkidev.leadingBasket.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.BankDao;
import com.akkidev.leadingBasket.entities.bank_charge;
import com.akkidev.leadingBasket.entities.bank_master;
import com.akkidev.leadingBasket.entities.loan_subcategory;

@Service
@Transactional
public class BankDaoImpl implements BankDao {

	@Autowired
	EntityManager em;

	@Override
	public long getBankCount() {
		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery<Long> cq = qb.createQuery(Long.class);
		cq.select(qb.count(cq.from(bank_master.class)));
		return em.createQuery(cq).getSingleResult();
	}

	@Override
	public List<bank_master> getAllBanks() {
		return null;
	}

	@Override
	public bank_master getBankByName(String name) {

		return null;
	}

	public List<bank_charge> getAllBankWithCharge(int loan_id) {

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<bank_charge> query = cb.createQuery(bank_charge.class);
		Root<bank_charge> banks = query.from(bank_charge.class);
		Join<bank_charge, loan_subcategory> loanJoin = banks.join("ls");
		Join<bank_charge, bank_master> bankJoin = banks.join("bm");
		loanJoin.on(cb.equal(loanJoin.get("id"), loan_id));
		return em.createQuery(query).getResultList();
	}

}
