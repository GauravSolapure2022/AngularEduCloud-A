package in.codetech.angulareducloud.portal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codetech.angulareducloud.portal.module.User;

@Repository
public interface userRepo extends JpaRepository<User, Long>{
	
}