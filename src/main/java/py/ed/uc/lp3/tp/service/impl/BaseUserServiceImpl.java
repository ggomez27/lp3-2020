package py.ed.uc.lp3.tp.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.time.LocalDate;

import py.ed.uc.lp3.tp.domain.BaseUser;
import py.ed.uc.lp3.tp.domain.Admin;
import py.ed.uc.lp3.tp.domain.Curator;
import py.ed.uc.lp3.tp.domain.Spectator;
import py.ed.uc.lp3.tp.repository.BaseUserRepo;
import py.ed.uc.lp3.tp.service.BaseUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseUserServiceImpl implements BaseUserService{

	@Autowired
	private BaseUserRepo baseUserRepo;
	
	public BaseUser findById(Long id) {
		BaseUser baseUser = null;
		Optional<BaseUser> optional = baseUserRepo.findById(id);
		if(optional.isPresent())
			baseUser=optional.get();
		return baseUser;
	};
	
	
	public List<BaseUser> findAdmins(){
		List<BaseUser> baseUserList = new ArrayList<BaseUser>();
		Iterator<BaseUser> iterator = baseUserRepo.findAll().iterator();
		while(iterator.hasNext()) {
			BaseUser baseUser = iterator.next();
			if(baseUser instanceof Admin)
				baseUserList.add(baseUser);
		}
		return baseUserList;
	}
	
	public List<BaseUser> findCurators(){
		List<BaseUser> baseUserList = new ArrayList<BaseUser>();
		Iterator<BaseUser> iterator = baseUserRepo.findAll().iterator();
		while(iterator.hasNext()) {
			BaseUser baseUser = iterator.next();
			if(baseUser instanceof Curator)
				baseUserList.add(baseUser);
		}
		return baseUserList;
	}
	
	public List<BaseUser> findSpectators(){
		List<BaseUser> baseUserList = new ArrayList<BaseUser>();
		Iterator<BaseUser> iterator = baseUserRepo.findAll().iterator();
		while(iterator.hasNext()) {
			BaseUser baseUser = iterator.next();
			if(baseUser instanceof Spectator)
				baseUserList.add(baseUser);
		}
		return baseUserList;
	}
	
	public List<BaseUser> findAll()
	{
		List<BaseUser> baseUserList = new ArrayList<BaseUser>();
		Iterator<BaseUser> iterator = baseUserRepo.findAll().iterator();
		while(iterator.hasNext()) {
			baseUserList.add(iterator.next());
		}
		return baseUserList;
	};
	
	public void rename(Long id, String name) {
		BaseUser user = this.findById(id);
		user.setFirstName(name);
	}
	
	public void rename(Long id, String firstName, String lastName) {
		BaseUser user = this.findById(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
	}
	
	public void changeBirth(Long id, LocalDate date) {
		BaseUser user = this.findById(id);
		user.setBirthDay(date);
	}


	@Override
	public void save(BaseUser user) {
		baseUserRepo.save(user);
		
	}


	@Override
	public void delete(Long id) {
		baseUserRepo.deleteById(id);
		
	}
	
}