package com.dh.catalogservice.api.service;

import com.dh.catalogservice.domain.model.CatalogWS;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



public interface CatalogService {
    CatalogWS getCatalogByGenre(String genre);
}
