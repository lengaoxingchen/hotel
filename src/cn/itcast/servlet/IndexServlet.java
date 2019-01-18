package cn.itcast.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.entity.DinnerTable;

public class IndexServlet extends BaseServlet {

	// 1. 前台首页：显示所有未预定的餐桌
	public Object listTable(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 保存跳转资源(转发/重定向)
		Object uri = null;
		// 查询所有未预定餐桌
		List<DinnerTable> list = dinnerTableService.findNoUseTable();
		// 保存到request
		request.setAttribute("listDinnerTable", list);
		// 跳转到首页显示
		uri = request.getRequestDispatcher("/app/index.jsp");
		return uri;

		// 跳转
		// WebUtils.goTo(request, response, uri);
	}

}
