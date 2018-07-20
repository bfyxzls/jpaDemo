package javalindday.jpaDemo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_accountinfo")
public class AccountInfo implements Serializable {
  @Id
  @GeneratedValue
  private int accountId;
  private int balance;
  private UserInfo userInfo;

  public UserInfo getUserInfo() {
    return userInfo == null ? UserInfo.builder().build() : userInfo;
  }
}
