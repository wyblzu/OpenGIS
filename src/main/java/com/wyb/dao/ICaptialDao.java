package com.wyb.dao;

import com.wyb.pojo.Captial;

import java.util.List;

/**
 * Created by wyb on 2017/2/25.
 */
public interface ICaptialDao {
    public List<Captial> queryCaptial(String name);
}
