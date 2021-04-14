package tutorial;

class Manager {
    String name;
    
    
    Manager(String name){
        this.name = name;
    }
    
    
    void sayHello(String name){
        System.out.println("Hi " + name + ", my Name is Manager " + this.name);
    }
}
