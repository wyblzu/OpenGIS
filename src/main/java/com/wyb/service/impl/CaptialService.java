package com.wyb.service.impl;

import com.wyb.dao.impl.CaptialDao;
import com.wyb.pojo.Captial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wyb on 2017/2/25.
 */
@Service
public class CaptialService {
    @Autowired
    private CaptialDao captialDao;

    public CaptialDao getCaptialDao() {
        return captialDao;
    }
    public List<Captial> captialList(String name){
        return captialDao.queryCaptial(name);
    }
}
