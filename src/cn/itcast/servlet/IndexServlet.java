package cn.itcast.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.entity.DinnerTable;

public class IndexServlet extends BaseServlet {

	// 1. ǰ̨��ҳ����ʾ����δԤ���Ĳ���
	public Object listTable(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ������ת��Դ(ת��/�ض���)
		Object uri = null;
		// ��ѯ����δԤ������
		List<DinnerTable> list = dinnerTableService.findNoUseTable();
		// ���浽request
		request.setAttribute("listDinnerTable", list);
		// ��ת����ҳ��ʾ
		uri = request.getRequestDispatcher("/app/index.jsp");
		return uri;

		// ��ת
		// WebUtils.goTo(request, response, uri);
	}

}
