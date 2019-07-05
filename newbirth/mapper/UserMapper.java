package cn.beyond.newbirth.mapper;

import cn.beyond.newbirth.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    @Select("select * from User where id=#{id}" )
    User selectByPriMaryKey(Long id);

}
