package org.example;

import org.example.connection.EntityManagerProvider;
import org.example.model.Country;
import org.example.model.President;
import org.example.service.CountryService;
import org.example.service.PresidentService;

public class Main {
    public static void main(String[] args) {

        /*PRESIDENT*/
            PresidentService presidentService = new PresidentService();
            President macron = new President("Macron", 40);
            President angela = new President("Merkel", 55);
            President silvio = new President("Berlusconi", 70);

            //ADD
            presidentService.add(macron);
            presidentService.add(angela);
            presidentService.add(silvio);

            //FIND
            System.out.println(presidentService.find("Merkel"));

            //DELETE
            presidentService.delete(silvio);

            //UPDATE
            angela.setAge(65);
            presidentService.update(angela);

        /*COUNTRY*/
            CountryService countryService = new CountryService();
            Country belgium = new Country("Belgium", 12000000);
            Country france = new Country("France", 78000000);
            Country germany = new Country("Germany", 150000000);
            Country italy = new Country("Italy", 65000000);

            //ADD
            countryService.add(belgium);
            countryService.add(france);
            countryService.add(germany);
            countryService.add(italy);

            //FIND
            System.out.println(countryService.find("belgium"));

            //DELETE
            countryService.delete(italy);

            //UPDATE
            germany.setPresident(angela);
            france.setPresident(macron);
            countryService.update(germany);
            countryService.update(france);

        /*CLOSE DB CONNECTION*/
        EntityManagerProvider.closeConnection();
    }
}