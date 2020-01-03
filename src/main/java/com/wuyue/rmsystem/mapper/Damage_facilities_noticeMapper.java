package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Damage_facilities_notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Damage_facilities_noticeMapper {
    int addDFN(Damage_facilities_notice dfn);
    int deleteDFN(Damage_facilities_notice dfn);
    List<Damage_facilities_notice> getFDN();
    int updateDFN(Damage_facilities_notice dfn);
}
