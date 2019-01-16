package cn.itcast.utils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WebUtils {
    /**
     * 跳转的通用方法
     * 如果是String类型重定向,如果是RequestDispatcher转发
     */
    public static void goTo(HttpServletRequest request, HttpServletResponse response, Object uri)
            throws ServletException, IOException {
        if (uri instanceof RequestDispatcher){
            ((RequestDispatcher)uri).forward(request, response);
        } else if (uri instanceof String) {
            response.sendRedirect(request.getContextPath() + uri);
        }
    }
}
