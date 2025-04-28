package ru.job4j.di.annotation;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Man {
    @Autowired
    @Qualifier("SecondDog")
    private Dog dog;
    @Resource(name = "someDog")
    private Dog secondDog;
    private Bird bird;
    private Cat cat;
    @Autowired
    private Set<Pet> pets;

    @Autowired
    private List<Pet<Dog>> dogs;

    @Autowired
    private Map<String, Pet> mapDogs;

    @Autowired
    public Man(Cat cat) {
        this.cat = cat;
    }

    @Autowired
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Dog getSecondDog() {
        return secondDog;
    }

    public void setSecondDog(Dog secondDog) {
        this.secondDog = secondDog;
    }

    public Bird getBird() {
        return bird;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet<Dog>> getDogs() {
        return dogs;
    }

    public void setDogs(List<Pet<Dog>> dogs) {
        this.dogs = dogs;
    }

    public Map<String, Pet> getMapDogs() {
        return mapDogs;
    }

    public void setMapDogs(Map<String, Pet> mapDogs) {
        this.mapDogs = mapDogs;
    }

    public void print() {
        System.out.printf("My Dog: %s%n", dog.print());
        System.out.printf("My Second dog: %s%n", secondDog.print());
        System.out.printf("My Cat: %s%n", cat.print());
        System.out.printf("My Bird: %s%n", bird.print());
        System.out.println("pets:");
        pets.forEach(s -> System.out.println(s.print()));
        System.out.println("dogs:");
        dogs.forEach(s -> System.out.println(s.print()));
        System.out.println("mapDogs:");
        mapDogs.forEach((key, value) -> System.out.printf("%s - %s%n", key, value.print()));
    }
}
