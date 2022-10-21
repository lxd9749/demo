package com.demo.mapper;

import com.demo.entity.ApSend;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApSendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApSend record);

    int insertSelective(ApSend record);

    ApSend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApSend record);

    int updateByPrimaryKey(ApSend record);
}