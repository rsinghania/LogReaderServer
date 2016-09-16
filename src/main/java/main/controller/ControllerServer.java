package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import main.model.LogType;

@Controller
public class ControllerServer
{

  @RequestMapping(value = "/fetchLog", method = RequestMethod.POST)
  public @ResponseBody LogType addEmployee(@RequestBody LogType logtype)
  {
    String logTrace=getFile("server.log");
    LogType log=new LogType();
    log.setLogTrace(logTrace);
    return log;
  }

  private String getFile(String fileName)
  {

    StringBuilder result = new StringBuilder("this is test string");


    return result.toString();

  }

}