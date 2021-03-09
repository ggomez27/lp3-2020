package py.ed.uc.lp3.tp.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import py.ed.uc.lp3.tp.domain.ReviewSite;
import py.ed.uc.lp3.tp.service.ReviewSiteService;
import py.ed.uc.lp3.tp.repository.ReviewSiteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewSiteServiceImpl implements ReviewSiteService{

	@Autowired
	private ReviewSiteRepo reviewSiteRepo;
	
	public ReviewSite findById(Long id) {
		ReviewSite reviewSite = null;
		Optional<ReviewSite> optional = reviewSiteRepo.findById(id);
		if(optional.isPresent())
			reviewSite=optional.get();
		return reviewSite;
	};
	
	public List<ReviewSite> findByName(String name){
		List<ReviewSite> reviewSiteList = new ArrayList<ReviewSite>();
		Iterator<ReviewSite> iterator = reviewSiteRepo.findAll().iterator();
		while(iterator.hasNext()) {
			ReviewSite reviewSite = iterator.next();
			if(reviewSite.getName().contains(name))
				reviewSiteList.add(reviewSite);
		}
		return reviewSiteList;
	};
	
	public List<ReviewSite> findAll()
	{
		List<ReviewSite> reviewSiteList = new ArrayList<ReviewSite>();
		Iterator<ReviewSite> iterator = reviewSiteRepo.findAll().iterator();
		while(iterator.hasNext()) {
			reviewSiteList.add(iterator.next());
		}
		return reviewSiteList;
	};
	

	@Override
	public void save(ReviewSite institute) {
		reviewSiteRepo.save(institute);
		
	}

	@Override
	public void delete(Long id) {
		reviewSiteRepo.deleteById(id);
		
	};
	
}
