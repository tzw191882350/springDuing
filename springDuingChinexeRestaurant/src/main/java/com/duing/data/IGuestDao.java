package com.duing.data;

import com.duing.entity.Guester;

import java.util.List;

public interface IGuestDao {

    /**
     *
     * @return
     */
    List<Guester> guestManage();

    void add(Guester guester);
}
