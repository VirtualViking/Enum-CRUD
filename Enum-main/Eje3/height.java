package com.Ejercicios.Eje3;


public enum height {
    TALL  (3),  
    MEDIUM(2),  
    SHORT (1);


    private final int levelCode;
    
    private height(int levelCode){ this.levelCode = levelCode;}

    public int getLevelCode() {
        return levelCode;
    }
}
class Main {
    public static void main(String[] args) {
        height size = height.SHORT;
        System.out.println(size.getLevelCode());
    }
}
