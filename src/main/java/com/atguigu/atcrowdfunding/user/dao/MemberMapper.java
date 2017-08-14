package com.atguigu.atcrowdfunding.user.dao;

import com.atguigu.atcrowdfunding.user.bean.Member;
import java.util.List;

public interface MemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Member record);

    Member selectByPrimaryKey(Integer id);

    List<Member> selectAll();

    int updateByPrimaryKey(Member record);
}