package repository;

import javalindday.jpaDemo.model.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<UserInfo, Integer> {
}
