package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitatyService {
    private CitatyRepository citatyRepository;
    private NahodneCisloService nahodneCisloService;

    @Autowired
    public CitatyService(CitatyRepository citatyRepository, NahodneCisloService nahodneCisloService) {
        this.citatyRepository = citatyRepository;
        this.nahodneCisloService = nahodneCisloService;
    }

    @Autowired
    public String nahodnyCitat() {
        return new CitatyRepository().citat(nahodneCisloService.dejNahodneCislo(citatyRepository.pocet()));
    }

}
