package JavaSe.IZ0808.Part1;
abstract class Animal {
    private String name;

    Animal(String name) {
       this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;
    /*
    Dog(String breed) {
        this.breed = breed;
    }*/

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class Soal036 {

}
