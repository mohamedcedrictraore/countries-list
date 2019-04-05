package com.mohamedsctraore.countrieslist.repository;

import com.mohamedsctraore.countrieslist.domain.City;
import com.mohamedsctraore.countrieslist.domain.Country;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by mohamed on 4/5/19.
 */
public interface CityRepository extends PagingAndSortingRepository<City, Long> {
    List<City> findAllByCountry(Country country, Pageable pageable);
}
