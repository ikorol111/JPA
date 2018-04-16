package ua.logos.crm.entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "teatcher")

public class Teatcher extends BaseEntity{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
	
	@Column(name="first_name", length = 50)
	private String firstName;
	
	@Column(name="last_name", length = 60)
	private String lastName;
	
	private int age;
	
	@OneToMany(mappedBy = "teatcher")
	private List<Course> courses = new ArrayList<Course>();
	
	@OneToOne
	@JoinColumn(name = "teatcher_details_id")
	private TeatcerDetails teatcerDetails;
	
	
	public TeatcerDetails getTeatcerDetails() {
		return teatcerDetails;
	}

	public void setTeatcerDetails(TeatcerDetails teatcerDetails) {
		this.teatcerDetails = teatcerDetails;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Teatcher () {
		
	}

//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
