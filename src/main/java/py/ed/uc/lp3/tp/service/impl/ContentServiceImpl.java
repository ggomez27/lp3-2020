package py.ed.uc.lp3.tp.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import py.ed.uc.lp3.tp.domain.Content;
import py.ed.uc.lp3.tp.service.ContentService;
import py.ed.uc.lp3.tp.utils.Ratings;
import py.ed.uc.lp3.tp.repository.ContentRepo;
import py.ed.uc.lp3.tp.repository.ReviewSiteRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService{

	@Autowired
	private ContentRepo contentRepo;
	@Autowired
	private ReviewSiteRepo reviewSiteRepo;
	
	public void rateContent(Content content) {
	    content.setScore(Ratings.getRatings(reviewSiteRepo.findAll(),content.getId()));
	}

	public Content findById(Long id) {
		Content content = null;
		Optional<Content> optional = contentRepo.findById(id);
		if(optional.isPresent()) {
			content=optional.get();
			rateContent(content);
		}
		return content;
	};
	
	public List<Content> findByTitle(String title) {
		List<Content> contentList = new ArrayList<Content>();
		Iterator<Content> iterator = contentRepo.findAll().iterator();
		while(iterator.hasNext()) {
			Content content = iterator.next();
			if(content.getTitle().contains(title))
				contentList.add(content);
		}
		return contentList;
		
	};
	
	public List<Content> findBySubtitle(String subtitle){
		List<Content> contentList = new ArrayList<Content>();
		Iterator<Content> iterator = contentRepo.findAll().iterator();
		while(iterator.hasNext()) {
			Content content = iterator.next();
			if(content.getSubtitle().contains(subtitle))
				contentList.add(content);
		}
		return contentList;
		
	};
	
	public List<Content> findByCategory(String category){
		List<Content> contentList = new ArrayList<Content>();
		Iterator<Content> iterator = contentRepo.findAll().iterator();
		while(iterator.hasNext()) {
			Content content = iterator.next();
			if(content.getCategory().contains(category))
				contentList.add(content);
		}
		return contentList;
		
	};
	
	public List<Content> findByField(String field, String value) {
		field=field.toUpperCase();
		//if(field==null)
		//	return null; and also throw exception null string.
			switch(field) {
				case "TITLE":
					return this.findByTitle(value);
				case "SUBTITLE":
					return this.findBySubtitle(value);
				case "CATEGORY":
					return this.findByCategory(value);
				default:
					//throw exception
					return null;
			}
		
	};

	public List<Content> findAll() {
		List<Content> contentList = new ArrayList<Content>();
		Iterator<Content> iterator = contentRepo.findAll().iterator();
		while(iterator.hasNext()) {
			Content content = iterator.next();
			rateContent(content);
			contentList.add(content);
		}
		return contentList;
	}

	@Override
	public void save(Content content) {
		contentRepo.save(content);
		
	}

	@Override
	public void delete(Long id) {
		contentRepo.deleteById(id);
		
	}

	
	//float findReview(Long id, String ReviewSite);*/ //TODO add this
}
