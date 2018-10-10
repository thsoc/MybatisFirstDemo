package cn.com.mybatis.test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.Batch;
import cn.com.mybatis.po.BatchDetail;
import cn.com.mybatis.po.Customer;
import cn.com.mybatis.po.FinacialProduct;
import cn.com.mybatis.po.User;

public class MybatisTest {
	public DataConnection dataConn = new DataConnection();
	
	/**
	 * ��ͨ��ѯ
	 * @throws IOException
	 */
//	@Test
//	public void TestSelect() throws IOException{
//		SqlSession sqlSession = dataConn.getSqlSession();
//		User user = sqlSession.selectOne("test.findUserById", 1);
//		System.out.println("����:"+user.getUsername()); 
//        System.out.println("�Ա�:"+user.getGender()); 
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println("����:"+sdf.format(user.getBirthday())); 
//        System.out.println("���ڵ�:"+user.getProvince()+user.getCity()); 
//        
////        List<Object> selectList = sqlSession.selectList("test.findUserByUsernameEqual", user.getUsername());
//        sqlSession.close();
//	}
	 
	/**
	 * ģ����ѯ
	 * ��������
	 * @throws IOException
	 */
//	@Test
//	public void TestFuzzySearch() throws IOException{
//		SqlSession sqlSession = dataConn.getSqlSession();
//		List<User> userList = sqlSession.selectList("test.findUserByUsername", "��");
//		for (int i = 0; i < userList.size(); i++) {  
//            User u=userList.get(i);  
//            System.out.println("����:"+u.getUsername()); 
//            System.out.println("�Ա�:"+u.getGender()); 
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            System.out.println("����:"+sdf.format(u.getBirthday())); 
//            System.out.println("���ڵ�:"+u.getProvince()+u.getCity()); 
//        }
//		sqlSession.close();
//	}
	
	/**
	 * ��������
	 * @throws IOException
	 * @throws ParseException
	 */
	@Test
	public void TestInsert() throws IOException, ParseException{
		SqlSession sqlSession = dataConn.getSqlSession();
		List<Object> selectList = sqlSession.selectList("test.findUserByUsernameEqual", "����");
		User user = new User();
		user.setUsername("����");
		user.setGender("��");
		user.setPassword("5555");
		user.setEmail("5555@126.com");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		user.setBirthday(sdf.parse("1991-02-16"));
		user.setProvince("����ʡ");
		user.setCity("�人��");
        sqlSession.insert("test.insertUserTwo",user); 
        System.out.println(user.getId());
        
        
        //id��ѯ 
		List<Object> selectList1 = sqlSession.selectList("test.findUserByUsernameEqual", "����");
        sqlSession.close();
        
//        User user1 = sqlSession.selectOne("test.findUserById", user.getId());
//        System.out.println("����:"+user1.getUsername());
        
//		sqlSession.commit();//�ύ������ύ�������û�������������������ǻ�����
//		sqlSession.close();
//		SqlSession sqlSession2 = dataConn.getSqlSession();
//		User user2 = new User();
//		user2.setId(user.getId());
//		user2.setUsername("����3");
//		sqlSession2.update("test.updateUserName", user2);
//		sqlSession2.commit();
//		sqlSession2.close();
		
//		SqlSession sqlSession2 = dataConn.getSqlSession();
        
//		User user2 = new User();
//		user2.setId(user.getId());
//		user2.setUsername("����");
//		sqlSession.update("test.updateUserName", user2);
		
//		sqlSession.delete("test.deleteUser", user.getId());
	}
	
	/**
	 * ɾ���û�
	 * @throws IOException
	 */
//	@Test
//	public void TestDelete() throws IOException{
//		SqlSession sqlSession = dataConn.getSqlSession();
//		sqlSession.delete("test.deleteUser", 30);
//		sqlSession.commit();
//		sqlSession.close();
//	}
	
//	@Test
//	public void TestUpdate() throws IOException{
//		SqlSession sqlSession = dataConn.getSqlSession();
//		User user = new User();
//		user.setId(29);
//		user.setUsername("��ٳ1");
//		sqlSession.update("test.updateUserName", user);
//		sqlSession.commit();
//		sqlSession.close();
//	}
	
//	@Test  
//	public void testfindCustomerAndProducts() throws Exception{  
//	      
//		SqlSession sqlSession=dataConn.getSqlSession();    
//	      
//	    //����userMapper�ķ�������ȡ�����û���Ϣ(�Լ�����������Ϣ)  
//		List<Customer> customerList=sqlSession.selectList("findUserAndProducts");
//	    if(customerList!=null){
//	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	    	Customer customer = null;
//	    	for (int i = 0; i < customerList.size(); i++) {
//	    		customer = customerList.get(i);
//	    		//1.��ȡ�û�������Ϣ
//		    	System.out.println("����Ϊ"+customer.getAcno()+"����Ϊ"
//	    				+customer.getUsername()+"�Ŀͻ�:");
//		    	//2.��ȡ�û��µ��������ζ�����Ϣ
//		    	List<Batch> batchList=customer.getBatchList();
//		    	Batch batch = null;
//		    	for (int j = 0; j < batchList.size(); j++) {
//		    		batch = batchList.get(j);
//		    		System.out.println("��"
//		    				+sdf.format(batch.getCreatetime())+"�ɹ������κ�Ϊ"
//		    				+batch.getNumber()+"��һ����Ʋ�Ʒ���������£�");
//		    		//3.��ȡһ�����ε���ϸ
//		    		List<BatchDetail> batchDetails = batch.getBatchDetails();
//		    		BatchDetail batchDetail = null;
//		    		FinacialProduct finacialProduct = null;
//		    		for (int k = 0; k < batchDetails.size(); k++) {
//	    				batchDetail = batchDetails.get(k);
//	    				System.out.println("idΪ"+batchDetail.getProduct_id()
//	    						+"����Ʋ�Ʒ"+batchDetail.getProduct_num()+"�ݡ�");
//	    				//4.��ȡÿ��������ϸ�е���Ʋ�Ʒ��ϸ��Ϣ
//	    				finacialProduct = batchDetail.getFinacialProduct();
//	    				System.out.println("����Ʋ�Ʒ����ϸ��ϢΪ��\n"
//	    						+"��Ʒ����:"+finacialProduct.getName()
//	    						+"|��Ʒ�۸�:"+finacialProduct.getPrice()
//	    						+"|��Ʒ���:"+finacialProduct.getDetail());
//		    		}	
//		    	}
//		    	System.out.println("**************************************");
//	    	}
//	    	
//	    }
//	    sqlSession.close();
//	} 
	
}
