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
public class Country {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull @Size(max = 3, min = 3)
    private String code;
    @NotNull @Size(max = 52)
    private String name;
    @NotNull
    private String continent;
    @NotNull @Size(max = 26)
    private String region;
    @NotNull
    private Double surfaceArea;
    private Short indepYear;
    @NotNull
    private Long population;
    private Double lifeExpectancy;
    private Double gnp;
    @NotNull
    private String localName;
    @NotNull
    private String governmentForm;
    private String headOfState;
    private City capital;
    @NotNull
    private String code2;
}
