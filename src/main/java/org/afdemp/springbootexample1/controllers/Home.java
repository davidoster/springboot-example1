/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afdemp.springbootexample1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mac
 */
@Controller
@RequestMapping("/")
public class Home {
    
    @RequestMapping("/")
    public String Home(ModelMap view) {
        view.addAttribute("greeting", new String("Hello George"));
        return "welcome";
    }
    
}
