package org.example;

import org.example.connection.EntityManagerProvider;
import org.example.model.Country;
import org.example.model.President;
import org.example.service.CountryService;
import org.example.service.PresidentService;

public class Main {
    public static void main(String[] args) {

        /*PRESIDENT*/
            System.out.println("\n########## PRESIDENT ##########");
            PresidentService presidentService = new PresidentService();
            President macron = new President("Macron", 40);
            President angela = new President("Merkel", 55);
            President silvio = new President("Berlusconi", 70);

            //ADD
            System.out.println(presidentService.add(macron));
            System.out.println(presidentService.add(angela));
            System.out.println(presidentService.add(silvio));

            //FIND
            President foundPresident = presidentService.find("Merkel");
            System.out.println(foundPresident!=null ? "President found: "+foundPresident+" \uD83D\uDD0E" : "President not found");

            //DELETE
            System.out.println(presidentService.delete(silvio));

            //UPDATE
            angela.setAge(65);
            System.out.println(presidentService.update(angela));

        /*COUNTRY*/
            System.out.println("\n########## COUNTRY ##########");
            CountryService countryService = new CountryService();
            Country belgium = new Country("Belgium", 12000000);
            Country france = new Country("France", 78000000);
            Country germany = new Country("Germany", 150000000);
            Country italy = new Country("Italy", 65000000);

            //ADD
            System.out.println(countryService.add(belgium));
            System.out.println(countryService.add(france));
            System.out.println(countryService.add(germany));
            System.out.println(countryService.add(italy));

            //FIND
            Country foundCountry = countryService.find("belgium");
            System.out.println(foundCountry!=null ? "Country found: "+foundCountry+" \uD83D\uDD0E" : "Country not found");

            //DELETE
            System.out.println(countryService.delete(italy));

            //UPDATE
            germany.setPresident(angela);
            france.setPresident(macron);
            System.out.println(countryService.update(germany));
            System.out.println(countryService.update(france));

        /*CLOSE DB CONNECTION*/
        EntityManagerProvider.closeConnection();
    }
}