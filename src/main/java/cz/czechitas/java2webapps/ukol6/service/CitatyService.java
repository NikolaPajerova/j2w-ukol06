package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitatyService {

    @Autowired
    public String nahodnyCitat() {
        int mez = new CitatyRepository().pocet();
        int cislo = new NahodneCisloService().dejNahodneCislo(mez);
        return new CitatyRepository().citat(cislo);
    }

}
