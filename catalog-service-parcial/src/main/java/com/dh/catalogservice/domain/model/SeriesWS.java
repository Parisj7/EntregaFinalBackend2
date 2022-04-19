package com.dh.catalogservice.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "SeriesCatalog")
//@JsonIgnoreProperties(ignoreUnknown = true)
public class SeriesWS {

    private String id;
    private String name;
    private String genre;
    private List<SeasonWS> seasons;
}
