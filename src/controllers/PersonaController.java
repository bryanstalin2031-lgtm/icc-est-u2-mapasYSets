package controllers;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Persona;

public class PersonaController {
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edad) {
        Set<Persona> personasFiltadras = new TreeSet<>((p1, p2) -> {
            int nombreCompare = p2.getNombre().compareToIgnoreCase(p1.getNombre());
            if (nombreCompare != 0) {
                return nombreCompare;
            } else {
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }
        });
        for (Persona persona : personas) {
            if (persona.getEdad() > edad) {
                personasFiltadras.add(persona);
            }
        }
        return personasFiltadras;
    }

    public Map<String, Set<String>> agruparPorRangoEdad(List<Persona> personas) {
    Map<String, Set<String>> personasAgrupadas = new TreeMap<>();
    
    personasAgrupadas.put("JOVEN", new LinkedHashSet<>());
    personasAgrupadas.put("ADULTO", new LinkedHashSet<>());
    personasAgrupadas.put("ADULTO MAYOR", new LinkedHashSet<>());

    for (Persona persona : personas) {
        String primerNombre = persona.getNombre().split(" ")[0];
        
        if (persona.getEdad() < 30) {
            personasAgrupadas.get("JOVEN").add(primerNombre);
        } else if (persona.getEdad() < 60) {
            personasAgrupadas.get("ADULTO").add(primerNombre); 
        } else {
            personasAgrupadas.get("ADULTO MAYOR").add(primerNombre);
        }
    }
    
    return personasAgrupadas;
}
}
