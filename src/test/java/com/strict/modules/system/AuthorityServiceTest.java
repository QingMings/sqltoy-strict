package com.strict.modules.system;

import com.strict.StrictApplication;
import com.strict.modules.system.entity.Authority;
import com.strict.modules.system.service.AuthorityService;
import com.strict.modules.system.vo.AuthorityVO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = StrictApplication.class)
public class AuthorityServiceTest {
    @Autowired
    AuthorityService authorityService;

    @Test
    public void testSaveAuthority(){
        AuthorityVO authorityVO = new AuthorityVO();
        authorityVO.setAuId("c63b36ff-f808-461a-a46c-54b4dc16c9dd");
        authorityVO.setAuCode("9800");
        authorityVO.setAuName("供热发展部工作联系单");
        authorityVO.setAuPcode("1000000");
        authorityVO.setAuNote("");
        authorityVO.setAuType("2");

        AuthorityVO authorityVO1 = new AuthorityVO();
        authorityVO1.setAuId("da0a925a-1958-4cd0-924a-99f7ee991cf0");
        authorityVO1.setAuCode("9810");
        authorityVO1.setAuName("供热发展部工作联系单-查看");
        authorityVO1.setAuPcode("9800");
        authorityVO1.setAuNote("");
        authorityVO1.setAuType("1");

        AuthorityVO authorityVO2 = new AuthorityVO();
        authorityVO2.setAuId("16b01577-7e8d-4d16-abb0-951538161a6c");
        authorityVO2.setAuCode("9820");
        authorityVO2.setAuName("供热发展部工作联系单-新增");
        authorityVO2.setAuPcode("9800");
        authorityVO2.setAuNote("");
        authorityVO2.setAuType("1");

        AuthorityVO authorityVO3 = new AuthorityVO();
        authorityVO3.setAuId("4fadf8fe-dfbd-4538-b798-985e79834f8e");
        authorityVO3.setAuCode("9830");
        authorityVO3.setAuName("供热发展部工作联系单-修改");
        authorityVO3.setAuPcode("9800");
        authorityVO3.setAuNote("");
        authorityVO3.setAuType("1");

        AuthorityVO authorityVO4 = new AuthorityVO();
        authorityVO4.setAuId("50a34248-8aed-4c7d-89a2-a860c147cc39");
        authorityVO4.setAuCode("9840");
        authorityVO4.setAuName("供热发展部工作联系单-删除");
        authorityVO4.setAuPcode("9800");
        authorityVO4.setAuNote("");
        authorityVO4.setAuType("1");

        authorityService.save(authorityVO);
//        authorityService.save(authorityVO1);
//        authorityService.save(authorityVO2);
//        authorityService.save(authorityVO3);
//        authorityService.save(authorityVO4);
    }
}
