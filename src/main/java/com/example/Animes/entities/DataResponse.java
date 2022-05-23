package com.example.Animes.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
//@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonDeserialize
@JsonPropertyOrder("data")
public class DataResponse {
	
	@Autowired
	private List<Animes> data;

	public DataResponse() {
		
	}
	
	public DataResponse(List<Animes> data) {
		super();
		this.data = data;
	}

	public List<Animes> getData() {
		return data;
	}

	public void setData(List<Animes> data) {
		this.data = data;
	}

	
	
	

}