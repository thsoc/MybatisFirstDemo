package cn.com.mybatis.dao;

import cn.com.mybatis.po.Customer;

public interface CustomerMapper {
	public Customer findCustomerByid(int id);
}
