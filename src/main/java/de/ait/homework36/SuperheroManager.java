package de.javalessons.homework36;

import java.util.ArrayList;
import java.util.List;

public class SuperheroManager {
    private List<Superhero> superheroes;

    public SuperheroManager() {
        superheroes = new ArrayList<>();
    }

    public List<Superhero> getAllSuperheroes() {

        return new ArrayList<>(superheroes);
    }


    public void addSuperhero(Superhero superhero) {
        if (!superheroes.contains(superhero)) {
            superheroes.add(superhero);
        }
    }

    public void removeSuperhero(String name) {
        superheroes.removeIf(superhero -> superhero.getName().equals(name));
    }

    public Superhero getSuperhero(String name) {
        for (Superhero superhero : superheroes) {
            if (superhero.getName().equals(name)) {
                return superhero;
            }
        }
        return null;
    }
}
