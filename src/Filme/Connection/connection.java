package Filme.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
public static Connection getconnection() throws Exception {
	String root="jdbc:mysql://";
	String host="localhost:3306/";
	String name="filme";
	String url=root+host+name;
	String username="root";
    String password="root";
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection mycon=(Connection)DriverManager.getConnection(url,username,password);
    return mycon;
}


}
