package csc.freshertraining.springmvchibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import csc.freshertraining.springmvchibernate.entities.Agent;

@Repository(value = "agentDAO")
@Transactional(rollbackFor = Exception.class)
public class AgentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(final Agent agent) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(agent);
	}

	public void update(final Agent agent) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(agent);
	}

	public Agent findById(final int agentId) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Agent.class, agentId);
	}

	public void delete(final Agent agent) {
		Session session = this.sessionFactory.getCurrentSession();
		session.remove(agent);
	}

	public List<Agent> findAll() {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Agent", Agent.class).getResultList();
	}
	
	public List<Agent> searchAll(String keywords) {
		String hql = "FROM Agent WHERE agentName LIKE :kw "
				+ "OR agentAddress LIKE :kw "
				+ "OR agentPhone LIKE :kw";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("kw", "%" + keywords + "%");
		List<Agent> list = query.list();
		return list;
	}
}
