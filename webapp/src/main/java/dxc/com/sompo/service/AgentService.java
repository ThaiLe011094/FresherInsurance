package dxc.com.sompo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dxc.com.sompo.dao.AgentDao;
import dxc.com.sompo.entities.Agent;

@Service
@Transactional
public class AgentService {

	@Autowired
	private AgentDao agentDao;

	public List<Agent> findAll() {
		return agentDao.findAll();
	}

	public Agent findById(final int agentId) {
		return agentDao.findById(agentId);
	}

	public void save(final Agent agent) {
		agentDao.save(agent);
	}

	public void update(final Agent agent) {
		agentDao.update(agent);
	}

	public void delete(final int agentId) {
		Agent agent = agentDao.findById(agentId);
		if (agent != null) {
			agentDao.delete(agent);
		}
	}
}
