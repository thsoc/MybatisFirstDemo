package cn.com.mybatis.handlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import cn.com.mybatis.po.tryhandler.GenderEnum;

public class gender implements TypeHandler<String>{

	@Override
	public String getResult(ResultSet arg0, String arg1) throws SQLException {
		int g = arg0.getInt(arg1);
		String name = GenderEnum.valueOf(g).name();
		return name;
	}

	@Override
	public String getResult(ResultSet arg0, int arg1) throws SQLException {
		int g = arg0.getInt(arg1);
		String name = GenderEnum.valueOf(g).name();
		return name;
	}

	@Override
	public String getResult(CallableStatement arg0, int arg1)
			throws SQLException {
		int g = arg0.getInt(arg1);
		String name = GenderEnum.valueOf(g).name();
		return name;
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, String arg2,
			JdbcType arg3) throws SQLException {
		int t = 0;
		GenderEnum[] values = GenderEnum.values();
		for (GenderEnum genderEnum : values) {
			if(genderEnum.name().equals(arg2)){
				t = genderEnum.getCode();
				break;
			}
		}
		arg0.setInt(arg1, t);
	}
}
