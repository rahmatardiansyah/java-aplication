package tutorial;

// cara membuat class
class Person {
    
    //contoh field
    String name;
    String address;
    final String country = "Indonesia";
    
    // Membuat Konstactor
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }
    
    // Membuat Konstraktor Overloading
    Person(String paramName){
        //tidak baik jika sudah komplesk
        //name = paramName;
        
        // Memanggil constructor lain/memanggil constructor Kedua berarti memanggil Konstructor yang pertama
        // karena Person Awal menggunakan 2 parameter jadi set null
        this(paramName, null);
    }
    
    // Membuat Konstarktor tanpa parameter
    Person(){
        // ketika manggil konstructor yang ketiga sebenarnya memanggil konstructor yang kedua
        this(null);
    }
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
    
    
}
