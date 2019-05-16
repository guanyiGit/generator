package com.soholy.dogmanager.mapper.otherDb;

import com.soholy.dogmanager.entity.otherDb.po.Wifi;
import com.soholy.dogmanager.entity.otherDb.po.WifiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WifiMapper {
    int countByExample(WifiExample example);

    int deleteByExample(WifiExample example);

    int deleteByPrimaryKey(String priId);

    int insert(Wifi record);

    int insertSelective(Wifi record);

    List<Wifi> selectByExample(WifiExample example);

    Wifi selectByPrimaryKey(String priId);

    int updateByExampleSelective(@Param("record") Wifi record, @Param("example") WifiExample example);

    int updateByExample(@Param("record") Wifi record, @Param("example") WifiExample example);

    int updateByPrimaryKeySelective(Wifi record);

    int updateByPrimaryKey(Wifi record);
}