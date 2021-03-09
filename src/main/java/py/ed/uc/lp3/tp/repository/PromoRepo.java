package py.ed.uc.lp3.tp.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import py.ed.uc.lp3.tp.domain.Promo;

@Repository
public interface PromoRepo extends PagingAndSortingRepository<Promo, Long> {

	List<Promo> findAll();
}
