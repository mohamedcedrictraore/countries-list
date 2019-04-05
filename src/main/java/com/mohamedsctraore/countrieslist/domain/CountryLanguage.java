package com.mohamedsctraore.countrieslist.domain;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by mohamed on 4/5/19.
 */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Country country;
    @NotNull
    private String countryCode;
    @NotNull @Size(max = 30)
    private String language;
    @NotNull @Size(max = 1, min = 1)
    private String isOfficial;
    @NotNull
    private Double percentage;
}
