package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Divider_band_information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Divider_band_tableMapper {
    int addDBT(Divider_band_information DBI);
    int deleteDBT(Divider_band_information DBI);
    int updateDBT(Divider_band_information DBI);
    List<Divider_band_information> getDBT();
}
