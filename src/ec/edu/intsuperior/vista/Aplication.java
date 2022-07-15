package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Date;

public class Aplication {

    public static void main(String[] args) {

        Persona peple = new Persona();
        Date fec = new Date(); 
        fec.setYear(1800);
        fec.setMonth(7);
        fec.setDate(16);
        Persona obj1 = new Persona("1727712778", "Alejandro", "Matias", "Erazo", "Noboa", "Cayambe", fec, "mati.era@intsuperior.edu.ec");

        System.out.println("fecha de naciemiento:   " + obj1.getFechaNacimiento().getYear() + "/" + obj1.getFechaNacimiento().getMonth()
                + "/" + obj1.getFechaNacimiento().getDate());
    }
}
