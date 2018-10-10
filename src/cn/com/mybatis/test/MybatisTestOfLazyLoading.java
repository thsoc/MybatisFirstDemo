package cn.com.mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.BatchItem;
import cn.com.mybatis.po.Customer;

public class MybatisTestOfLazyLoading {
	private DataConnection dataConn = new DataConnection();
	@Test  
    public void testFindBatchCustomerLazyLoading() throws Exception{  
          
        SqlSession sqlSession=dataConn.getSqlSession();
        //调用userMapper的方法，获取所有订单信息(未加载关联的用户信息)  
      	List<BatchItem> batchItemList=sqlSession.selectList("lazy.findBatchUserLazyLoading"); 
      	BatchItem batchItem = null;
      	Customer customer = null;
        for (int i = 0; i < batchItemList.size(); i++) {  
        	batchItem = batchItemList.get(i);  
        	System.out.println("订单编号："+batchItem.getNumber());
            //执行getCustomer时才会去查询用户信息，这里实现了延迟加载  
        	customer=batchItem.getCustomer();  
            System.out.println("订购用户姓名:"+customer.getUsername());  
        }  
        sqlSession.close();
    } 
}
