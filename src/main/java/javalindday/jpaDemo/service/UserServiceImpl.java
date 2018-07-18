package javalindday.jpaDemo.service;

import javalindday.jpaDemo.model.AccountInfo;
import javalindday.jpaDemo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccountDao;
import repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;
  @Autowired
  private AccountDao accountDao;

  @Override
  public AccountInfo createNewAccount(String user, String pwd, Integer init) {

    // 封装域对象

    AccountInfo accountInfo = new AccountInfo();

    UserInfo userInfo = new UserInfo();

    userInfo.setUserName(user);

    userInfo.setPassword(pwd);

    accountInfo.setBalance(init);

    accountInfo.setUserInfo(userInfo);

    // 调用持久层，完成数据的保存

    userDao.save(userInfo);
    accountDao.save(accountInfo);
    return accountInfo;

  }

}
