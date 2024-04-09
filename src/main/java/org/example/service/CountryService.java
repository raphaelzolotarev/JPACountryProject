package org.example.service;

import org.example.model.Country;
import org.example.repository.CountryRepository;

public class CountryService {
    private CountryRepository countryRepository = new CountryRepository();
    public String add(Country country){
        if (countryRepository.add(country)){
            return "Country "+country.getName()+" added! ➕";
        }
        return "Country "+country.getName()+" not added.";
    }
    public String delete(Country country){
        if (countryRepository.delete(country)){
            return "Country "+country.getName()+" deleted! \uD83D\uDDD1\uFE0F";
        }
        return "Country "+country.getName()+" not deleted.";
    }
    public Country find(String name){
        return countryRepository.find(name);
    }
    public String update(Country country){
        if (countryRepository.update(country)){
            return "Country "+country.getName()+" updated! \uD83D\uDD01";
        }
        return "Country "+country.getName()+" not updated.";
    }
}
