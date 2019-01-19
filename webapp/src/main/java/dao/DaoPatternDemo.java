package dao;

import java.sql.Connection;
import java.sql.SQLException;

import factory.SQLHelperFactory;

public class DaoPatternDemo {
	   public static void main(String[] args) {
		try {	   
			Connection connection = SQLHelperFactory.connect();
	      AgentDao agentDao = new AgentDaoImpl();
	      //
	      //Create table  Student
	      agentDao.createTableStudent(connection);
	      
	      //Insert student 
	      agentDao.insertStudent(new Agent(1,"Michael"), connection);
	      agentDao.insertStudent(new Agent(2,"Richard"), connection);
	      agentDao.insertStudent(new Agent(3,"Jonhson"), connection);
	      agentDao.insertStudent(new Agent(4,"Susan"), connection);
	      agentDao.insertStudent(new Agent(5,"Quang"), connection);
	      agentDao.insertStudent(new Agent(6,"VX"), connection);
	      agentDao.insertStudent(new Agent(7,"CVS"), connection);

	      //update student
	      Student student = new Student(3, "Smith");
	      studentDao.updateStudent(student, connection);
	      
	      //delete student
	      studentDao.deleteStudent(2, connection);

	      //get the student
	      studentDao.getStudent(1, connection);
	      
	      //get all students
	      studentDao.getAllStudents(connection);
	      
	      //delete student 
	      studentDao.deleteStudents(connection);
	      
	      //Drop table student

	      studentDao.dropTableStudent(connection);
	  	   connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

	}