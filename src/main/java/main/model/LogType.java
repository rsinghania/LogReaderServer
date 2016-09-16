package main.model;

import org.springframework.stereotype.Component;

@Component
public class LogType
{
  private String logTypeSelect;
  private String logTrace;
  public String getLogTrace()
  {
    return logTrace;
  }

  public void setLogTrace(String logTrace)
  {
    this.logTrace = logTrace;
  }

  public String getLogTypeSelect()
  {
    return logTypeSelect;
  }

  public void setLogTypeSelect(String logTypeSelect)
  {
    this.logTypeSelect = logTypeSelect;
  }

  
}
