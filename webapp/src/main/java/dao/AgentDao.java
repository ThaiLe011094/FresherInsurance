package dao;

import java.util.List;

import model.Agent;

public interface AgentDao {

	/**
	 * This is the method to be used to create a record in the Student table.
	 */
	public void create(Agent agent);

	/**
	 * This is the method to be used to list down a record from the Student
	 * table corresponding to a passed student id.
	 */
	public Agent getAgent(Integer id);

	/**
	 * This is the method to be used to list down all the records from the
	 * Student table.
	 */
	public List<Agent> listAgent();

	/**
	 * This is the method to be used to delete a record from the Student table
	 * corresponding to a passed student id.
	 */
	public void delete(Integer id);

	/**
	 * This is the method to be used to update a record into the Student table.
	 */
	public void update(Agent agent);
}
