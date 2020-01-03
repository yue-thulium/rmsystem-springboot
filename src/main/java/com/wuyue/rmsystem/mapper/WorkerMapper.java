package com.wuyue.rmsystem.mapper;

import com.wuyue.rmsystem.model.Worker;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkerMapper {
    int addW(Worker worker);
    int deleteW(Worker worker);
    int updateW(Worker worker);
    List<Worker> getW();
}
