package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NahodneCisloService {
    private final Random random = new Random();

    public int dejNahodneCislo(int horniMez) {
        int nahodneCislo = random.nextInt(horniMez);
        return nahodneCislo;
    }
}
