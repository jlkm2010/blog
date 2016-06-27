package com.windhc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HC on 2016/6/20.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

  @RequestMapping(method = RequestMethod.GET)
  public String home() {
    return "/index.html";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String login() {
    return "/admin/login.html";
  }

  @RequestMapping(value = "/admin", method = RequestMethod.GET)
  public String admin() {
    return "/admin/main.html";
  }

}