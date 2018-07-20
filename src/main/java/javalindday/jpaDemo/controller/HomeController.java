package javalindday.jpaDemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Date;
import java.util.List;
import javalindday.jpaDemo.model.AccountInfo;
import javalindday.jpaDemo.model.UserInfo;
import javalindday.jpaDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("用户相关")
@Slf4j
@RestController
@RequestMapping("/home")
public class HomeController {
  @Autowired
  UserService userService;

  @ApiOperation("用户列表")
  @GetMapping("list")
  public List<UserInfo> userList() {
    UserInfo u = AccountInfo.builder().build().getUserInfo();
    return userService.getUsers();
  }

  @ApiOperation("账户列表")
  @GetMapping("accountlist")
  public List<AccountInfo> accountList() {
    return userService.getAccounts();
  }

  @ResponseBody
  @ApiOperation("添加用户")
  @GetMapping("/{name}/{password}/{email}")
  public UserInfo index(@ApiParam("用户名") @PathVariable String name,
                        @ApiParam("密码") @PathVariable String password,
                        @ApiParam("电子邮件") @PathVariable String email) {
    return userService.createNewAccount(name, password, email, 100);

  }

  @GetMapping("logger")
  public String log() {
    log.info("控制台日志 {}", new Date());
    return "logger";
  }
}
