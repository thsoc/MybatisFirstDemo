package cn.com.mybatis.test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.tryhandler.TryHandlerDetail;

public class TryHandlerTest {
	private DataConnection dataConnection = new DataConnection();
	
	@Test
	public void findForTestHandler() throws IOException{
		SqlSession sqlSession = dataConnection.getSqlSession();
		List<TryHandlerDetail> selectList = sqlSession.selectList("tryHandler.selectByHCode","ÄÐ");
		for (TryHandlerDetail tryHandlerDetail : selectList) {
			System.out.println(tryHandlerDetail.getId());
		}
	}
}
