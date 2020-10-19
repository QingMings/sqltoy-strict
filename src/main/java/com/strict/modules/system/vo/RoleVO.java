/**
 *@Generated by sagacity-quickvo 4.16
 */
package com.strict.modules.system.vo;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;

/**
 * @project sqltoy-strict
 * @version 1.0.0
 * ,Remark:角色  
 */
@ApiModel(value="RoleVO",description="角色")
public class RoleVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3122255420244986306L;
	
/*---begin-auto-generate-don't-update-this-area--*/	
	/**
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	private String roleId;
	
	/**
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	private String roleName;
	
	/**
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	private String createBy;
	
	/**
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	private LocalDateTime createTime;
	
	/**
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	private String updateBy;
	
	/**
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	private LocalDateTime updateTime;
	
	/**
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	private Integer delflag;
	
	
	/**
	 *@param roleId the roleId to set
	 */
	public RoleVO setRoleId(String roleId) {
		this.roleId=roleId;
		return this;
	}
		
	/**
	 *@return the RoleId
	 */
	public String getRoleId() {
	    return this.roleId;
	}
	
	/**
	 *@param roleName the roleName to set
	 */
	public RoleVO setRoleName(String roleName) {
		this.roleName=roleName;
		return this;
	}
		
	/**
	 *@return the RoleName
	 */
	public String getRoleName() {
	    return this.roleName;
	}
	
	/**
	 *@param createBy the createBy to set
	 */
	public RoleVO setCreateBy(String createBy) {
		this.createBy=createBy;
		return this;
	}
		
	/**
	 *@return the CreateBy
	 */
	public String getCreateBy() {
	    return this.createBy;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public RoleVO setCreateTime(LocalDateTime createTime) {
		this.createTime=createTime;
		return this;
	}
		
	/**
	 *@return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
	    return this.createTime;
	}
	
	/**
	 *@param updateBy the updateBy to set
	 */
	public RoleVO setUpdateBy(String updateBy) {
		this.updateBy=updateBy;
		return this;
	}
		
	/**
	 *@return the UpdateBy
	 */
	public String getUpdateBy() {
	    return this.updateBy;
	}
	
	/**
	 *@param updateTime the updateTime to set
	 */
	public RoleVO setUpdateTime(LocalDateTime updateTime) {
		this.updateTime=updateTime;
		return this;
	}
		
	/**
	 *@return the UpdateTime
	 */
	public LocalDateTime getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 *@param delflag the delflag to set
	 */
	public RoleVO setDelflag(Integer delflag) {
		this.delflag=delflag;
		return this;
	}
		
	/**
	 *@return the Delflag
	 */
	public Integer getDelflag() {
	    return this.delflag;
	}
/*---end-auto-generate-don't-update-this-area--*/	
}