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
        //����userMapper�ķ�������ȡ���ж�����Ϣ(δ���ع������û���Ϣ)  
      	List<BatchItem> batchItemList=sqlSession.selectList("lazy.findBatchUserLazyLoading"); 
      	BatchItem batchItem = null;
      	Customer customer = null;
        for (int i = 0; i < batchItemList.size(); i++) {  
        	batchItem = batchItemList.get(i);  
        	System.out.println("������ţ�"+batchItem.getNumber());
            //ִ��getCustomerʱ�Ż�ȥ��ѯ�û���Ϣ������ʵ�����ӳټ���  
        	customer=batchItem.getCustomer();  
            System.out.println("�����û�����:"+customer.getUsername());  
        }  
        sqlSession.close();
    } 
}
