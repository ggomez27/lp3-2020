package py.ed.uc.lp3.tp.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.ed.uc.lp3.tp.constants.ApiPaths;
import py.ed.uc.lp3.tp.domain.Promo;
import py.ed.uc.lp3.tp.service.PromoService;

@RestController
@RequestMapping(ApiPaths.PROMOS)
public class PromoController {

	@Autowired
	private PromoService promoService;
	
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Promo greetings(@PathVariable("id") Long id) {
        Promo promo = promoService.findById(id);
        return promo;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Promo> listAll() {
        return promoService.findAll();
    }

    @RequestMapping(value = "/search/name={name}", method = RequestMethod.GET)
    public List<Promo> searchByName(@PathVariable("name") String name) {
        return promoService.findByName(name);
    }
    
    @RequestMapping(value = "/search/type={type}", method = RequestMethod.GET)
    public List<Promo> searchByType(@PathVariable("type") String type) {
        return promoService.findByType(type);
    }
    
    @RequestMapping(value = "/search/adhered={name}", method = RequestMethod.GET)
    public List<Promo> searchByAdhered(@PathVariable("name") String name) {
        return promoService.findByAdhered(name);
    }
    /*
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Promo institute) {
    	promoService.save(institute);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	promoService.delete(id);
    }*/
}