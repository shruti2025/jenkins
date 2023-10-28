package velloremaven;
import java.util.ResourceBundle;
public class App {
	public int login(String userid, String pwd)
	{
		ResourceBundle rb = new ResourceBundle.getBundle("config") ;
		String user = rb.getString("username");
		String pass = rb.getString("password");
		
		if (userid.equals(user) && pwd.equals(pass))
			return 1;
		else
			return 0;	
	}
}