package kfhstu.dao;

import com.kfhstu.entity.Member;
import org.apache.ibatis.annotations.Mapper;


/**
 * dao层,具体实现交xml文件
 */
@Mapper
public interface MemberDao {
    //根据id查询
    Member queryMemberById(Long id);
    //添加一条数据
    Integer saveMember(Member member);

}
