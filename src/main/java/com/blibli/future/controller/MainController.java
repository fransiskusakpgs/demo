package com.blibli.future.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by My Windows on 9/2/2016.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String greeting(Model model) {
        String nama = "Budi";
        model.addAttribute("name", nama);
        return "landing";

    }
}
