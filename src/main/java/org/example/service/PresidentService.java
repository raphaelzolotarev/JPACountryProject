package org.example.service;

import org.example.model.President;
import org.example.repository.PresidentRepository;

public class PresidentService {
    private PresidentRepository presidentRepository = new PresidentRepository();
    public void add(President president){
        presidentRepository.add(president);
    }
    public void delete(President president){
        presidentRepository.delete(president);
    }
    public President find(String name){
        return presidentRepository.find(name);
    }
    public void update(President president){
        presidentRepository.update(president);
    }
}
