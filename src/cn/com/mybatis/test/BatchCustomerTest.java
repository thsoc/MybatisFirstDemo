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
//			System.out.println("����Ϊ"+batchCustomer.getAcno()
//					+"����Ϊ"+batchCustomer.getUsername()+"�Ŀͻ���\n��"
//					+sdf.format(batchCustomer.getCreatetime())+"�ɹ������κ�Ϊ"
//					+batchCustomer.getNumber()+"��һ����Ʋ�Ʒ");
//		}
//	}
	
//	@Test
//	public void testBatchCustomerTwo() throws IOException {
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchCustomer> batchCustomerList = sqlSession.selectList("test.findBatchCustomerTwo");
//		for (BatchCustomer batchCustomer : batchCustomerList) {
//			System.out.println("����Ϊ"+batchCustomer.getAcno()
//					+"����Ϊ"+batchCustomer.getUsername()+"�Ŀͻ���\n��"
//					+batchCustomer.getCreatetimeStr()+"�ɹ������κ�Ϊ"
//					+batchCustomer.getNumber()+"��һ����Ʋ�Ʒ");
//		}
//	}
	
//	@Test
//	public void testBatchCustomerToMap() throws IOException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchItem> batchItem = sqlSession.selectList("test.findBatchCustomerToMap");
//		for (BatchItem batchItem2 : batchItem) {
//			System.out.println("����Ϊ"+batchItem2.getCustomer().getAcno()
//					+"����Ϊ"+batchItem2.getCustomer().getUsername()+"�Ŀͻ���\n��"
//					+sdf.format(batchItem2.getCreatetime())+"�ɹ������κ�Ϊ"
//					+batchItem2.getNumber()+"��һ����Ʋ�Ʒ,�绰��"+batchItem2.getCustomer().getPhone());
//		}
//	}
	
//	@Test
//	public void testBatchCustomerToMapTwo() throws IOException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchItem> batchItem = sqlSession.selectList("test.findBatchCustomerToMapTwo");
//		for (BatchItem batchItem2 : batchItem) {
//			System.out.println("����Ϊ"+batchItem2.getCustomer().getAcno()
//					+"����Ϊ"+batchItem2.getCustomer().getUsername()+"�Ŀͻ���\n��"
//					+sdf.format(batchItem2.getCreatetime())+"�ɹ������κ�Ϊ"
//					+batchItem2.getNumber()+"��һ����Ʋ�Ʒ,�绰��"+batchItem2.getCustomer().getPhone());
//		}
//	}
//	@Test
//	public void testBatchCustomerToMapThree() throws IOException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SqlSession sqlSession = dataConnection.getSqlSession();
//		List<BatchItem> batchItem = sqlSession.selectList("test.findBatchCustomerThree");
//		for (BatchItem batchItem2 : batchItem) {
//			System.out.println("����Ϊ"+batchItem2.getCustomer().getAcno()
//					+"����Ϊ"+batchItem2.getCustomer().getUsername()+"�Ŀͻ���\n��"
//					+sdf.format(batchItem2.getCreatetime())+"�ɹ������κ�Ϊ"
//					+batchItem2.getNumber()+"��һ����Ʋ�Ʒ,�绰��"+batchItem2.getCustomer().getPhone());
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
//	    //����userMapper�ķ���  
//		List<BatchItem> batchItemList=sqlSession.selectList("findBatchAndBatchDetail");
//		for (BatchItem batchItem : batchItemList) {
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//	    	Customer customer = batchItem.getCustomer();//ȡ�������ε��û���Ϣ
//	    	//ȡ�������ζ�������Ʋ�Ʒ��Ϣ
//	    	List<BatchDetail> batchDetails = batchItem.getBatchDetails();
//    		System.out.println("����Ϊ"+customer.getAcno()+"����Ϊ"
//    				+customer.getUsername()+"�Ŀͻ�:\n��"
//    				+sdf.format(batchItem.getCreatetime())+"�ɹ������κ�Ϊ"
//    				+batchItem.getNumber()+"��һ����Ʋ�Ʒ���������£�");
//    		BatchDetail batchDetail = null;
//    		if(batchDetails!=null){
//    			for (int i = 0; i < batchDetails.size(); i++) {
//    				batchDetail = batchDetails.get(i);
//    				System.out.println("idΪ"+batchDetail.getProduct_id()
//    						+"����Ʋ�Ʒ"+batchDetail.getProduct_num()+"��");
//    			}
//        		
//    		}
//		}
//	    
//	    sqlSession.close();
//	}
	
	
}
