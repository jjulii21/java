package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logins")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; // 놔둬도 되고 지워도 되고...

	public void init(ServletConfig config) throws ServletException {
		System.out.println("이닛이닛");
	}

	public void destroy() {
		System.out.println("뿌셔뿌셔");
	}
	
	//HttpServletRequest request : 웹 브라우저에서 전송한 정보를 톰캣에 넘겨주는 역할
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//getParameter() 이용하여 태그의 name속성 값으로 전송된 value값을 받아 변수에 저장한다.
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
		System.out.println(user_id + user_pwd);
	}

}
