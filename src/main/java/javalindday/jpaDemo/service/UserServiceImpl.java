package javalindday.jpaDemo.service;

import java.util.List;
import javalindday.jpaDemo.model.AccountInfo;
import javalindday.jpaDemo.model.UserInfo;
import javalindday.jpaDemo.repository.AccountInfoRepository;
import javalindday.jpaDemo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserInfoRepository userInfoRepository;
  @Autowired
  AccountInfoRepository accountInfoRepository;

  @Override
  public AccountInfo createNewAccount(String user, String pwd, Integer init) {
    AccountInfo accountInfo = new AccountInfo();
    UserInfo userInfo = new UserInfo();
    userInfo.setUserName(user);
    userInfo.setPassword(pwd);
    accountInfo.setBalance(init);
    accountInfo.setUserInfo(userInfo);
    userInfoRepository.save(userInfo);
    accountInfoRepository.save(accountInfo);
    return accountInfo;
  }

  @Override
  public List<UserInfo> getUsers() {
    return userInfoRepository.findAll();
  }
}
