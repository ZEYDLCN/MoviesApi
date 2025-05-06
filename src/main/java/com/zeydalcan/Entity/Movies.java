package com.zeydalcan.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Filmler")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "film_adi")
	private String name;
	
	@Column(name = "film_yılı")
	private int year;
	
	@Column(name = "film_kazanci")
	private double revenue;
	
	@Column(name = "film_turu")
	private String genre;

}
