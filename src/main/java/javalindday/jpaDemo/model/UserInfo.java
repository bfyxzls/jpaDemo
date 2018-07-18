package javalindday.jpaDemo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_userinfo")
public class UserInfo implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String UserName;
  private String Password;

  public int getId() {

    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {

    return UserName;
  }

  public void setUserName(String userName) {
    UserName = userName;
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String password) {
    Password = password;
  }
}
