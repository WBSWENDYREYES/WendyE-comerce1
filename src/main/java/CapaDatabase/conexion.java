package CapaDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
	
	public Connection conectar() {
		Connection dbconect = null;
		
		try
		{
	    Class.forName("net.sourceForge.jdbc.SqlServerDriver");

	     dbconect = DriverManager.getConnection("jdbc:jtds:sqlserver://wreyes-pc01;DatabaseName=bsEcomerce01;user=sa;password=Jabroca23");
 
	     return dbconect;	
		}catch(Exception ex) {
          
          }
		
		return dbconect;
}
	
}