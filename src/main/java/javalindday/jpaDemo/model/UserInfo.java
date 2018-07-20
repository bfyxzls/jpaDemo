package javalindday.jpaDemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

@ApiModel("用户基本信息")
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_userinfo")
public class UserInfo implements Serializable {
  @ApiModelProperty("编号")
  @Id
  @GeneratedValue
  private int id;
  @ApiModelProperty("用户名")
  private String userName;
  @ApiModelProperty("密码")
  private String password;
  @ApiModelProperty("电子邮件")
  private String Email;
}
