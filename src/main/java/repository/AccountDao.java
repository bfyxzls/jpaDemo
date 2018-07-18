package repository;

import javalindday.jpaDemo.model.AccountInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao extends CrudRepository<AccountInfo, Integer> {
}
