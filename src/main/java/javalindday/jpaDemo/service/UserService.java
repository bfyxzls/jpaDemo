package javalindday.jpaDemo.service;

import javalindday.jpaDemo.model.AccountInfo;

public interface UserService {
  AccountInfo createNewAccount(String user, String pwd, Integer init);
}
