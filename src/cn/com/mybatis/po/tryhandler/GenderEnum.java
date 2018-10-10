package cn.com.mybatis.po.tryhandler;

public enum GenderEnum {
	F(1), U(2);

	private int code;

	GenderEnum(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static GenderEnum valueOf(int value) {
		switch (value) {
		case 1:
			return F;
		case 2:
			return U;
		default:
			return U;
		}
	}
}
