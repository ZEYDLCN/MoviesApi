package com.zeydalcan.Dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MoviesDtoIU {
	
	@NotEmpty(message = "Film Adı Alanı Boş Geçilemez !! ")
	@Size(min = 3, max = 30, message = "Minimum 3, Maximum 30 Karakter Girebilirsiniz !! ")
	private String name;
	
	@NotNull(message = "Film Yılı Girmek Zorunludur, Boş Geçilemez !!")
	@Min(value = 3,message = "Minimum 4 Karakter Girmek Zorundasınız")
	@Max(value = 4,message = "Olmayan Bir Yıl Giremezsiniz !!")
	private int year;
	
	
	private double revenue;
	
	@NotEmpty(message = "Film Türü Alanı Boş Geçilemez !! ")
	@Size(min = 3, max = 20, message = "Minimum 3, Maximum 20 Karakter Girebilirsiniz !! ")
	private String genre;
}
