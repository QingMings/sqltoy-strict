package com.strict.modules.system.service;

import com.strict.modules.system.entity.Authority;
import com.strict.modules.system.vo.AuthorityVO;
import org.sagacity.sqltoy.model.PaginationModel;

/**
 * 权限
 */
public interface AuthorityService {

    void save(AuthorityVO authorityVO);

    PaginationModel<AuthorityVO>  search(PaginationModel page, AuthorityVO authorityVO);
}
