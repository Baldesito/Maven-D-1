package org.example;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main(String[] args ) {
        Faker faker = new Faker(new Locale("it-IT"));

        List<Persona> listaPersone = Arrays.asList(
                new Persona("AB123", faker.name().fullName()),
                new Persona("AB125", faker.name().fullName()),
                new Persona("AB121", faker.name().fullName()),
                new Persona("nhfhh", faker.name().fullName().strip())

            );
        listaPersone.forEach(System.out::println);
    }
}
