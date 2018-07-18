package javalindday.jpaDemo.service;

import javalindday.jpaDemo.model.AccountInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
  AccountInfo createNewAccount(String user, String pwd, Integer init);
}
