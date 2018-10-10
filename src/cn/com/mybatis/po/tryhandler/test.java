package cn.com.mybatis.po.tryhandler;

public class test {
	public static void main(String[] args) {
		int code = GenderEnum.F.getCode();
		System.out.println(code);
		GenderEnum valueOf = GenderEnum.valueOf(3);
		System.out.println(valueOf.name());
	}
}
