package com.qkl.ztysl.api.service.user.api;

import java.util.Date;
import java.util.Map;

import com.qkl.ztysl.api.po.user.User;
import com.qkl.ztysl.api.po.user.UserDetail;
import com.qkl.ztysl.api.po.user.UserFriendship;
import com.qkl.ztysl.api.po.user.UserLevelcnt;

public interface UserDetailService {

	
	public UserDetail findUserDetail(String userCode,String versionNo);
}
