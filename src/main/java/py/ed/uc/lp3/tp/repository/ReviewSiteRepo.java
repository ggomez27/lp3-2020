package py.ed.uc.lp3.tp.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.ed.uc.lp3.tp.domain.ReviewSite;

@Repository
public interface ReviewSiteRepo extends PagingAndSortingRepository<ReviewSite, Long> {

	List<ReviewSite> findAll();

}
