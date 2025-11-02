//main method can be created without even a class
//JVM automatically creates a class for you having a default constructor
//by default the class would be Final

void main(){
//    System.out.println("Compact source File");
    //for beginners, no need to use System.out.println() to print instead we can use IO like below

    IO.println("Compact Source File");

    IO.print("Enter your name: ");
    String name = IO.readln();
    IO.println("Hello "+name);

    //call the below method
    demo();
}

//can have other methods as well

public void demo(){
    IO.println("demo method");
}
