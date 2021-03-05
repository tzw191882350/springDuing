package com.duing.service;

import com.duing.data.GuestDao;
import com.duing.entity.Guester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService implements IGuestService {

    @Autowired
    private GuestDao guestDao;


    @Override
    public List<Guester> guestManage() {
        return guestDao.guestManage();
    }

    @Override
    public void add(Guester guester) {
        guestDao.add(guester);
    }


}
