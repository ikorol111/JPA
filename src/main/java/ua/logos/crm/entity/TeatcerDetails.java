package ua.logos.crm.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teatcher_details")
@NoArgsConstructor
@Getter @Setter

public class TeatcerDetails extends BaseEntity{

	private String email;
	
	private String hobby;
	

}
