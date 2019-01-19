package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentDaoImpl implements AgentDao {

	// list is working as a database
	List<Agent> Agents;

	public void deleteAgent(int agentId, Connection conn) {
		String tableSQL = "DELETE Agent where agentId = ?";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(tableSQL);

			preparedStatement.setInt(1, agentId);
			// execute insert SQL statement
			preparedStatement.executeUpdate();

			System.out.println("Record Agent with agentId = " + String.valueOf(agentId) + " is deleted!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	public List<Agent> getAllAgents(Connection conn) {
	   List<Agent> Agents = new ArrayList<Agent>();
	   String selectSQL = "SELECT agentId, name FROM Agent";

	   try {
		   PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
		   ResultSet rs = preparedStatement.executeQuery();
		   while (rs.next()) {
			   int agentId = rs.getInt("agentId");
			   String agentName = rs.getString("agentName");
			   String agentAddress = rs.getString("agentAddress");
			   String agentPhone = rs.getString("agentPhone");
			   Agent Agent = new Agent(agentName, agentAddress, agentPhone); 
			   Agents.add(Agent);
		   }
		   for(Agent Agent : Agents)
			System.out.println("Record agentId = "  + ", agentName = " + Agent.getAgentName());
			
	   }
	   catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	   }
	   return Agents;
   }

	public Agent getAgent(int agentId, Connection conn) {
		Agent Agent = null;
		String selectSQL = "SELECT agentId, name FROM Agent WHERE agentId = ?";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setInt(1, agentId);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				String agentName = rs.getString("agentName");
				String agentAddress = rs.getString("agentAddress");
				String agentPhone = rs.getString("agentPhone");
				Agent = new Agent(agentName, agentAddress, agentPhone);
			}
			System.out.println("Record agentId = " + String.valueOf(agentId) + ", agentName = " + Agent.getAgentName());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Agent;
	}

	public void updateAgent(Agent Agent, Connection conn) {
		String tableSQL = "UPDATE Agent set agentName = ? where agentId = ?";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(tableSQL);
			preparedStatement.setString(1, Agent.getAgentName());
			// execute insert SQL statement
			preparedStatement.executeUpdate();

			System.out.println("Record agentId = " + ", agentName = " + Agent.getAgentName()
					+ " is updated into Agent table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}
	}

	public void insertAgent(Agent Agent, Connection conn) {
		String tableSQL = "INSERT INTO Agent" + "(agentId, agentName) VALUES" + "(?,?)";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(tableSQL);
			preparedStatement.setString(2, Agent.getAgentName());
			// execute insert SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record agentId = " + ", agentName = " + Agent.getAgentName()
					+ " is inserted into Agent table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	public void deleteAgents(Connection conn) {
		String tableSQL = "DELETE Agent";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(tableSQL);

			// execute insert SQL statement
			preparedStatement.executeUpdate();

			System.out.println("All Record of Agents are deleted!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	public void createTableAgent(Connection conn) {
		String tableSQL = "CREATE table Agent (agentId int, agentName varchar(100))";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(tableSQL);

			// execute insert SQL statement
			preparedStatement.executeUpdate();
			System.out.println("Table Agents are created!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	public void dropTableAgent(Connection conn) {
		String tableSQL = "Drop table Agent";

		try {
			PreparedStatement preparedStatement = conn.prepareStatement(tableSQL);

			// execute insert SQL statement
			preparedStatement.executeUpdate();

			System.out.println("Table Agents are dropped!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}
}
