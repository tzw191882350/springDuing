package com.duing.data;

import com.duing.GuestStarter;
import com.duing.entity.Guester;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao implements IGuestDao {

    /**
     * 职员
     */
    private static List<Guester> datas = new ArrayList<>();

    static {
        datas.add(new Guester("张三", "法外狂徒"));
        datas.add(new Guester("张五", "产品经理"));
        datas.add(new Guester("李四", "项目经理"));
    }

    /**
     *
     * @return
     */
    @Override
    public List<Guester> guestManage() {
        return datas;
    }

    public void add(final Guester guester) {
        datas.add(guester);
    }
}
