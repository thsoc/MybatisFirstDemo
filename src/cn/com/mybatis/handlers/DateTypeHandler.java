package cn.com.mybatis.handlers;


import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class DateTypeHandler implements TypeHandler<String>{
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Override
	public String getResult(ResultSet resultset, String s) throws SQLException {
		Date date = resultset.getDate(s);
		String format = sdf.format(date);
		return format;
	}

	@Override
	public String getResult(ResultSet resultset, int i) throws SQLException {
		Date date = resultset.getDate(i);
		String format = sdf.format(date);
		return format;
	}

	@Override
	public String getResult(CallableStatement callablestatement, int i)
			throws SQLException {
		Date date = callablestatement.getDate(i);
		String format = sdf.format(date);
		return format;
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, String arg2,
			JdbcType arg3) throws SQLException {
		java.util.Date parse = null;
		try {
			parse = sdf.parse(arg2);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date date = new java.sql.Date(parse.getTime());  
		arg0.setDate(arg1, date);
	}
}
