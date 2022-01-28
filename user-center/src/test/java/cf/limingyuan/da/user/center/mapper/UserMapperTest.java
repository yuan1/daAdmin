package cf.limingyuan.da.user.center.mapper;

import cf.limingyuan.da.user.center.UserCenterApplication;
import cf.limingyuan.da.user.center.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: lmy
 * @date: 2022/1/28 上午11:07
 * @desc: 用户Mapper测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {UserCenterApplication.class})
@Slf4j
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        log.debug("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        log.debug("user list is {}",userList);
        User user = userMapper.selectById(1);
        log.debug("user is {}",user);
    }
}
