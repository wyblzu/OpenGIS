package com.wyb.controller;

import com.wyb.pojo.Captial;
import com.wyb.service.impl.CaptialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by wyb on 2017/2/25.
 */
@Controller
@RequestMapping("spatial")
public class CaptialController {
    @Autowired
    private CaptialService captialService;

    @RequestMapping(value = "/captial/{name}", method = RequestMethod.GET)
    public String captial(@PathVariable("name") String name, Model model){
        model.addAttribute("captialList",captialService.captialList(name));
        return "captial";
    }


}
