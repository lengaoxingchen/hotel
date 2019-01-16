package cn.itcast.servlet;

import cn.itcast.entity.DinnerTable;
import cn.itcast.factory.BeanFactory;
import cn.itcast.service.DinnerTableService;
import cn.itcast.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class IndexServlet extends BaseServlet {
    //创建service
    private DinnerTableService dinnerTableService = BeanFactory.getInstance("dinnerTableService", DinnerTableService.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //获取操作的类型
        String method = request.getParameter("method");
        //判断
        if (method == null) {
            method = "listTable";
        }
        if ("listTable".equals(method)) {
            //1.前台首页,显示所有未预定的餐桌
            listTable(request, response);
        }

    }

    /**
     * //1.前台首页,显示所有未预定的餐桌
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void listTable(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //保存跳转资源(转发/重定向)
        Object uri = null;
        try {
            //查询所有未预定餐桌
            List<DinnerTable> list = dinnerTableService.findNoUse();
            //保存到request中
            request.setAttribute("listDinnerTable", list);
            //跳转到首页显示
            uri = request.getRequestDispatcher("/app/index.jsp");
        } catch (Exception e) {
            uri = "error/error.jsp";
        }
        WebUtils.goTo(request, response, uri);
    }
}
