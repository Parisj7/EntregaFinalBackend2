package com.dh.catalogservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "Catalogo")
@AllArgsConstructor
@NoArgsConstructor
public class CatalogWS {

	private String genre;
	private List<MovieWS> movies;
	private List<SeriesWS> series;

}