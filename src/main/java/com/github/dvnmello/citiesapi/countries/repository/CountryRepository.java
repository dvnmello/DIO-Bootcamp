package com.github.dvnmello.citiesapi.countries.repository;

import com.github.dvnmello.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
