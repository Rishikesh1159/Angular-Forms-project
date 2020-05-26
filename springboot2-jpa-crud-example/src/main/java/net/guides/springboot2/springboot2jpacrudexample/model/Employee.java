/*--Rishikesh Pasham
Sivaram Prasad Muthe
Sreemanth Krishna Tirumala*/
/*this class has student details and methods*/

package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Employee {
	
	@Id
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "streetaddress")
	private String streetaddress;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "zipcode")
	private String zipcode;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "graddate")
	private String graddate;
	
	@Column(name = "graduationyear")
	private String graduationyear;
	
	@Column(name = "comments")
	private String comments;
	
	
	public Employee() {
		
	}
	
	public Employee(long id, String firstName, String lastName, String emailId, String streetaddress, String city,
			String state, String country, String zipcode, String phone, String url, String graddate, String graduationyear,
			String comments) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.streetaddress = streetaddress;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.phone = phone;
		this.url = url;
		this.graddate = graddate;
		this.graduationyear = graduationyear;
		this.comments = comments;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getStreetaddress() {
		return streetaddress;
	}
	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getGraddate() {
		return graddate;
	}
	public void setGraddate(String graddate) {
		this.graddate = graddate;
	}
	public String getGraduationyear() {
		return graduationyear;
	}
	public void setGraduationyear(String graduationyear) {
		this.graduationyear = graduationyear;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	} 
}