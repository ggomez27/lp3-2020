package a.testlater;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.ed.uc.lp3.tp.constants.ApiPaths;
import py.ed.uc.lp3.tp.domain.Curator;
import py.ed.uc.lp3.tp.domain.Content;
import py.ed.uc.lp3.tp.domain.ReviewSite;
import py.ed.uc.lp3.tp.repository.ContentRepo;
import py.ed.uc.lp3.tp.repository.ReviewSiteRepo;

@RestController
@RequestMapping(ApiPaths.CURATOR)
public class CuratorController {

	@Autowired
	private CuratorService curatorService;
	
    @RequestMapping(value = "/{id}/add/{site}/", method = RequestMethod.POST)
    public Curator addRating(@PathVariable("id") Long id) {
        return curator;
    }
    
    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
    public Curator removeRating(@PathVariable("id") Long id) {
        Curator curator = curatorService.findById(id);
        return curator;
    }
    
    /*
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Curator institute) {
    	curatorService.save(institute);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	curatorService.delete(id);
    }*/
}