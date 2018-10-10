package cn.com.mybatis.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.datasource.DataConnection;
import cn.com.mybatis.po.BatchDetail;
import cn.com.mybatis.po.BatchItem;
import cn.com.mybatis.po.Customer;

/**
 * 
 * @author mazg
 *
 */
public class BatchCustomerTest {
	private DataConnection dataConnection = new DataConnection();
//	@Test
//	public void testBatchCustomer() throws IOException {
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		List<BatchCustomer> batchCustomerList = sqlSession.selectList("test.findBatchCustomer");
//		for (BatchCustomer batchCustomer : batchCustomerList) {
//			System.out.println("卡号为"+batchCustomer.getAcno()
//					+"的名为"+batchCustomer.getUsername()+"的客户：\n于"
//					+sdf.format(batchCustomer.getCreatetime())+"采购了批次号为"
//					+batchCustomer.getNumber()+"的一批理财产品");
//		}
//	}
	
//	@Test
//	public void testBatchCustomerTwo() throws IOException {
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchCustomer> batchCustomerList = sqlSession.selectList("test.findBatchCustomerTwo");
//		for (BatchCustomer batchCustomer : batchCustomerList) {
//			System.out.println("卡号为"+batchCustomer.getAcno()
//					+"的名为"+batchCustomer.getUsername()+"的客户：\n于"
//					+batchCustomer.getCreatetimeStr()+"采购了批次号为"
//					+batchCustomer.getNumber()+"的一批理财产品");
//		}
//	}
	
//	@Test
//	public void testBatchCustomerToMap() throws IOException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchItem> batchItem = sqlSession.selectList("test.findBatchCustomerToMap");
//		for (BatchItem batchItem2 : batchItem) {
//			System.out.println("卡号为"+batchItem2.getCustomer().getAcno()
//					+"的名为"+batchItem2.getCustomer().getUsername()+"的客户：\n于"
//					+sdf.format(batchItem2.getCreatetime())+"采购了批次号为"
//					+batchItem2.getNumber()+"的一批理财产品,电话是"+batchItem2.getCustomer().getPhone());
//		}
//	}
	
//	@Test
//	public void testBatchCustomerToMapTwo() throws IOException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchItem> batchItem = sqlSession.selectList("test.findBatchCustomerToMapTwo");
//		for (BatchItem batchItem2 : batchItem) {
//			System.out.println("卡号为"+batchItem2.getCustomer().getAcno()
//					+"的名为"+batchItem2.getCustomer().getUsername()+"的客户：\n于"
//					+sdf.format(batchItem2.getCreatetime())+"采购了批次号为"
//					+batchItem2.getNumber()+"的一批理财产品,电话是"+batchItem2.getCustomer().getPhone());
//		}
//	}
//	@Test
//	public void testBatchCustomerToMapThree() throws IOException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchItem> batchItem = sqlSession.selectList("test.findBatchCustomerThree");
//		for (BatchItem batchItem2 : batchItem) {
//			System.out.println("卡号为"+batchItem2.getCustomer().getAcno()
//					+"的名为"+batchItem2.getCustomer().getUsername()+"的客户：\n于"
//					+sdf.format(batchItem2.getCreatetime())+"采购了批次号为"
//					+batchItem2.getNumber()+"的一批理财产品,电话是"+batchItem2.getCustomer().getPhone());
//		}
//	}
//	@Test
//	public void testBatchCustomerToMapFour() throws IOException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchCustomer> batchItem = sqlSession.selectList("test.findBatchCustomerFour");
//	}
	
//	@Test  
//	public void testfindBatchAndBatchDetail() throws Exception{  
//	      
//		SqlSession sqlSession=dataConnection.getSqlSession();    
//	      
//	    //调用userMapper的方法  
//		List<BatchItem> batchItemList=sqlSession.selectList("findBatchAndBatchDetail");
//		for (BatchItem batchItem : batchItemList) {
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//	    	Customer customer = batchItem.getCustomer();//取出该批次的用户信息
//	    	//取出该批次订购的理财产品信息
//	    	List<BatchDetail> batchDetails = batchItem.getBatchDetails();
//    		System.out.println("卡号为"+customer.getAcno()+"的名为"
//    				+customer.getUsername()+"的客户:\n于"
//    				+sdf.format(batchItem.getCreatetime())+"采购了批次号为"
//    				+batchItem.getNumber()+"的一批理财产品，详情如下：");
//    		BatchDetail batchDetail = null;
//    		if(batchDetails!=null){
//    			for (int i = 0; i < batchDetails.size(); i++) {
//    				batchDetail = batchDetails.get(i);
//    				System.out.println("id为"+batchDetail.getProduct_id()
//    						+"的理财产品"+batchDetail.getProduct_num()+"份");
//    			}
//        		
//    		}
//		}
//	    
//	    sqlSession.close();
//	}
	
	
}
