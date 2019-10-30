package com.atguigu.component;

import com.atguigu.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

  /*@ResponseBody
  //@ExceptionHandler
  public Map<String, Object> handleException(Exception e) {
    Map<String, Object> map = new HashMap<>();
    map.put("code", "user not exist");
    map.put("message", e.getMessage());
    return map;
  }*/

  @ExceptionHandler(UserNotExistException.class)
  public String handleException(Exception e, HttpServletRequest request) {
    Map<String, Object> map = new HashMap<>();
    map.put("code", "user not exist");
    map.put("message", e.getMessage());
    request.setAttribute("javax.servlet.error.status_code",500);
    request.setAttribute("ext",map);
    return "forward:/error";
  }
}
