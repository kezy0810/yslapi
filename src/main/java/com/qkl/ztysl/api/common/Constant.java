package com.qkl.ztysl.api.common;

import java.util.Date;
import com.qkl.util.help.DateUtil;

/**
 * 常量类
 * @Title: Constants.java 
 * @Package com.qkl.ztysl.api.common
 * @Description: 
 * @author kezhiyi   
 * @date 2020年10月07日 下午4:10:15 
 * @version V1.0
 */
public class Constant {
	
	public static final String SESSION_MANAGER = "user_name";
	public static final String OPERATIONS = "operations";
	public static final String MODULES = "modules";
	public static final int SUCCESS = 1;
	public static final int FAIL = 0;
	public static final String USING = "1";// 启用
	public static final int FORBIDDEN = 2;// 禁用
	public static final String LOGIN_USER = "loginUser";
	public static final String DEFAULT_PWD = "password";
	public static final int PAGE_SIZE = 20;
	public static final String CUR_SYS_CODE = "hjq";
	public static final String DELETE = "9";	
	public static final String ROLE_ID_LIST = "roleIdList";
	public static final String VERSION_NO = "1.0.0";
	public static final String LOCKED ="1";
	public static final String UN_LOCKED ="0";
	public static final Integer MAX_LIMIT =20;
	public static final Date  SYS_BUILDDATE =  DateUtil.getDateByString("2020-10-10");
	
	public static final int PIC_HEAD_HEIGHT = 122;//用户头像高
    public static final int PIC_HEAD_WIDTH = 122;//用户头像宽

    public static final String PIC_HEAD_PATH = "uploadfile/img/head/";//头像图片
    public static final String PIC_TEMP_PATH = "uploadtemp/img/head/";//头像图片临时文件路径
    public static final String DEVICE_HEAD_PATH = "uploadfile/img/device/";//设备截图
    public static final String DEVICE_TEMP_PATH = "uploadtemp/img/device/";//设备截图临时文件路径
    public static final String LIANZHONG_HEAD_PATH = "uploadfile/img/lianzhong/";//联众打码
    public static final String LIANZHONG_TEMP_PATH = "uploadtemp/img/lianzhong/";//联众打码临时文件路径
    public static final String PIC_QRCODE_PATH = "uploadfile/img/qrcode/";//二维码图片
}
