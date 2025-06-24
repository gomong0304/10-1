package core;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FlowServlet
 */
@WebServlet("/FlowServlet") // url 생성
public class FlowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	public void init(ServletConfig config) throws ServletException {
		// was(톰캣 시작시 초기화 코드)
		System.out.println("init() 메서드 호출"); // 브라우저가 아닌 콘솔에 출력
		System.out.println("실무에서는 ojdbc 1,2단계 용");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// was(톰캣 종료 전에 실행 코드)
		System.out.println("destroy() 메서드 호출");
		System.out.println("실무에서는 ojdbc 5단계 용");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 모든 요청시 처리
		System.out.println("service() 메서드 호출");
		System.out.println("실무에서는 ojdbc 3,4단계 용");
	}

}
