package javalindday.jpaDemo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_accountinfo")
public class AccountInfo implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long accountId;
  private Integer balance;
  private UserInfo userInfo;

  public UserInfo getUserInfo() {

    return userInfo;
  }

  public void setUserInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public Long getAccountId() {

    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

}
