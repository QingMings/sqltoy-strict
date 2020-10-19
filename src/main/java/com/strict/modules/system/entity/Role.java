/**
 *@Generated by sagacity-quickvo 4.16
 */
package com.strict.modules.system.entity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import org.sagacity.sqltoy.callback.SelectFields;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;


/**
 * @project sqltoy-strict
 * @version 1.0.0
 * Table: SYS_ROLE,Remark:角色  
 */
@ApiModel(value="Role",description="角色")
@SqlToyEntity
@Entity(tableName="SYS_ROLE",pk_constraint="PRIMARY")
public class Role implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3122255420244986306L;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.DefaultIdGenerator")
	@Column(name="ROLE_ID",length=40L,type=java.sql.Types.VARCHAR,nullable=false)
	private String roleId;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="ROLE_NAME",length=512L,type=java.sql.Types.VARCHAR,nullable=false)
	private String roleName;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="CREATE_BY",length=40L,type=java.sql.Types.VARCHAR,nullable=false)
	private String createBy;
	
	/**
	 * jdbcType:DATETIME
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="CREATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	private LocalDateTime createTime;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="UPDATE_BY",length=40L,type=java.sql.Types.VARCHAR,nullable=false)
	private String updateBy;
	
	/**
	 * jdbcType:DATETIME
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="UPDATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	private LocalDateTime updateTime;
	
	/**
	 * jdbcType:DECIMAL
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="DELFLAG",length=1L,defaultValue="0",type=java.sql.Types.INTEGER,nullable=false)
	private Integer delflag;
	

	/** default constructor */
	public Role() {
	}
	
	/** pk constructor */
	public Role(String roleId)
	{
		this.roleId=roleId;
	}

	
	/**
	 *@param roleId the roleId to set
	 */
	public Role setRoleId(String roleId) {
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
	public Role setRoleName(String roleName) {
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
	public Role setCreateBy(String createBy) {
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
	public Role setCreateTime(LocalDateTime createTime) {
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
	public Role setUpdateBy(String updateBy) {
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
	public Role setUpdateTime(LocalDateTime updateTime) {
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
	public Role setDelflag(Integer delflag) {
		this.delflag=delflag;
		return this;
	}
		
	/**
	 *@return the Delflag
	 */
	public Integer getDelflag() {
	    return this.delflag;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("roleId=").append(getRoleId()).append("\n");
		columnsBuffer.append("roleName=").append(getRoleName()).append("\n");
		columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
		columnsBuffer.append("updateTime=").append(getUpdateTime()).append("\n");
		columnsBuffer.append("delflag=").append(getDelflag()).append("\n");
		return columnsBuffer.toString();
	}
	
	/**
	 * @TODO create entityQuery fields
	 */
	public static SelectFieldsImpl select() {
		return new SelectFieldsImpl();
	}
	
	public static class SelectFieldsImpl extends SelectFields {
		private List<String> fields = new ArrayList<String>();

		@Override
		public String[] getSelectFields() {
			String[] result = new String[fields.size()];
			fields.toArray(result);
			return result;
		}
		
	    public SelectFieldsImpl roleId() {
	    	if (!fields.contains("roleId")) {
				fields.add("roleId");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl roleName() {
	    	if (!fields.contains("roleName")) {
				fields.add("roleName");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl createBy() {
	    	if (!fields.contains("createBy")) {
				fields.add("createBy");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl createTime() {
	    	if (!fields.contains("createTime")) {
				fields.add("createTime");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl updateBy() {
	    	if (!fields.contains("updateBy")) {
				fields.add("updateBy");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl updateTime() {
	    	if (!fields.contains("updateTime")) {
				fields.add("updateTime");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl delflag() {
	    	if (!fields.contains("delflag")) {
				fields.add("delflag");
			}
	    	return this;
	    }
    
	}
	
	public static class Fields {
        /**
         * 
         */
    	public static String roleId="roleId";
    
        /**
         * 
         */
    	public static String roleName="roleName";
    
        /**
         * 
         */
    	public static String createBy="createBy";
    
        /**
         * 
         */
    	public static String createTime="createTime";
    
        /**
         * 
         */
    	public static String updateBy="updateBy";
    
        /**
         * 
         */
    	public static String updateTime="updateTime";
    
        /**
         * 
         */
    	public static String delflag="delflag";
    
	}
}
