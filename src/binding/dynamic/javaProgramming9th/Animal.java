package binding.dynamic.javaProgramming9th;

/**
 * Helper class for the AnimalReference
 */
public abstract class Animal {
    private String name;
    public  abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String animalName) {
        this.name = animalName;
    }
}
