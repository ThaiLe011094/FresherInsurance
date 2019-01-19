package factory;

import java.sql.Connection;
import java.sql.DriverManager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MSSQLDAOHelperImpl implements SQLHelper {
	private static final Logger LOGGER = LoggerFactory.getLogger(MSSQLDAOHelperImpl.class);
	  public Connection getConnection() {
		  Config config = new Config();
		  Connection conn = null;
          try {
			//Class.forName(config.getDriver());
        	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	  
			String urlString = "jdbc:sqlserver://" + config.getServer() + ":" + config.getPort() +";databaseName=" +  config.getDatabase();
			conn =  DriverManager.getConnection(urlString, config.getUserId(), config.getPassword());
          }
          catch (Exception e) {
			// TODO Auto-generated catch block
        	  LOGGER.info("Error:" + e.getMessage());
          } 
        return conn;
	  }

}
