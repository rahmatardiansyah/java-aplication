package tutorial;

public class ManagerApp {
    public static void main(String[] args) {
        
        
        Manager manager = new Manager("rahmat");
        manager.name = "Rahmat";
        manager.sayHello("Budi");
        
        
        // mengakses child class/method overiding
        VicePresident vp = new VicePresident("eko");
        vp.name = "eko";
        vp.sayHello("joko");
        
    }
}
