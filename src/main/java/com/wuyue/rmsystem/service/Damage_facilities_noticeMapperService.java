package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.Damage_facilities_noticeMapper;
import com.wuyue.rmsystem.model.Damage_facilities_notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Damage_facilities_noticeMapperService {

    @Autowired
    Damage_facilities_noticeMapper damage_facilities_noticeMapper;

    public int addDFN(Damage_facilities_notice dfn){
        return damage_facilities_noticeMapper.addDFN(dfn);
    }
    public void deleteDFN(Damage_facilities_notice dfn){
        damage_facilities_noticeMapper.deleteDFN(dfn);
    }
    public List<Damage_facilities_notice> getDFN(){
       return damage_facilities_noticeMapper.getFDN();
    }
    public void updateDFN(Damage_facilities_notice dfn){
        damage_facilities_noticeMapper.updateDFN(dfn);
    }

}
