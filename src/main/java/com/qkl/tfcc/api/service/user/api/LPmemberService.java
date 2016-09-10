package com.qkl.tfcc.api.service.user.api;

import java.util.List;

import com.qkl.tfcc.api.entity.Page;
import com.qkl.util.help.pager.PageData;

public interface LPmemberService {

	
	public long findLPmemberNum(String userCode);
	
	
	public List<PageData> findLPmemberInfo(Page page);
	
}
