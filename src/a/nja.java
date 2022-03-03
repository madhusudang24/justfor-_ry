package a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class nja extends GenericServlet
{
	static {
		
		System.out.println("entered static block");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
			/*PrintWriter pr = arg1.getWriter();
			pr.write("<html><body><h1>welcome to</h1></body></html>");
			pr.flush();
			pr.close();*/
	}

}
