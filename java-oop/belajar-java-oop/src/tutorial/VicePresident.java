package tutorial;

// Inheritance / pewarisan
// membuat class child
// artinya class VicePresident turunan dari class Manager
class VicePresident extends Manager{
    
    // Method Overriding
    // Method Overriding beda sama Method Overloading
    // Ketika membuat object dari child class/VicePresident maka method akan ditimpa
    
    void sayHello(String name){
        System.out.println("Hi " + name + ", my Name is VP " + this.name);
    }
}
