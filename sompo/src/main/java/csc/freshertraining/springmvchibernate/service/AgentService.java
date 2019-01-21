package csc.freshertraining.springmvchibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import csc.freshertraining.springmvchibernate.dao.AgentDAO;
import csc.freshertraining.springmvchibernate.entities.Agent;

@Service
@Transactional
public class AgentService {

	@Autowired
	private AgentDAO agentDAO;

	public List<Agent> findAll() {
		return agentDAO.findAll();
	}

	public Agent findById(final int agentId) {
		return agentDAO.findById(agentId);
	}

	public void save(final Agent agent) {
		agentDAO.save(agent);
	}

	public void update(final Agent agent) {
		agentDAO.update(agent);
	}

	public void delete(final int agentId) {
		Agent agent = agentDAO.findById(agentId);
		if (agent != null) {
			agentDAO.delete(agent);
		}
	}
}
