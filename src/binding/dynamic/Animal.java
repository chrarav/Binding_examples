package binding.dynamic;

/**
 * @author: Java T Point
 * @description: an example of dynamic binding
 */
class Animal {

   void eat(){
        System.out.println("Animal is eating.");
    }
}


class Dog extends Animal{
   void eat(){
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Animal a = new Dog();

        /**The type of the object will be resolved
         * at the run-time. That means at the end
         * will be decided the type of the object
         * and the suitable eat method will be called.
        */
         a.eat();
    }
}