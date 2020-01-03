package com.wuyue.rmsystem.service;

import com.wuyue.rmsystem.mapper.WorkerMapper;
import com.wuyue.rmsystem.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WorkerService {
    @Autowired
    WorkerMapper workerMapper;
    public void addW(Worker worker){
        workerMapper.addW(worker);
    }
    public void deleteW(Worker worker){
        workerMapper.deleteW(worker);
    }
    public void updateW(Worker worker){
        workerMapper.updateW(worker);
    }
    public List<Worker> getW(){
        return workerMapper.getW();
    }
}
