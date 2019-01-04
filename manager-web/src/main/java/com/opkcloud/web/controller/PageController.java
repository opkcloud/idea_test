package com.opkcloud.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2019/1/3
 * @Description: com.opkcloud.web.controller
 * @version: 1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }

}
