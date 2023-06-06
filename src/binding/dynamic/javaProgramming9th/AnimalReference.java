package binding.dynamic.javaProgramming9th;

/**
 * Main class. See full discussion in Java Programming 9th Edition,
 * Chapter 11, titled "Using Dynamic method binding" p.523.
 *
 * The helper classes (Animal, Cow, Dog) appear in the
 * previous section p.515-516
 */

public class AnimalReference {
    public static void main(String[] args) {
        Animal animalRef;
        animalRef=new Cow();
        animalRef.speak();
        animalRef= new Dog();
        animalRef.speak();
    }
}

//Remarks.
//  1. Although you can't instantiate an abstract class (Animal) you
//      may store an object to a reference which is of type the abstract.
//      In case at hand, a Cow is stored to animalRef and similarly a Dog.
//  2. Which method will be called is resolved at the very end (during the run-time)
//      because at the runtime the type of the object is resolved.
//  3. Instance methods are resolved later, at the run-time.
//      Hence, "dynamic method binding" aka "late method binding".
//  4. Class (i.e. static) methods are resolved early, at the compilation time.
//      Hence, "static method binding".