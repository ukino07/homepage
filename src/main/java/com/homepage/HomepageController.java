package com.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by u_kino07 on 2018. 5. 14..
 */
@Controller
public class HomepageController {

    @RequestMapping("home")
    public ModelAndView index() {
        String name = "Yikyung";
        return new ModelAndView("index").addObject("name", name);
    }
}
