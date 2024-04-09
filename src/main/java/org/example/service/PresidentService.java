package org.example.service;

import org.example.model.President;
import org.example.repository.PresidentRepository;

public class PresidentService {
    private PresidentRepository presidentRepository = new PresidentRepository();
    public String add(President president){
        if (presidentRepository.add(president)){
            return "President "+president.getName()+" added! ➕";
        }
        return "President "+president.getName()+" not added.";
    }
    public String delete(President president){
        if (presidentRepository.delete(president)){
            return "President "+president.getName()+" deleted! \uD83D\uDDD1\uFE0F";
        }
        return "President "+president.getName()+" not deleted.";
    }
    public President find(String name){
        return presidentRepository.find(name);
    }
    public String update(President president){
        if (presidentRepository.update(president)){
            return "President "+president.getName()+" updated! \uD83D\uDD01";
        }
        return "President "+president.getName()+" not updated.";
    }
}
