package javalindday.jpaDemo.controller;

import javalindday.jpaDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @Autowired
  UserService userService;

  @GetMapping("/home")
  public String Index() {
    userService.createNewAccount("zzl", "zzl", 100);
    return "OK";
  }
}
