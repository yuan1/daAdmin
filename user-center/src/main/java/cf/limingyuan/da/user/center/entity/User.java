package cf.limingyuan.da.user.center.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: lmy
 * @date: 2022/1/28 上午11:05
 * @desc: 用户
 */
@Data
@TableName("sys_user")
public class User {
    private Long id;
    private String username;
    private String nickname;
    private String password;
    private Boolean isDel;
}
