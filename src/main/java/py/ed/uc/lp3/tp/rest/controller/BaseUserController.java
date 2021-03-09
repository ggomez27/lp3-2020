package py.ed.uc.lp3.tp.rest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.ed.uc.lp3.tp.constants.ApiPaths;
import py.ed.uc.lp3.tp.domain.BaseUser;
import py.ed.uc.lp3.tp.service.BaseUserService;

@RestController
@RequestMapping(ApiPaths.USER)
public class BaseUserController {
	/*
	 * Controlador de la clase BaseUser
	 */

	@Autowired
	private BaseUserService baseUserService;
	
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BaseUser greetings(@PathVariable("id") Long id) {
        BaseUser baseUser = baseUserService.findById(id);
        return baseUser;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<BaseUser> listAll() {
        return baseUserService.findAll();
    }

    @RequestMapping(value = "/admins/", method = RequestMethod.GET)
    public List<BaseUser> searchAdmins() {
        return baseUserService.findAdmins();
    }
    
    @RequestMapping(value = "/curators/", method = RequestMethod.GET)
    public List<BaseUser> searchCurators() {
        return baseUserService.findCurators();
    }
    
    @RequestMapping(value = "/spectators/", method = RequestMethod.GET)
    public List<BaseUser> searchSpectators() {
        return baseUserService.findSpectators();
    }
    
    
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody BaseUser user) {
    	baseUserService.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	baseUserService.delete(id);
    }
}