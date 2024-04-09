package org.example.service;

import org.example.model.Country;
import org.example.repository.CountryRepository;

public class CountryService {
    private CountryRepository countryRepository = new CountryRepository();
    public void add(Country country){
        countryRepository.add(country);
    }
    public void delete(Country country){
        countryRepository.delete(country);
    }
    public Country find(String name){
        return countryRepository.find(name);
    }
    public void update(Country country){
        countryRepository.update(country);
    }
}
