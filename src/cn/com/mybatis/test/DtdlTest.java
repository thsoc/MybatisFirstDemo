package cn.com.mybatis.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.dao.CustomerMapper;
import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.Customer;

public class DtdlTest {
	private DataConnection dataConn = new DataConnection();
	@Test
	public void testFindCustomerOnMapper() throws IOException{
		SqlSession sqlSession = dataConn.getSqlSession();
		//获取mapper代理
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
		Customer customer = mapper.findCustomerByid(1);
		System.out.println("用户姓名："+customer.getUsername()+"|"+"卡号是"+customer.getAcno());
		sqlSession.close();
	}
}
