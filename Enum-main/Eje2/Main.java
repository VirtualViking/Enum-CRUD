package com.Ejercicios.Eje2;

public class Main {
    Seasons seasons;
    
    public Main(Seasons seasons) {
        this.seasons = seasons;
    }
    
    public void tellItLikeItIs() {
        switch (seasons) {
            case WINTER:
                System.out.println("Winter is so cold.");
                break;
                    
            case SPRING:
                System.out.println("Spring is so beaitiful.");
                break;
                         
            case FALL:
                System.out.println("Seeing the leafs dropping in fall is awesome.");
                break;
                        
            default:
                System.out.println("All the seasons are good in different ways.");
                break;
        }
    }
    
    public static void main(String[] args) {
        Main firstSeason = new Main(Seasons.SPRING);
        firstSeason.tellItLikeItIs();
        Main secondSeason = new Main(Seasons.SUMMER);
        secondSeason.tellItLikeItIs();
        Main lastSeason = new Main(Seasons.WINTER);
        lastSeason.tellItLikeItIs();
    }
}
