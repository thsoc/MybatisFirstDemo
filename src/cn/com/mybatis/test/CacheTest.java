package cn.com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.com.mybatis.dao.CustomerMapper;
import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.Customer;

public class CacheTest {
	private DataConnection datacon = new DataConnection();
	/**
	 * һ������
	 * @author mazg
	 * @throws IOException
	 */
	@Test
	public void testFindCustomerCache1() throws IOException{
		SqlSession sqlSession = datacon.getSqlSession();
		Customer customer1 = sqlSession.selectOne("cache.findCustomerByid", 1);
		System.out.println("�û�����1��"+customer1.getUsername());
		
		Customer customer2 = sqlSession.selectOne("cache.findCustomerByid", 1);
		System.out.println("�û�����1��"+customer2.getUsername());
	}
	
	/**
	 * ��������
	 * @author mazg
	 * @throws IOException
	 */
	@Test
	public void testFindCustomerOnMapper2() throws IOException{
		SqlSession sqlSession = datacon.getSqlSession();
		CustomerMapper mapper1 = sqlSession.getMapper(CustomerMapper.class);
		Customer customer1 = mapper1.findCustomerByid(1);
		System.out.println("�û�����2��"+customer1.getUsername());
		
		CustomerMapper mapper2 = sqlSession.getMapper(CustomerMapper.class);
		Customer customer2 = mapper2.findCustomerByid(1);
		System.out.println("�û�����2��"+customer2.getUsername());
		
	}
	
	/**
	 * ����Ķ������棨��ͬSqlSessionFactory����ͬSqlSession������ʵ���ǲ�ѯ������
	 * @author mazg
	 * @throws IOException
	 */
	@Test
	public void testFindCustomerOnMapper3() throws IOException{
		SqlSession sqlSession1 = datacon.getSqlSession();
		CustomerMapper mapper1 = sqlSession1.getMapper(CustomerMapper.class);
		Customer customer1 = mapper1.findCustomerByid(1);
		System.out.println("�û�����3��"+customer1.getUsername());
		
		SqlSession sqlSession2 = datacon.getSqlSession();
		CustomerMapper mapper2 = sqlSession2.getMapper(CustomerMapper.class);
		Customer customer2 = mapper2.findCustomerByid(1);
		System.out.println("�û�����3��"+customer2.getUsername());
	}
	
	/**
	 * ����Ķ������棨ͬһ��SqlSessionFactory����ͬSqlSession������ʵ���ǲ�ѯ������
	 * @author mazg
	 * @throws IOException
	 */
	@Test
	public void testFindCustomerOnMapper4() throws IOException{
		String resource = "SqlMapConfig.xml";   
		SqlSessionFactory sqlSessionFactory;
		SqlSession sqlSession1;
		SqlSession sqlSession2;
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//�����Ự����������Mybatis�����ļ���Ϣ
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession1 = sqlSessionFactory.openSession();
		
		CustomerMapper mapper1 = sqlSession1.getMapper(CustomerMapper.class);
		Customer customer1 = mapper1.findCustomerByid(1);
		System.out.println("�û�����4��"+customer1.getUsername());
		
		sqlSession2 = sqlSessionFactory.openSession();
		CustomerMapper mapper2 = sqlSession2.getMapper(CustomerMapper.class);
		Customer customer2 = mapper2.findCustomerByid(1);
		System.out.println("�û�����4��"+customer2.getUsername());
	}
	
}
