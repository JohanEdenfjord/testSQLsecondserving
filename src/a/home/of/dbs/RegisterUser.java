package a.home.of.dbs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		Users user = new Users();
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");  
        
        
        //getting the strings i want to pass to the next action
        String fName = request.getParameter("fname");                                  
        String lName = request.getParameter("lname");
        String uName = request.getParameter("uname");
        String password = request.getParameter("password");
		
        //storing information to the bean so we can use it in the next action
        
        user.setFirstName(fName);
        user.setLastName(lName);
		user.setUserName(uName);
		user.setPassword(password);
		
		//making the instance that will register the user.
		UserDao ud = new UserDao();
		
		//register!! magic! wohoo.
		ud.registerUser(user);
		
		
	}

}
