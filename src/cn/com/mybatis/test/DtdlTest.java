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
		//��ȡmapper����
		CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
		Customer customer = mapper.findCustomerByid(1);
		System.out.println("�û�������"+customer.getUsername()+"|"+"������"+customer.getAcno());
		sqlSession.close();
	}
}
