package py.ed.uc.lp3.tp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.ed.uc.lp3.tp.constants.ApiPaths;
import py.ed.uc.lp3.tp.domain.Content;
import py.ed.uc.lp3.tp.service.ContentService;

@RestController
@RequestMapping(ApiPaths.CONTENT)
public class ContentController {

	@Autowired
	private ContentService contentService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Content greetings(@PathVariable("id") Long id) {
        Content content = contentService.findById(id);
 
        return content;
    }
    
    @RequestMapping(value = "/{id}/reviews", method = RequestMethod.GET)
    public String showReviews(@PathVariable("id") Long id) {
        Content content = contentService.findById(id);
        return content.getScore();
    }
   
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Content> listAll() {
        return contentService.findAll();
    }

    @RequestMapping(value = "/search/{field}/{value}", method = RequestMethod.GET)
    public List<Content> searchByField(@PathVariable("field") String field, @PathVariable("value") String value) {
        return contentService.findByField(field, value);
    }
    
    
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Content content) {
    	contentService.save(content);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	contentService.delete(id);
    }
}
