package py.ed.uc.lp3.tp.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import py.ed.uc.lp3.tp.domain.Promo;
import py.ed.uc.lp3.tp.service.PromoService;
import py.ed.uc.lp3.tp.repository.PromoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromoServiceImpl implements PromoService{

	@Autowired
	private PromoRepo promoRepo;
	
	public Promo findById(Long id) {
		Promo promo = null;
		Optional<Promo> optional = promoRepo.findById(id);
		if(optional.isPresent())
			promo=optional.get();
		return promo;
	};
	
	public List<Promo> findByName(String Name){
		List<Promo> promoList = new ArrayList<Promo>();
		Iterator<Promo> iterator = promoRepo.findAll().iterator();
		while(iterator.hasNext()) {
			Promo promo = iterator.next();
			if(promo.getName().contains(Name))
				promoList.add(promo);
		}
		return promoList;
	};
	
	public List<Promo> findByType(String type){
		List<Promo> promoList = new ArrayList<Promo>();
		Iterator<Promo> iterator = promoRepo.findAll().iterator();
		while(iterator.hasNext()) {
			Promo promo = iterator.next();
			if(promo.getType().contains(type))
				promoList.add(promo);
		}
		return promoList;
	};
	
	public List<Promo> findAll() {
		List<Promo> promoList = new ArrayList<Promo>();
		Iterator<Promo> iterator = promoRepo.findAll().iterator();
		while(iterator.hasNext()) {
			promoList.add(iterator.next());
		}
		return promoList;
	};
	
	public List<Promo> findByAdhered(String adhered){
		List<Promo> promoList = new ArrayList<Promo>();
		Iterator<Promo> iterator = promoRepo.findAll().iterator();
		while(iterator.hasNext()) {
			Promo promo = iterator.next();
			Iterator<String> stringIterator = promo.getAppliesTo().iterator();
			while(stringIterator.hasNext()) {
				String name = stringIterator.next();
				if(name.contains(adhered))
					promoList.add(promo);
			}
		}
		return promoList;
	};
};
	