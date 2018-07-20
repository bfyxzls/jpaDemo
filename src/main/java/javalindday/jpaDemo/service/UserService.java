package javalindday.jpaDemo.service;

import java.util.List;
import javalindday.jpaDemo.model.AccountInfo;
import javalindday.jpaDemo.model.UserInfo;

public interface UserService {
  UserInfo createNewAccount(String user, String pwd, String email, Integer init);

  List<UserInfo> getUsers();

  List<AccountInfo> getAccounts();

}
