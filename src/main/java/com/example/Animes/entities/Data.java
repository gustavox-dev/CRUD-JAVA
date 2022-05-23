package com.example.Animes.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Data {
	
	@Autowired
	private List<Animes> data;
	
	public Data() {
		
	}
	
	public Data(List<Animes> data) {
		this.data = data;
	}

	public List<Animes> getAnimes() {
		return data;
	}

	public void setAnimes(List<Animes> data) {
		this.data = data;
	}
	
	

}
