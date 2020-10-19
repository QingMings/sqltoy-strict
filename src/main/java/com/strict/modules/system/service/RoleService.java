package com.strict.modules.system.service;

import com.strict.modules.system.vo.RoleVO;
import org.sagacity.sqltoy.model.PaginationModel;

public interface RoleService {

    /**
     * 保存权限
     * @param roleVO
     */
    public void save(RoleVO roleVO);

    /**
     * 分页查询权限
     * @param page
     * @param roleVO
     * @return
     */
    public PaginationModel<RoleVO> search (PaginationModel page, RoleVO roleVO);
}
