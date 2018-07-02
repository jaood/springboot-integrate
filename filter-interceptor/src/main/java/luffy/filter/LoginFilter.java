package luffy.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @description 登录过滤器
 * @fiel luffy.filter.LoginFilter
 * @author Jimmy
 * @date 2018-07-02 15:40:00
 */

//@WebFilter(urlPatterns = "/*") 单个Filter使用这个注解即可
public class LoginFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("自定义过滤器->doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
