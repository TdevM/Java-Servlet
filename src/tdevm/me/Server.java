package tdevm.me;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Tridev on 02-03-2017.
 */

// This doesn't work
public class Server extends HttpServlet {


    private String message;
    @Override
    public void init() throws ServletException {
        super.init();
        message = "Hello World";
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Hola</title>");
        printWriter.println("</head>");
        printWriter.println("<body bgcolor=\"white\">");
        printWriter.println("</body>");
        printWriter.println("</html>");

        printWriter.println("<h1>" + message + "</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
