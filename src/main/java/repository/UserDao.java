package repository;

import javalindday.jpaDemo.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserInfo, Integer> {
}
