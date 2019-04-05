package com.mohamedsctraore.countrieslist.domain;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mohamed on 4/5/19.
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryGPD {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Short year;
    private Double value;
}
