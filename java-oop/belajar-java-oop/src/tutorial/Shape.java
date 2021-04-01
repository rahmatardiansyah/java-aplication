package tutorial;

class Shape {
    
    int getCorner(){
        return 0;
    }
}

class Rectangel extends Shape{
    
    int getCorner(){
        
        return 4;
    }
    
    
    // membuat super keyword
    // gunanya untuk mengakses method di parent
    int getParentCorner(){
        return super.getCorner();
    }
    
}