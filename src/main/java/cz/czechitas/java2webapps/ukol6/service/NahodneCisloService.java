package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class NahodneCisloService {
    private Random random;

    public int dejNahodneCislo(int horniMez) {
        this.random = new Random(horniMez);
        return horniMez;
    }
}
