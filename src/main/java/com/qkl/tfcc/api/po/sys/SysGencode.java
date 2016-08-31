package com.qkl.tfcc.api.po.sys;

import java.io.Serializable;

public class SysGencode implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6865438125826824033L;
	/**
	 * id
	 */
	private java.lang.Integer id;	
	
	private java.lang.String  groupId;
	
	private java.lang.String  groupCode;
	
	private java.lang.String  groupNode;
	
	private java.lang.String  codeValue;
	
	private java.lang.String  codeName;
	
	private java.lang.String description;
	
	private java.lang.String  readonly;

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	
	

	public java.lang.String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(java.lang.String groupCode) {
		this.groupCode = groupCode;
	}

	public java.lang.String getGroupNode() {
		return groupNode;
	}

	public void setGroupNode(java.lang.String groupNode) {
		this.groupNode = groupNode;
	}

	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getGroupId() {
		return groupId;
	}

	public void setGroupId(java.lang.String groupId) {
		this.groupId = groupId;
	}

	public java.lang.String getCodeValue() {
		return codeValue;
	}

	public void setCodeValue(java.lang.String codeValue) {
		this.codeValue = codeValue;
	}

	public java.lang.String getCodeName() {
		return codeName;
	}

	public void setCodeName(java.lang.String codeName) {
		this.codeName = codeName;
	}

	public java.lang.String getReadonly() {
		return readonly;
	}

	public void setReadonly(java.lang.String readonly) {
		this.readonly = readonly;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeName == null) ? 0 : codeName.hashCode());
		result = prime * result
				+ ((codeValue == null) ? 0 : codeValue.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((groupCode == null) ? 0 : groupCode.hashCode());
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result
				+ ((groupNode == null) ? 0 : groupNode.hashCode());
		result = prime * result
				+ ((readonly == null) ? 0 : readonly.hashCode());
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
		SysGencode other = (SysGencode) obj;
		if (codeName == null) {
			if (other.codeName != null)
				return false;
		} else if (!codeName.equals(other.codeName))
			return false;
		if (codeValue == null) {
			if (other.codeValue != null)
				return false;
		} else if (!codeValue.equals(other.codeValue))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (groupCode == null) {
			if (other.groupCode != null)
				return false;
		} else if (!groupCode.equals(other.groupCode))
			return false;
		if (groupId == null) {
			if (other.groupId != null)
				return false;
		} else if (!groupId.equals(other.groupId))
			return false;
		if (groupNode == null) {
			if (other.groupNode != null)
				return false;
		} else if (!groupNode.equals(other.groupNode))
			return false;
		if (readonly == null) {
			if (other.readonly != null)
				return false;
		} else if (!readonly.equals(other.readonly))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SysGencode [groupId=");
		builder.append(groupId);
		builder.append(", groupCode=");
		builder.append(groupCode);
		builder.append(", groupNode=");
		builder.append(groupNode);
		builder.append(", codeValue=");
		builder.append(codeValue);
		builder.append(", codeName=");
		builder.append(codeName);
		builder.append(", description=");
		builder.append(description);
		builder.append(", readonly=");
		builder.append(readonly);
		builder.append("]");
		return builder.toString();
	}

	
	

	
	
	
	
	
	
	
	
}
