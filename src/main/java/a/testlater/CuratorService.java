package a.testlater;

import py.ed.uc.lp3.tp.domain.ReviewSite;

public interface CuratorService {

	void addReview(Long id, ReviewSite reviewSite, Float score);
	void removeReview(Long id, ReviewSite reviewSite);
	
}
