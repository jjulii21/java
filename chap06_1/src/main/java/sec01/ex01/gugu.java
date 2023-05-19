package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugu")
public class gugu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("이닛이닛");
	}

	public void destroy() {
		System.out.println("뿌셔뿌셔");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		//getParameter() 이용하여 태그의 name속성 값으로 전송된 value값을 받아 변수에 저장한다.
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html; charset=utf-8");//1
				
				//응답에 써내려갈 내용을 담는 객체 생성
				PrintWriter output = response.getWriter(); //2
				
				String nn = request.getParameter("num");
				int gugu = Integer.parseInt(nn);
				
				String data = "<html>";
				
				data += "<style>"
						+ "table{"
						+ "border-top : 1px solid black;"
						+ "border-bottom : 1px solid black;"
						+ "width : 300px;"
						+ "height : 500px;"
						+ "border-collapse: collapse;"
						+ "}"
						+ "th, td{"
						+ "text-align : center;"
						+ "}"
						+ "tbody tr:nth-child(2n) {"
						+ "background-color: skyblue;"
						+ "}"
						+ "tbody tr:nth-child(2n+1) {"
						+ "background-color: pink;"
						+ "}"
						+ "</style>";
				
				
				data += "<body>";
				data += "<table>";
				data += "<th colspan=\"2\">";
				data += +gugu+"단";
				data += "</th>";
				
				
				for (int i = 1; i < 10; i++) {
					data += "<tr>";
					data += "<td>";
					data += gugu + "*" + i;
					data += "</td>";
					data += "<td>";
					data += gugu*i;
					data += "</td>";
					data += "</tr>";
				}
				data += "</table>";
				data += "</body>";
				data += "</html>";
				
				output.print(data);
				
		
	}

}
