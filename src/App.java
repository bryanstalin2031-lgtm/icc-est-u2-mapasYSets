import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import controllers.PersonaController;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = new ArrayList<>();

    
        personas.add(new Persona("Juan Perez", 20));
        personas.add(new Persona("JUAN PEREZ", 20));    // Duplicado
        personas.add(new Persona("juan perez", 20));    // Duplicado
        personas.add(new Persona("Ana Torres", 25));
        personas.add(new Persona("ana torres", 25));    // Duplicado
        personas.add(new Persona("Luis Ramirez", 29));
        personas.add(new Persona("Ana Rivas", 22));     // Comparte 1er nombre con Ana Torres
        personas.add(new Persona("Carlos Gomez", 18));
        personas.add(new Persona("Mateo Rojas", 21));
        personas.add(new Persona("Camila Ruiz", 19));
        personas.add(new Persona("Camila Sanchez", 19));// Comparte 1er nombre con Camila Ruiz
        personas.add(new Persona("Pedro Velez", 28));
        personas.add(new Persona("Sofia Morales", 20));
        personas.add(new Persona("sofia morales", 20)); // Duplicado
        personas.add(new Persona("Diego Castro", 23));
        personas.add(new Persona("Valeria Mendoza", 19));
        personas.add(new Persona("Andrea Cruz", 20));
        personas.add(new Persona("Elena Flores", 24));
        personas.add(new Persona("Miguel Ortiz", 26));
        personas.add(new Persona("Miguel Suarez", 27)); // Comparte 1er nombre con Miguel Ortiz

        // --- GRUPO 2: ADULTOS (30 <= Edad < 60) - 20 registros ---
        personas.add(new Persona("Carlos Silva", 35));
        personas.add(new Persona("CARLOS SILVA", 35));  // Duplicado
        personas.add(new Persona("Maria Lopez", 45));
        personas.add(new Persona("Diego Castro", 50));  // Mismo nombre que un joven, pero diferente edad
        personas.add(new Persona("Juan Morales", 55));  // Comparte 1er nombre con Juan Perez
        personas.add(new Persona("Lucia Vega", 32));
        personas.add(new Persona("LUCIA VEGA", 32));    // Duplicado
        personas.add(new Persona("Javier Herrera", 40));
        personas.add(new Persona("javier herrera", 40));// Duplicado
        personas.add(new Persona("Mateo Cardenas", 38));
        personas.add(new Persona("Valeria Torres", 42));
        personas.add(new Persona("Pablo Reyes", 47));
        personas.add(new Persona("PABLO REYES", 47));   // Duplicado
        personas.add(new Persona("Sofia Rivas", 31));
        personas.add(new Persona("Andres Mazo", 59));   // Límite superior de ADULTO
        personas.add(new Persona("andres mazo", 59));   // Duplicado
        personas.add(new Persona("Teresa Salinas", 52));
        personas.add(new Persona("Roberto Carlos", 44));
        personas.add(new Persona("roberto carlos", 44));// Duplicado
        personas.add(new Persona("Maria Gomez", 33));   // Comparte 1er nombre con Maria Lopez

        // --- GRUPO 3: MAYORES (Edad >= 60) - 20 registros ---
        personas.add(new Persona("Pedro Gomez", 65));
        personas.add(new Persona("pedro gomez", 65));   // Duplicado
        personas.add(new Persona("Elena Flores", 70));  // Mismo nombre que una joven, pero diferente edad
        personas.add(new Persona("Javier Herrera", 60));// Límite exacto de MAYOR
        personas.add(new Persona("Maria Castillo", 80));// Comparte 1er nombre con Maria Lopez/Gomez
        personas.add(new Persona("Juan Perez", 90));    // Mismo nombre que el joven, diferente edad
        personas.add(new Persona("Carlos Lopez", 62));
        personas.add(new Persona("CARLOS LOPEZ", 62));  // Duplicado
        personas.add(new Persona("Luis Fernandez", 75));
        personas.add(new Persona("Rosa Martinez", 68));
        personas.add(new Persona("rosa martinez", 68)); // Duplicado
        personas.add(new Persona("Antonio Banderas", 82));
        personas.add(new Persona("Antonio Velez", 81)); // Comparte 1er nombre con Antonio Banderas
        personas.add(new Persona("Carmen Salinas", 77));
        personas.add(new Persona("Jorge Nitales", 64));
        personas.add(new Persona("jorge nitales", 64)); // Duplicado
        personas.add(new Persona("Arturo Calle", 95));
        personas.add(new Persona("Francisco Perez", 61));
        personas.add(new Persona("FRANCISCO PEREZ", 61));// Duplicado
        personas.add(new Persona("Silvia Pinal", 88));
        runPersonController(personas);

        
    }

    private static void runPersonController(List<Persona> personas) {
        PersonaController personaController = new PersonaController();
        Set<Persona> personasFiltradas = personaController.filtrarYOrdenar(personas, 20); 
        
        for (Persona p : personasFiltradas) {
            System.out.println(p.getNombre()+p.getEdad());
        }

        Map<String, Set<String>> personasAgrupadas = personaController.agruparPorRangoEdad(personas);
        
        for (Map.Entry<String, Set<String>> entry : personasAgrupadas.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    
}
