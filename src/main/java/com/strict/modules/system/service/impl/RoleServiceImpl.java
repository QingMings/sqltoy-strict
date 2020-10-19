package com.strict.modules.system.service.impl;

import com.strict.modules.system.entity.Role;
import com.strict.modules.system.service.RoleService;
import com.strict.modules.system.vo.RoleVO;
import org.sagacity.sqltoy.dao.SqlToyLazyDao;
import org.sagacity.sqltoy.model.PaginationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private SqlToyLazyDao sqlToyDao;

    @Override
    public void save(RoleVO roleVO) {
        Role role = sqlToyDao.convertType(roleVO,Role.class);
        sqlToyDao.save(role);

    }

    @Override
    public PaginationModel<RoleVO> search(PaginationModel page, RoleVO roleVO) {
        return sqlToyDao.findPageBySql(page,"sys_findRole",roleVO);
    }
}
