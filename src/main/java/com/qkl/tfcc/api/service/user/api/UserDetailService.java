package com.qkl.tfcc.api.service.user.api;

import java.util.Date;
import java.util.Map;

import com.qkl.tfcc.api.po.user.User;
import com.qkl.tfcc.api.po.user.UserDetail;
import com.qkl.tfcc.api.po.user.UserFriendship;
import com.qkl.tfcc.api.po.user.UserLevelcnt;

public interface UserDetailService {

	
	public UserDetail findUserDetail(String userCode,String versionNo);
}
