package binding.combined;
class Parent{

    int age =10;

    public void showAge(){

        System.out.println("Parent Age:"+age);
    }
}

class ChildOne extends Parent{

    int age = 20;

    public void showAge(){

        System.out.println("child one age:"+age);
    }
}

class ChildTwo extends Parent{

    int age = 30;

    public void showAge(){

        System.out.println("Child Two Age:"+age);
    }
}
public class Application {


    public static void main(String[] args) {

        ChildOne  childOne = new ChildOne();
        System.out.println("childOne.age: "+ childOne.age);
         childOne.showAge();

        System.out.println("-----------------------------------------");

        Parent parentChildOne = new ChildOne();
        System.out.println("parentChildOne.age: "+parentChildOne.age);
        parentChildOne.showAge();

        System.out.println("-----------------------------------------");


        ChildTwo  childTwo = new ChildTwo();
        System.out.println("childTwo.age: "+ childTwo.age);
         childTwo.showAge();

        System.out.println("-----------------------------------------");

        Parent parentChildTwo = new ChildTwo();
        System.out.println("parentChildTwo.age: "+parentChildTwo.age);
        parentChildTwo.showAge();

    }
}