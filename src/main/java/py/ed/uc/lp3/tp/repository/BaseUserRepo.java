package py.ed.uc.lp3.tp.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.ed.uc.lp3.tp.domain.BaseUser;

@Repository
public interface BaseUserRepo extends PagingAndSortingRepository<BaseUser, Long> {
	List<BaseUser> findAll();
}
