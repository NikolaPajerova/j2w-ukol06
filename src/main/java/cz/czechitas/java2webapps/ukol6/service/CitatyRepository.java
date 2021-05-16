package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitatyRepository {
    private final List<String> seznamCitatu = List.of(
            "Zatímco ztrácíme svůj čas váháním a odkládáním, život utíká. (Seneca)",
            "Šťasten být neumíš, protože po tom, co nemáš, se ženeš, a co máš, na to zapomínáš. (William Shakespeare)",
            "Díky nemoci známe hodnotu zdraví, díky zlu hodnotu dobra, díky hladu sytost, díky únavě odpočinek. (Hérakleitos)",
            "Že nedostanete v životě vždy, co chcete, je někdy obrovské štěstí. (Dalajláma)",
            "Náš největší úspěch není v tom, že nepadneme, ale v tom, že vždy vstaneme, kdykoli padneme. (Konfucius)",
            "Pamatuj, že i ta nejtěžší hodina ve tvém životě, má jen 60 minut. (Sofoklés)",
            "Nemluv, pokud tvá slova nejsou lepší než ticho. (Buddha)",
            "Opravdová moudrost je v poznání vlastní nevědomosti. (Sókratés)"
    );

    public int pocet() {
        return seznamCitatu.size();
    }

    public String citat(int poradi) {
        return seznamCitatu.get(poradi);
    }

}
