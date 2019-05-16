package com.soholy.dogmanager.mapper.otherDb;

import com.soholy.dogmanager.entity.otherDb.po.Station;
import com.soholy.dogmanager.entity.otherDb.po.StationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationMapper {
    int countByExample(StationExample example);

    int deleteByExample(StationExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(Station record);

    int insertSelective(Station record);

    List<Station> selectByExample(StationExample example);

    Station selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
}