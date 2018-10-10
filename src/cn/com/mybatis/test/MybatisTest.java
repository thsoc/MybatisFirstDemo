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
	 * 普通查询
	 * @throws IOException
	 */
//	@Test
//	public void TestSelect() throws IOException{
//		SqlSession sqlSession = dataConn.getSqlSession();
//		User user = sqlSession.selectOne("test.findUserById", 1);
//		System.out.println("姓名:"+user.getUsername()); 
//        System.out.println("性别:"+user.getGender()); 
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println("生日:"+sdf.format(user.getBirthday())); 
//        System.out.println("所在地:"+user.getProvince()+user.getCity()); 
//        
////        List<Object> selectList = sqlSession.selectList("test.findUserByUsernameEqual", user.getUsername());
//        sqlSession.close();
//	}
	 
	/**
	 * 模糊查询
	 * 多条数据
	 * @throws IOException
	 */
//	@Test
//	public void TestFuzzySearch() throws IOException{
//		SqlSession sqlSession = dataConn.getSqlSession();
//		List<User> userList = sqlSession.selectList("test.findUserByUsername", "丽");
//		for (int i = 0; i < userList.size(); i++) {  
//            User u=userList.get(i);  
//            System.out.println("姓名:"+u.getUsername()); 
//            System.out.println("性别:"+u.getGender()); 
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            System.out.println("生日:"+sdf.format(u.getBirthday())); 
//            System.out.println("所在地:"+u.getProvince()+u.getCity()); 
//        }
//		sqlSession.close();
//	}
	
	/**
	 * 插入数据
	 * @throws IOException
	 * @throws ParseException
	 */
	@Test
	public void TestInsert() throws IOException, ParseException{
		SqlSession sqlSession = dataConn.getSqlSession();
		List<Object> selectList = sqlSession.selectList("test.findUserByUsernameEqual", "张三");
		User user = new User();
		user.setUsername("张三");
		user.setGender("男");
		user.setPassword("5555");
		user.setEmail("5555@126.com");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		user.setBirthday(sdf.parse("1991-02-16"));
		user.setProvince("湖北省");
		user.setCity("武汉市");
        sqlSession.insert("test.insertUserTwo",user); 
        System.out.println(user.getId());
        
        
        //id查询 
		List<Object> selectList1 = sqlSession.selectList("test.findUserByUsernameEqual", "张三");
        sqlSession.close();
        
//        User user1 = sqlSession.selectOne("test.findUserById", user.getId());
//        System.out.println("姓名:"+user1.getUsername());
        
//		sqlSession.commit();//提交事物，不提交事物，数据没有新增，但是主键还是会自增
//		sqlSession.close();
//		SqlSession sqlSession2 = dataConn.getSqlSession();
//		User user2 = new User();
//		user2.setId(user.getId());
//		user2.setUsername("张三3");
//		sqlSession2.update("test.updateUserName", user2);
//		sqlSession2.commit();
//		sqlSession2.close();
		
//		SqlSession sqlSession2 = dataConn.getSqlSession();
        
//		User user2 = new User();
//		user2.setId(user.getId());
//		user2.setUsername("张三");
//		sqlSession.update("test.updateUserName", user2);
		
//		sqlSession.delete("test.deleteUser", user.getId());
	}
	
	/**
	 * 删除用户
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
//		user.setUsername("孙俪1");
//		sqlSession.update("test.updateUserName", user);
//		sqlSession.commit();
//		sqlSession.close();
//	}
	
//	@Test  
//	public void testfindCustomerAndProducts() throws Exception{  
//	      
//		SqlSession sqlSession=dataConn.getSqlSession();    
//	      
//	    //调用userMapper的方法，获取所有用户信息(以及从属批次信息)  
//		List<Customer> customerList=sqlSession.selectList("findUserAndProducts");
//	    if(customerList!=null){
//	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	    	Customer customer = null;
//	    	for (int i = 0; i < customerList.size(); i++) {
//	    		customer = customerList.get(i);
//	    		//1.获取用户基本信息
//		    	System.out.println("卡号为"+customer.getAcno()+"的名为"
//	    				+customer.getUsername()+"的客户:");
//		    	//2.获取用户下的所有批次订单信息
//		    	List<Batch> batchList=customer.getBatchList();
//		    	Batch batch = null;
//		    	for (int j = 0; j < batchList.size(); j++) {
//		    		batch = batchList.get(j);
//		    		System.out.println("于"
//		    				+sdf.format(batch.getCreatetime())+"采购了批次号为"
//		    				+batch.getNumber()+"的一批理财产品，详情如下：");
//		    		//3.获取一个批次的明细
//		    		List<BatchDetail> batchDetails = batch.getBatchDetails();
//		    		BatchDetail batchDetail = null;
//		    		FinacialProduct finacialProduct = null;
//		    		for (int k = 0; k < batchDetails.size(); k++) {
//	    				batchDetail = batchDetails.get(k);
//	    				System.out.println("id为"+batchDetail.getProduct_id()
//	    						+"的理财产品"+batchDetail.getProduct_num()+"份。");
//	    				//4.获取每个批次明细中的理财产品详细信息
//	    				finacialProduct = batchDetail.getFinacialProduct();
//	    				System.out.println("该理财产品的详细信息为：\n"
//	    						+"产品名称:"+finacialProduct.getName()
//	    						+"|产品价格:"+finacialProduct.getPrice()
//	    						+"|产品简介:"+finacialProduct.getDetail());
//		    		}	
//		    	}
//		    	System.out.println("**************************************");
//	    	}
//	    	
//	    }
//	    sqlSession.close();
//	} 
	
}
