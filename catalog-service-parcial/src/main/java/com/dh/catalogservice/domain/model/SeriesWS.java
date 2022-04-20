package com.dh.catalogservice.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "SeriesCatalog")
public class SeriesWS {
    @Id
    private String id;
    private String name;
    private String genre;
    private List<SeasonWS> seasons;
}
