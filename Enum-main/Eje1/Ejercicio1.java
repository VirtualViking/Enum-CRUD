package com.Ejercicios.Eje1;

public class Ejercicio1 {
    public enum Week { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }   
    public static void main(String[] args) {  
    for (Week s : Week.values()){  
    System.out.println(s);  
    }  
    System.out.println("Value of MONDAY is: "+Week.valueOf("MONDAY"));  
    System.out.println("Index of MONDAY is: "+Week.valueOf("MONDAY").ordinal());  
    System.out.println("Index of WEDNESDAY is: "+Week.valueOf("WEDNESDAY").ordinal());  

}
}