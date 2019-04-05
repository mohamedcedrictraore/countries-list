package com.mohamedsctraore.countrieslist.repository;

import com.mohamedsctraore.countrieslist.domain.Country;
import com.mohamedsctraore.countrieslist.domain.CountryLanguage;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by mohamed on 4/5/19.
 */
public interface CountryLanguageRepository extends PagingAndSortingRepository<CountryLanguage, Long> {
    List<CountryLanguage> findAllByCountry(Country country, Pageable pageable);
}
