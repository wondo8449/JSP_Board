package com.example.app;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Excute {
	public Result excute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServerException;
}
