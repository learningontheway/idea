package servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet implements Servlet {
    private ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
            //1.获取请求参数
            String username=servletRequest.getParameter("user");
            String password=servletRequest.getParameter("password");


            //2.获取当前web应用的初始化参数
            ServletContext servletContext=servletConfig.getServletContext();
            String inituser=servletContext.getInitParameter("user");
            String initpassword=servletContext.getInitParameter("password");

        PrintWriter out=servletResponse.getWriter();
            //3.比对
        if(initpassword.equals(password)&&inituser.equals(username)){
            out.println("Hello" +username);
        }else{
            out.println("sorry"+username);
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
