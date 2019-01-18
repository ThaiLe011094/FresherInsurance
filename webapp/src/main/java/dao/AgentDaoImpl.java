package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import model.Agent;

@Repository
public class AgentDaoImpl implements AgentDao {
	
	private SessionFactory sessionFactory;

//	@Override
	public void create(Agent agent) {
		Session session = getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(agent);
        tx.commit();
        session.close();
	}

	@Override
	public Agent getAgent(Integer id) {
		Session session = getSessionFactory().openSession();
		Agent agent = (Agent) session.get(Agent.class, id);
		session.close();
		return agent;
	}

	@Override
	public List<Agent> listAgent() {
		Session session = getSessionFactory().openSession();
        List<Agent> list = session.createQuery("from Agent").list();
        session.close();
        return list;
	}

	@Override
	public void delete(Integer id) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Agent agent = (Agent) session.get(Agent.class, id);
		session.delete(agent);
		tx.commit();
		session.close();
	}

	@Override
	public void update(Agent agent) {
		Session session = getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(agent);;
		tx.commit();
		session.close();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
