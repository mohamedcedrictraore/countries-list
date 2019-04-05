package com.mohamedsctraore.countrieslist.repository;

import com.mohamedsctraore.countrieslist.domain.Country;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mohamed on 4/5/19.
 */
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
}
