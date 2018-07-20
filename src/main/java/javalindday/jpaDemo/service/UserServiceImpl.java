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
  public List<AccountInfo> getAccounts() {
    return accountInfoRepository.findAll();
  }

  @Override
  public UserInfo createNewAccount(String user, String pwd, String email, Integer init) {
    UserInfo userInfo = UserInfo.builder()
        .Email(email)
        .password(pwd)
        .userName(user)
        .build();
    AccountInfo accountInfo = AccountInfo.builder()
        .balance(init)
        .userInfo(userInfo)
        .build();
    userInfo = userInfoRepository.save(userInfo);
    accountInfoRepository.save(accountInfo);
    return userInfo;
  }

  @Override
  public List<UserInfo> getUsers() {
    return userInfoRepository.findAll();
  }
}
