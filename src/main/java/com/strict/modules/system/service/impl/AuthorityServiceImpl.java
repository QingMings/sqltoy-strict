package com.strict.modules.system.service.impl;

import com.strict.modules.system.entity.Authority;
import com.strict.modules.system.vo.AuthorityVO;
import org.sagacity.sqltoy.dao.SqlToyLazyDao;
import org.sagacity.sqltoy.model.PaginationModel;
import org.sagacity.sqltoy.model.TreeTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorityService")
public class AuthorityServiceImpl implements com.strict.modules.system.service.AuthorityService {
    @Autowired
    private SqlToyLazyDao sqlToyDao;

    @Override
    public void save(AuthorityVO authorityVO) {
        Authority authority = sqlToyDao.convertType(authorityVO,Authority.class);
        sqlToyDao.save(authority);
        sqlToyDao.wrapTreeTableRoute(new TreeTableModel(authority).pidField("auPcode").idField("auCode"));
    }

    @Override
    public PaginationModel<AuthorityVO> search(PaginationModel page, AuthorityVO authorityVO) {
        return sqlToyDao.findPageBySql(page,"sys_findAuthByAuNameLike",authorityVO);
    }
}
