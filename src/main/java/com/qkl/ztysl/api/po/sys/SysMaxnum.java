package com.qkl.ztysl.api.po.sys;

import java.io.Serializable;

public class SysMaxnum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7735583623137888477L;

	
	/**
	 * id
	 */
	private java.lang.Integer id;
	
	
	/**
	 * version
	 */
	private java.lang.Integer version;
	
	/**
	 * code
	 */
	private java.lang.Long code;
	
	/**
	 * notype
	 */
	private java.lang.String notype;
	
	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getVersion() {
		return version;
	}

	public void setVersion(java.lang.Integer version) {
		this.version = version;
	}

	public java.lang.Long getCode() {
		return code;
	}

	public void setCode(java.lang.Long code) {
		this.code = code;
	}

	public java.lang.String getNotype() {
		return notype;
	}

	public void setNotype(java.lang.String notype) {
		this.notype = notype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((notype == null) ? 0 : notype.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysMaxnum other = (SysMaxnum) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (notype == null) {
			if (other.notype != null)
				return false;
		} else if (!notype.equals(other.notype))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SysMaxnum [version=");
		builder.append(version);
		builder.append(", code=");
		builder.append(code);
		builder.append(", notype=");
		builder.append(notype);
		builder.append("]");
		return builder.toString();
	}



	
	
	
}
