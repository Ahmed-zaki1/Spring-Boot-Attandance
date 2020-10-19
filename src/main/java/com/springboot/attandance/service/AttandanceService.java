package com.springboot.attandance.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.attandance.model.Attandance;

@Service
public class AttandanceService {
    private static List<Attandance> Attandances = new ArrayList<Attandance>();
    private static int AttandanceCount = 3;

    static {
        Attandances.add (new Attandance(1, "Adnan", new Date(), false));
        Attandances.add(new Attandance(2, "Zaki", new Date(), false));
        Attandances.add(new Attandance(3, "Ahmed", new Date(),
                false));
       
    }

    public List<Attandance> retrieveAttandances(String Name) {
        List<Attandance> filteredAttandances = new ArrayList<Attandance>();
        for (Attandance Attandance : Attandances) {
            if (Attandance.getName().equals(Name)) {
                filteredAttandances.add(Attandance);
            }
        }
        return filteredAttandances;
    }

    public Attandance retrieveAttandances(int id) {
        for (Attandance Attandance : Attandances) {
            if (Attandance.getRoll_No()==id) {
                return Attandance;
            }
        }
        return null;
    }
    
    public void updateAttandance(Attandance Attandance) {
    	Attandances.remove(Attandance);
    	Attandances.add(Attandance);
    }
    
    public void addAttandance(int Roll_No,String name, Date Date,
            boolean isDone) {
        Attandances.add(new Attandance(++AttandanceCount, name, Date, isDone));
    }

    public void deleteAttandance(int id) {
        Iterator<Attandance> iterator = Attandances.iterator();
        while (iterator.hasNext()) {
            Attandance Attandance = iterator.next();
            if (Attandance.getRoll_No() == id) {
                iterator.remove();
            }
        }
    }
}