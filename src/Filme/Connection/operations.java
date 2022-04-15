package Filme.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class operations {
public static boolean islogin(String username,String password, JFrame frame){
	try {
		
		Connection mycon=connection.getconnection();
		String query="SELECT id from users where nume='"+username+"'AND parola='"+password+"'";
	
		PreparedStatement ps=mycon.prepareStatement(query);
		ResultSet rs= ps.executeQuery();
		while(rs.next())
		{
			login.id=rs.getInt("id");
	         return true;
		}
	}catch(Exception e)
	{
		JOptionPane.showMessageDialog(frame, "error: "+e.getMessage());
	}
	return false;
	
}

}
