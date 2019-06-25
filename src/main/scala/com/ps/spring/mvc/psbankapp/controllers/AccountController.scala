package com.ps.spring.mvc.psbankapp.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMethod

@RefreshScope
@Controller
//@ComponentScan(basePackages = Array("com.ps.spring.mvc.psbankapp"))
class AccountController {


  @RequestMapping(value = Array("/"))
  def showHomePage(): Unit = {
    "index"
  }

  @RequestMapping(value = Array("/new"), method = Array(RequestMethod.GET))
  def newAccount(): Unit = {
    "newAccount"
  }

  @RequestMapping(value = Array("/showAccount"))
  def showAccount(): Unit = {
    "showAccount"
  }
}
