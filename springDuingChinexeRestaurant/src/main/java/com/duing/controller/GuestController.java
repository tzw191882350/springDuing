package com.duing.controller;

import com.duing.entity.Guester;
import com.duing.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 职工管理控制器
 */
@Controller
public class GuestController {

    @Autowired
    private IGuestService guestService;

    /**
     * 职工查询方法
     * @return
     */
    @RequestMapping("/list")
    public String list(final Model model) {
        final List<Guester> datas = guestService.guestManage();
        model.addAttribute("guestList", datas);
        return "index";
    }

    /**
     * 职工查询方法
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    /**
     * 职工查询方法
     * @return
     */
    @RequestMapping("/add")
    public String add(final Guester guester) {
        guestService.add(guester);
        return "redirect:list";
    }


}
