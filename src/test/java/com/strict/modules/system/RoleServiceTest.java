package com.strict.modules.system;

import com.alibaba.fastjson.JSON;
import com.strict.StrictApplication;
import com.strict.modules.system.entity.Role;
import com.strict.modules.system.service.RoleService;
import com.strict.modules.system.vo.RoleVO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.sagacity.sqltoy.model.PaginationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import springfox.documentation.spring.web.json.Json;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = StrictApplication.class)
public class RoleServiceTest {

    @Autowired
    RoleService  roleService;
    @Test
    public void testSaveRole(){
        RoleVO roleVO = new RoleVO();
        roleVO.setRoleId("6788c5af-41ea-4c7d-b56f-75bedb804477");
        roleVO.setRoleName("删除节点");
        roleService.save(roleVO);
    }

    @Test
    public void testSearchRoleByNameLike(){
        RoleVO roleVO = new RoleVO().setRoleName("节点");
            PaginationModel result = roleService.search(new PaginationModel(),roleVO);
            System.out.println(JSON.toJSONString(result));

    }
}
