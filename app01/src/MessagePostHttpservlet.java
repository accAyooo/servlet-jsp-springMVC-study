import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Desc:
 *
 * @author shixiangyu
 * @date 2018/2/11
 */

@WebServlet(name = "MessagePostHttpservlet",
        urlPatterns = "/messagepost"
    )
public class MessagePostHttpservlet extends HttpServlet {
    private static final long serialversionUID = 54L;
    private static final String TITLE = "Order Form";


}
