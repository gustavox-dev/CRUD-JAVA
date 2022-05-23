package com.example.Animes.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonDeserialize
public class AnimeData {

	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	private Data data;

	public AnimeData() {
	}

	public AnimeData(Data data) {
		this.data = data;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	
}
