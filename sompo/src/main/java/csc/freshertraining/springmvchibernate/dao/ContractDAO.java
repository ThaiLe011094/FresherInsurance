package csc.freshertraining.springmvchibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import csc.freshertraining.springmvchibernate.entities.Agent;
import csc.freshertraining.springmvchibernate.entities.Contract;

@Repository(value = "contractDAO")
@Transactional(rollbackFor = Exception.class)
public class ContractDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(final Contract contract) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(contract);
	}

	public void update(final Contract contract) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(contract);
	}

	public Contract findById(final int contractId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Contract.class, contractId);
	}

	public void delete(final Contract contract) {
		Session session = this.sessionFactory.getCurrentSession();
		session.remove(contract);
	}

	public List<Contract> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Contract", Contract.class).getResultList();
	}
	
	public List<Contract> searchAll(String ckeywords) {
		String hql = "FROM Agent WHERE agentName LIKE :kw "
				+ "OR agentAddress LIKE :kw "
				+ "OR agentPhone LIKE :kw";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("kw", "%" + ckeywords + "%");
		List<Contract> clist = query.list();
		return clist;
	}
}
