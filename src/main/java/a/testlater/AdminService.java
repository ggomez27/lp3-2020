package a.testlater;

import java.time.LocalDateTime;

import py.ed.uc.lp3.tp.domain.Admin;
import py.ed.uc.lp3.tp.domain.Curator;
import py.ed.uc.lp3.tp.domain.Spectator;
import py.ed.uc.lp3.tp.service.BaseUserService;
import py.ed.uc.lp3.tp.domain.Promo;
import py.ed.uc.lp3.tp.domain.ReviewSite;
public interface AdminService extends CuratorService, BaseUserService{

	void createUser(Spectator spectator);
	void createUser(Curator curator);
	void createUser(Admin admin);
	
	void renameUser(Long id, String role, String name);
	
	void createPromo(Promo promo);
	
	void createReviewSite(ReviewSite ReviewSite);
	
	void addCuratorCategory(Long id, String category);
	
	void removeCuratorCategory(Long id, String category);
	
	void updateExpirationDate(Long id, LocalDateTime newDate);
	void removeSubscription(Long id);
	
	void deleteUser(String role, Long id);
	void deletePromo(Long id);
	void deleteReviewSite(Long id);
}
