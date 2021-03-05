package com.duing.service;

import com.duing.entity.Guester;

import java.util.List;

public interface IGuestService {

    List<Guester> guestManage();

    void add(Guester guester);
}
