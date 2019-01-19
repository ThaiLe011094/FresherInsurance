package dao;

import java.util.List;
import java.sql.Connection;

public interface AgentDao {
	public List<Agent> getAllAgents(Connection conn);
	public Agent getAgent(int rollNo, Connection conn);
	public void insertAgent(Agent Agent, Connection conn);
	public void updateAgent(Agent Agent, Connection conn);
	public void deleteAgent(int agentId, Connection conn);
	public void deleteAgents(Connection conn);
	public void createTableAgent(Connection conn);
	public void dropTableAgent(Connection conn); 
}