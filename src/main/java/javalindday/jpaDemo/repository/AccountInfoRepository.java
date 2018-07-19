package javalindday.jpaDemo.repository;

import javalindday.jpaDemo.model.AccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountInfoRepository extends JpaRepository<AccountInfo, Integer> {
}
