package com.dh.catalogservice.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
public class SeasonWS {
    private String id;
    private Integer seasonNumber;
    private List<ChapterWS> chapters;
}