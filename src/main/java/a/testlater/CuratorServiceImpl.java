package a.testlater;

import py.ed.uc.lp3.tp.domain.Curator;
import py.ed.uc.lp3.tp.domain.Content;
import py.ed.uc.lp3.tp.domain.ReviewSite;
import py.ed.uc.lp3.tp.repository.BaseUserRepo;
import py.ed.uc.lp3.tp.repository.ContentRepo;
import py.ed.uc.lp3.tp.utils.Ratings;
import org.springframework.stereotype.Service;

@Service
public class CuratorServiceImpl implements CuratorService{

	public void addReview(Long curatorId, Long id, ReviewSite reviewSite, Float score) {
		if(BaseUserRepo.find)
		Ratings.addReview(reviewSite, id, score);
	}
	
	public void removeReview(Long curatorId, Long id, ReviewSite reviewSite) {
		Ratings.removeReview(reviewSite, id);
	}
};
	