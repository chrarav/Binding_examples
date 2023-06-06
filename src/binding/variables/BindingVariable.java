package binding.variables;

class MyClass {
    public  String var = "base";

    public void printVar() {
        System.out.println(var);
    }
}

class MyDerivedClass extends MyClass {
    public  String var = "derived";

    public void printVar() {
        System.out.println(var);
    }
}

public class BindingVariable {
    public static void main(String[] args) {
        MyClass base = new MyClass();
        MyClass derived = new MyDerivedClass();

        System.out.println(base.var);
        System.out.println(derived.var);
        base.printVar();
        derived.printVar();
    }
}

//Remarks.
//  1.The power of late binding and overriding is available,
//      but only when instance methods are used.
//  2. Another reason is that if we had dynamic resolution of
//      the fields, then would not be possible to access MyClass.var
//      if we had a MyDerivedClass instance.
