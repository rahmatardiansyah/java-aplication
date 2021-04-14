package tutorial;

// Inheritance / pewarisan
// membuat class child
// artinya class VicePresident turunan dari class Manager
class VicePresident extends Manager{
    
    
    // keyword super bisa digunakan untuk mengakses method,field,konstraktor
    // jika ada constructor di parent class . di child class harus manggil constructor juga kecuali default constructor
    // untuk mengakses nya harus didalam child constructor
    // jika parameter Constructor parent nya kosong.boleh tidak manggil constructor child nya bisa disebut default constructor
    VicePresident(String name){
        super(name);
    }
    // Method Overriding
    // Method Overriding beda sama Method Overloading
    // Ketika membuat object dari child class/VicePresident maka method akan ditimpa
    
    void sayHello(String name){
        System.out.println("Hi " + name + ", my Name is VP " + this.name);
    }
}
