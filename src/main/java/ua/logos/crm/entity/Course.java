package ua.logos.crm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "cource")
@NoArgsConstructor
@Getter @Setter
public class Course extends BaseEntity {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
	
	private String title;
	@Column(length = 1000)
	private String description;
	
	@Column(columnDefinition = "DECIMAL(5,2)")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn (name = "teatcher_id")
	private Teatcher teatcher;
	
	@ManyToMany
	@JoinTable(name="Student_course",
			joinColumns = @JoinColumn(name="course_id"),
			inverseJoinColumns = @JoinColumn(name = "student_id"))
	private List<Student> students = new ArrayList<>();
	

}
