package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet {
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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");//1
		
		//응답에 써내려갈 내용을 담는 객체 생성
		PrintWriter output = response.getWriter(); //2
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
		
		String data = "<html>";
		data += "<body>";
		data += "아이디" + user_id;
		data += "비밀번호" + user_pwd;
		data += "</body>";
		data += "</html>";
		
		output.print(data);
		
		
		
		
	}

}
