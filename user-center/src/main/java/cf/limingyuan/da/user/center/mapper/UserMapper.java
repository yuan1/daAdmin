package cf.limingyuan.da.user.center.mapper;

import cf.limingyuan.da.user.center.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: lmy
 * @date: 2022/1/28 上午11:05
 * @desc: 用户Mapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
