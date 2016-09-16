package main.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import main.model.LogType;

@Controller
public class ControllerClient
{
  @RequestMapping(value = "/main", method = RequestMethod.GET)
  public String index(Model model)
  {
    model.addAttribute("logTrace", new LogType());
    return "index";
  }
  
  @RequestMapping(value = "/fetchLogs", method = RequestMethod.POST)
  public String addEmployee(@ModelAttribute LogType num,Model model){
    
    RestTemplate restTemplate = new RestTemplate();
    LogType trace= restTemplate.postForObject("http://localhost:1111/fetchLog",num ,LogType.class);
    model.addAttribute("logTrace",trace.getLogTrace() );
    return "index";
  }
}