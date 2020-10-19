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
 * Table: SYS_AUTHORITY,Remark:权限表  
 */
@ApiModel(value="Authority",description="权限表")
@SqlToyEntity
@Entity(tableName="SYS_AUTHORITY",pk_constraint="PRIMARY")
public class Authority implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6365434985152539607L;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.DefaultIdGenerator")
	@Column(name="AU_ID",length=40L,type=java.sql.Types.VARCHAR,nullable=false)
	private String auId;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="AU_CODE",length=10L,type=java.sql.Types.VARCHAR,nullable=false)
	private String auCode;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="AU_PCODE",length=10L,type=java.sql.Types.VARCHAR,nullable=false)
	private String auPcode;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=false)
	@Column(name="AU_NAME",length=128L,type=java.sql.Types.VARCHAR,nullable=false)
	private String auName;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="AU_TYPE",length=2L,type=java.sql.Types.VARCHAR,nullable=true)
	private String auType;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="AU_NOTE",length=128L,type=java.sql.Types.VARCHAR,nullable=true)
	private String auNote;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="CREATE_BY",length=40L,type=java.sql.Types.VARCHAR,nullable=true)
	private String createBy;
	
	/**
	 * jdbcType:DATETIME
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="CREATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=true)
	private LocalDateTime createTime;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="UPDATE_BY",length=40L,type=java.sql.Types.VARCHAR,nullable=true)
	private String updateBy;
	
	/**
	 * jdbcType:DATETIME
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="UPDATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=true)
	private LocalDateTime updateTime;
	
	/**
	 * jdbcType:DECIMAL
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="DELFLAG",length=1L,type=java.sql.Types.INTEGER,nullable=true)
	private Integer delflag;
	
	/**
	 * jdbcType:VARCHAR
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="NODE_ROUTE",length=200L,type=java.sql.Types.VARCHAR,nullable=true)
	private String nodeRoute;
	
	/**
	 * jdbcType:DECIMAL
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="NODE_LEVEL",length=1L,type=java.sql.Types.INTEGER,nullable=true)
	private Integer nodeLevel;
	
	/**
	 * jdbcType:DECIMAL
	 * 
	 */
	@ApiModelProperty(value="",allowEmptyValue=true)
	@Column(name="IS_LEAF",length=1L,type=java.sql.Types.INTEGER,nullable=true)
	private Integer isLeaf;
	

	/** default constructor */
	public Authority() {
	}
	
	/** pk constructor */
	public Authority(String auId)
	{
		this.auId=auId;
	}

	
	/**
	 *@param auId the auId to set
	 */
	public Authority setAuId(String auId) {
		this.auId=auId;
		return this;
	}
		
	/**
	 *@return the AuId
	 */
	public String getAuId() {
	    return this.auId;
	}
	
	/**
	 *@param auCode the auCode to set
	 */
	public Authority setAuCode(String auCode) {
		this.auCode=auCode;
		return this;
	}
		
	/**
	 *@return the AuCode
	 */
	public String getAuCode() {
	    return this.auCode;
	}
	
	/**
	 *@param auPcode the auPcode to set
	 */
	public Authority setAuPcode(String auPcode) {
		this.auPcode=auPcode;
		return this;
	}
		
	/**
	 *@return the AuPcode
	 */
	public String getAuPcode() {
	    return this.auPcode;
	}
	
	/**
	 *@param auName the auName to set
	 */
	public Authority setAuName(String auName) {
		this.auName=auName;
		return this;
	}
		
	/**
	 *@return the AuName
	 */
	public String getAuName() {
	    return this.auName;
	}
	
	/**
	 *@param auType the auType to set
	 */
	public Authority setAuType(String auType) {
		this.auType=auType;
		return this;
	}
		
	/**
	 *@return the AuType
	 */
	public String getAuType() {
	    return this.auType;
	}
	
	/**
	 *@param auNote the auNote to set
	 */
	public Authority setAuNote(String auNote) {
		this.auNote=auNote;
		return this;
	}
		
	/**
	 *@return the AuNote
	 */
	public String getAuNote() {
	    return this.auNote;
	}
	
	/**
	 *@param createBy the createBy to set
	 */
	public Authority setCreateBy(String createBy) {
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
	public Authority setCreateTime(LocalDateTime createTime) {
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
	public Authority setUpdateBy(String updateBy) {
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
	public Authority setUpdateTime(LocalDateTime updateTime) {
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
	public Authority setDelflag(Integer delflag) {
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
	 *@param nodeRoute the nodeRoute to set
	 */
	public Authority setNodeRoute(String nodeRoute) {
		this.nodeRoute=nodeRoute;
		return this;
	}
		
	/**
	 *@return the NodeRoute
	 */
	public String getNodeRoute() {
	    return this.nodeRoute;
	}
	
	/**
	 *@param nodeLevel the nodeLevel to set
	 */
	public Authority setNodeLevel(Integer nodeLevel) {
		this.nodeLevel=nodeLevel;
		return this;
	}
		
	/**
	 *@return the NodeLevel
	 */
	public Integer getNodeLevel() {
	    return this.nodeLevel;
	}
	
	/**
	 *@param isLeaf the isLeaf to set
	 */
	public Authority setIsLeaf(Integer isLeaf) {
		this.isLeaf=isLeaf;
		return this;
	}
		
	/**
	 *@return the IsLeaf
	 */
	public Integer getIsLeaf() {
	    return this.isLeaf;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("auId=").append(getAuId()).append("\n");
		columnsBuffer.append("auCode=").append(getAuCode()).append("\n");
		columnsBuffer.append("auPcode=").append(getAuPcode()).append("\n");
		columnsBuffer.append("auName=").append(getAuName()).append("\n");
		columnsBuffer.append("auType=").append(getAuType()).append("\n");
		columnsBuffer.append("auNote=").append(getAuNote()).append("\n");
		columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
		columnsBuffer.append("updateTime=").append(getUpdateTime()).append("\n");
		columnsBuffer.append("delflag=").append(getDelflag()).append("\n");
		columnsBuffer.append("nodeRoute=").append(getNodeRoute()).append("\n");
		columnsBuffer.append("nodeLevel=").append(getNodeLevel()).append("\n");
		columnsBuffer.append("isLeaf=").append(getIsLeaf()).append("\n");
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
		
	    public SelectFieldsImpl auId() {
	    	if (!fields.contains("auId")) {
				fields.add("auId");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl auCode() {
	    	if (!fields.contains("auCode")) {
				fields.add("auCode");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl auPcode() {
	    	if (!fields.contains("auPcode")) {
				fields.add("auPcode");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl auName() {
	    	if (!fields.contains("auName")) {
				fields.add("auName");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl auType() {
	    	if (!fields.contains("auType")) {
				fields.add("auType");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl auNote() {
	    	if (!fields.contains("auNote")) {
				fields.add("auNote");
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
    
	    public SelectFieldsImpl nodeRoute() {
	    	if (!fields.contains("nodeRoute")) {
				fields.add("nodeRoute");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl nodeLevel() {
	    	if (!fields.contains("nodeLevel")) {
				fields.add("nodeLevel");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl isLeaf() {
	    	if (!fields.contains("isLeaf")) {
				fields.add("isLeaf");
			}
	    	return this;
	    }
    
	}
	
	public static class Fields {
        /**
         * 
         */
    	public static String auId="auId";
    
        /**
         * 
         */
    	public static String auCode="auCode";
    
        /**
         * 
         */
    	public static String auPcode="auPcode";
    
        /**
         * 
         */
    	public static String auName="auName";
    
        /**
         * 
         */
    	public static String auType="auType";
    
        /**
         * 
         */
    	public static String auNote="auNote";
    
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
    
        /**
         * 
         */
    	public static String nodeRoute="nodeRoute";
    
        /**
         * 
         */
    	public static String nodeLevel="nodeLevel";
    
        /**
         * 
         */
    	public static String isLeaf="isLeaf";
    
	}
}
