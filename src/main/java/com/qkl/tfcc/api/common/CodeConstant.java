package com.qkl.tfcc.api.common;

public interface CodeConstant {

	/**
	 * 通信成功通用码
	 */
	public final short SC_OK = 0;
	
	/**
	 * 通信失败通用码
	 */
	public final short SC_UNKNOWN = -1;
	
	/**
	 * 未登录未验证通过
	 */
	public final short UNLOGIN = -2;
	
	/**
	 * 查询失败
	 */
	public final short UNCHECK = -3;
	
	/**
	 * 提交失败
	 */
	public final short SUBMITERR = -4;
	
	/**
	 * 登录失败
	 */
	public final short LOGIN_FAILED = -5;
	
	/**
	 * 账号冻结
	 */
	public final short ERROR_FREEZE = -6;
	
	/**
	 * 用户在黑名单
	 */
	public final short ERROR_BLACK = -7;
	
	
	//超出登陆次数
	public final short ERROR_LIMIT = -8;
	
	/**
	 * 重复提交
	 */
	public final short ERROR_RESUBMITE = -9;
	
	/**
	 * 非法操作
	 */
	public final short WRONG_INPUT = -10;

	
	/**
	 * 短信验证码超时
	 */
	public final short SMS_OVERTIME = -12;
	
	/**
	 * 短信验证码匹配错误
	 */
	public final short SMS_ERROR = -13;
	
	/**
     * 短信验证码获取失败
     */
    public final short SMS_GET_ERROR = -14;
    
    /**
     * 传递参数有误
     */
    public final short PARAM_ERROR = -15;
    /**
     * 3次校验机会已用完，请明天再尝试！
     */
    public final short SMS_NUM_MAX = -16;
    
	/**
	 * 短信验证码为空
	 */
	public final short SMS_NULL = -17;
	
	
	/**
	 * 用户不存在
	 */
	public final short USER__NOTEXISTS=-18;
	
	
	/**
	 * 手机号为空
	 */
	public final short MOBILE_NULL = -19;
	
	/**
	 * 手机号已注册
	 */
	public final short MOBILE_EXISTS = -20;
	/**
	 * 用户名或密码错误
	 */
	public final short USERNAMEORPWD_ERROR = -21;
	
	/**
	 * 银行卡号已被使用
	 */
	public final short BANK_EXISTS = -22;
	/**
	 * 用户昵称已经存在
	 */
	public final short NICKNAME_EXISTS = -23;
	/**
	 * 用户手机号不存在
	 */
	public final short USERMOBILE_NOEXISTS=-24;
	/**
	 * 获取验证码手机号不是用户手机号
	 */
	public final short NOT_USERMOBILE = -25;
	/**
	 * JSON文件没有更新
	 */
	public final short NOT_UPDATEFILE = -26;
	
	/**
	 * 支付密码未设置
	 */
	public final short PAY_CODE_EMPTY = -27;
	
	/**
	 * 支付密码已经设置
	 */
	public final short PAY_CODE_EXIST = -28;
	
	/**
	 * 支付密码错误
	 */
	public final short PAY_CODE_ERROR = -29;
	
	/**
	 * 支付密码为空或者两次输入不一致
	 */
	public final short PAY_CODE_NULL = -30;

	
	/**
	 * 支付密码错误次数已达上限
	 */
	public final short  PAY_CODE_MAX =-31;		
	/**
	 * 手机号格式错误
	 */
	public final short  MOBILE_ERROR =-32;		
	
}
