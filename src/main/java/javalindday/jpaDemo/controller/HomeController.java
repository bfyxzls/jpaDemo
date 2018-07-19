package javalindday.jpaDemo.controller;

import java.util.Date;
import java.util.List;
import javalindday.jpaDemo.model.UserInfo;
import javalindday.jpaDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/home")
public class HomeController {
  @Autowired
  UserService userService;


  @GetMapping("list")
  public List<UserInfo> list() {
    return userService.getUsers();
  }

  @GetMapping("/")
  public String index(String name, String password) {
    userService.createNewAccount(name, password, 100);
    return "OK";
  }

  @GetMapping("logger")
  public String log() {
    log.info("控制台日志 {}", new Date());
    return "logger";
  }
}
