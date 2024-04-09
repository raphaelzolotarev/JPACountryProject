package org.example.model;

import javax.persistence.*;

@Entity
public class Country {

    @Id
    @Column(name = "country_name")
    private String name;
    @Column(name = "country_population")
    private long population;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    private President president;

    public Country(){}
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    public Country(String name, int population, President president) {
        this.name = name;
        this.population = population;
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public President getPresident() {
        return president;
    }

    public void setPresident(President president) {
        this.president = president;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", president=" + president +
                '}';
    }
}
