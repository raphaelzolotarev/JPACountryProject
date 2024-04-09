package org.example.service;

import org.example.model.Country;
import org.example.repository.CountryRepository;

public class CountryService {
    private CountryRepository countryRepository = new CountryRepository();
    private Country country;

    public void add(Country country){
        countryRepository.addCountry(country);
    }
    public void delete(Country country){
        countryRepository.delete(country);
    }
    public void find(String name){
        countryRepository.find(name);
    }
    public void update(Country country){
        countryRepository.update(country);
    }
}
