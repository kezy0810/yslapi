package com.qkl.ztysl.api.po.sys;

import java.io.Serializable;
import java.util.Date;

public class SysOauth implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 授权id
	 */
	protected String id;
	/**
	 * 用户id
	 */
	protected Integer userId;
	/**
	 * 访问令牌
	 */
	protected String accessToken;
	/**
	 * 刷新令牌
	 */
	protected String refreshToken;
	/**
	 * 有效期(以秒为单位)
	 */
	protected String expireIn;
	/**
	 * 创建时间
	 */
	protected Date createTime;

	public SysOauth() {

	}

	/**
	 * 获取授权id
	 * 
	 * @return 授权id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置授权id
	 * 
	 * @param id
	 *            授权id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取用户id
	 * 
	 * @return 用户id
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 设置用户id
	 * 
	 * @param userId
	 *            用户id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 获取访问令牌
	 * 
	 * @return 访问令牌
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * 设置访问令牌
	 * 
	 * @param accessToken
	 *            访问令牌
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * 获取刷新令牌
	 * 
	 * @return 刷新令牌
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * 设置刷新令牌
	 * 
	 * @param refreshToken
	 *            刷新令牌
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	/**
	 * 获取有效期(以秒为单位)
	 * 
	 * @return 有效期(以秒为单位)
	 */
	public String getExpireIn() {
		return expireIn;
	}

	/**
	 * 设置有效期(以秒为单位)
	 * 
	 * @param expireIn
	 *            有效期(以秒为单位)
	 */
	public void setExpireIn(String expireIn) {
		this.expireIn = expireIn;
	}

	/**
	 * 获取创建时间
	 * 
	 * @return 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public static class OauthBuilder {

		private SysOauth oauth = new SysOauth();

		public OauthBuilder withId(String id) {
			oauth.setId(id);
			return this;
		}

		public OauthBuilder withUserId(Integer userId) {
			oauth.setUserId(userId);
			return this;
		}

		public OauthBuilder withAccessToken(String accessToken) {
			oauth.setAccessToken(accessToken);
			return this;
		}

		public OauthBuilder withRefreshToken(String refreshToken) {
			oauth.setRefreshToken(refreshToken);
			return this;
		}

		public OauthBuilder withExpirein(String expireIn) {
			oauth.setExpireIn(expireIn);
			return this;
		}

		public OauthBuilder withCreateTime(Date createTime) {
			oauth.setCreateTime(createTime);
			return this;
		}

		public SysOauth build() {
			return oauth;
		}
	}
}
