package com.example.app.member;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.app.Excute;
import com.example.app.Result;
import com.example.app.member.dao.MemberDAO;

public class CheckIdController implements Excute{
	@Override
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException {
		String memberId = req.getParameter("memberId");
		MemberDAO memberDAO = new MemberDAO();
		resp.getWriter().print(memberDAO.checkId(memberId));
		return null;
	}
}
