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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    @NotNull @Size(max = 35)
    private String name;
    @NotNull @Size(max = 3, min = 3)
    private Country country;
    @NotNull @Size(max = 20)
    private String district;
    private Long population;
}
