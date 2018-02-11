/**
 * Desc:
 *
 * @author shixiangyu
 * @date 2018/2/11
 */

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="GenericServletDemoServlet",
    urlPatterns = {"/generic"},
    initParams = {
        @WebInitParam(name = "admin", value = "shixiangyu"),
        @WebInitParam(name = "email", value = "773681606@qq.com")
    }
)
public class GenericServletDemoServlet extends GenericServlet{
    private static final long serialVersionUID = 625000890L;

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        String admin = servletConfig.getInitParameter("admin");
        String email = servletConfig.getInitParameter("email");
        servletResponse.setContentType("text/html");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.write("<h1>name:" + admin + ",email:" + email + "</h" +
                "1>");
    }
}
