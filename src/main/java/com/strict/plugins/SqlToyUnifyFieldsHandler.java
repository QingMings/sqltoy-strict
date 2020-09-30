/**
 * 
 */
package com.strict.plugins;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.sagacity.sqltoy.model.IgnoreCaseSet;
import org.sagacity.sqltoy.plugins.IUnifyFieldsHandler;
import org.sagacity.sqltoy.utils.DateUtil;

import com.strict.modules.GlobalConstants;

/**
 * @project sqltoy-showcase
 * @description 统一字段赋值范例
 * @author chenrenfei <a href="mailto:zhongxuchen@gmail.com">联系作者</a>
 * @version id:SqlToyUnifyFieldsHandler.java,Revision:v1.0,Date:2018年1月18日
 */
public class SqlToyUnifyFieldsHandler implements IUnifyFieldsHandler {
	private String defaultUserName = "system-auto";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sagframe.sqltoy.plugin.IUnifyFieldsHandler#createUnifyFields()
	 */
	@Override
	public Map<String, Object> createUnifyFields() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		Timestamp nowTime = DateUtil.getTimestamp(null);
		// 获取用户信息
		String userId = getUserId();
		// 不存在的字段名称会自动忽略掉(因此下述属性未必是每个表中必须存在的)
		map.put("createBy", userId);
		map.put("createTime", nowTime);
		map.put("updateBy", userId);
		map.put("updateTime", nowTime);
		// enabled 是否启用状态
		map.put("enabled", GlobalConstants.Status.ENABLED);
		return map;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sagframe.sqltoy.plugin.IUnifyFieldsHandler#updateUnifyFields()
	 */
	@Override
	public Map<String, Object> updateUnifyFields() {
		Timestamp timestamp = DateUtil.getTimestamp(null);
		Map<String, Object> map = new HashMap<String, Object>();
		// 获取用户信息，不存在的字段名称会自动忽略掉(因此下述属性未必是每个表中必须存在的)
		map.put("updateBy", getUserId());
		map.put("updateTime", timestamp);
		return map;
	}

	/**
	 * 强制修改的字段，如果没有强制修改，直接返回null
	 */
	@Override
	public IgnoreCaseSet forceUpdateFields() {
		IgnoreCaseSet forceUpdateFields = new IgnoreCaseSet();
		forceUpdateFields.add("updateTime");
		return forceUpdateFields;
	}

	/**
	 * @todo 获取当前用户Id信息
	 * @return
	 */
	private String getUserId() {
		// 通过SpringSecurity 获取当前用户ID,请根据实际项目情况调整此处
		// return (SpringSecurityUtils.getCurrentUser() != null) ?
		// SpringSecurityUtils.getCurrentUser().getId() : defaultUserName;
		return defaultUserName;
	}

	/**
	 * @return the defaultUserName
	 */
	public String getDefaultUserName() {
		return defaultUserName;
	}

	/**
	 * @param defaultUserName the defaultUserName to set
	 */
	public void setDefaultUserName(String defaultUserName) {
		this.defaultUserName = defaultUserName;
	}

}
