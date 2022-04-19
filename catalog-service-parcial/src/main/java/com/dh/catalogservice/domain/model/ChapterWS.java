package com.dh.catalogservice.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
public class ChapterWS {
    private String id;
    private Integer chapterNumber;
    private String chapterName;
    private String urlStream;
}