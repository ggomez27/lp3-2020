package py.ed.uc.lp3.tp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.ed.uc.lp3.tp.constants.ApiPaths;
import py.ed.uc.lp3.tp.domain.ReviewSite;
import py.ed.uc.lp3.tp.service.ReviewSiteService;


@RestController
@RequestMapping(ApiPaths.REVIEWSITES)
public class ReviewSiteController {

	@Autowired
	private ReviewSiteService reviewSiteService;
	
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ReviewSite greetings(@PathVariable("id") Long id) {
        ReviewSite reviewSite = reviewSiteService.findById(id);
        return reviewSite;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ReviewSite> listAll() {
        return reviewSiteService.findAll();
    }

    @RequestMapping(value = "/search/{name}", method = RequestMethod.GET)
    public List<ReviewSite> searchByName(@PathVariable("name") String name) {
        return reviewSiteService.findByName(name);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody ReviewSite institute) {
    	reviewSiteService.save(institute);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	reviewSiteService.delete(id);
    }
}
