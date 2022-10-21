package com.demo.server;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.demo.mapper.ApSendMapper;
import com.demo.entity.ApSend;
@Service
public class ApSendService{

    @Resource
    private ApSendMapper apSendMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return apSendMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(ApSend record) {
        return apSendMapper.insert(record);
    }

    
    public int insertSelective(ApSend record) {
        return apSendMapper.insertSelective(record);
    }

    
    public ApSend selectByPrimaryKey(Integer id) {
        return apSendMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(ApSend record) {
        return apSendMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(ApSend record) {
        return apSendMapper.updateByPrimaryKey(record);
    }

}
