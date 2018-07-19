package javalindday.jpaDemo.service;

import java.util.List;
import javalindday.jpaDemo.model.AccountInfo;
import javalindday.jpaDemo.model.UserInfo;

public interface UserService {
  AccountInfo createNewAccount(String user, String pwd, Integer init);
  List<UserInfo> getUsers();
}
