package com.github.adetiamarhadi.sfgrestdocsexample.repositories;

import com.github.adetiamarhadi.sfgrestdocsexample.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
