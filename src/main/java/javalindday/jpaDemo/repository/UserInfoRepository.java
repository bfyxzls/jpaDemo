package javalindday.jpaDemo.repository;

import javalindday.jpaDemo.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}
