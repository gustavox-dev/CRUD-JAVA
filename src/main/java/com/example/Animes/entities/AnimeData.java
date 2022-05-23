package com.example.Animes.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor

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
