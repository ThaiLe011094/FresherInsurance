package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleDAOHelperImpl implements SQLHelper {
	  private static final Logger LOGGER = LoggerFactory.getLogger(OracleDAOHelperImpl.class);
	  public Connection getConnection() {
		
		  Config config = new Config();
		  Connection conn = null;
	        try{
	        	String oracleDriver = config.getDriver();
	        	String server = config.getServer();
	        	String database = config.getDatabase();
	        	String port = config.getPort();
	        	String userName = config.getUserId();
	        	String password = config.getPassword();
	        	String urlstring = "jdbc:oracle:thin:@" +  server+ ":" + port + ":" + database;
	            Class.forName(oracleDriver);
	            conn = DriverManager.getConnection(urlstring, userName, password);
	        }catch(SQLException e){
	        	LOGGER.info("Error: " + e.getMessage());
	        }catch(ClassNotFoundException e){
	         	LOGGER.info("Error: " + e.getMessage());
	        }
        return conn;
	  }

}
