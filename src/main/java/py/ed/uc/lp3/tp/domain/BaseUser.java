package py.ed.uc.lp3.tp.domain;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
import javax.persistence.Entity;
import java.time.LocalDate;

//@MappedSuperclass
@Entity
public class BaseUser implements Serializable{

	private static final long serialVersionUID = -7238109554876764734L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	//Datos basicos que todos los usuarios tienen.
	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	private String username;
	private String password;
	private String email;
	
	public String getFirstName() {
		return firstName;
	}

	public long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
