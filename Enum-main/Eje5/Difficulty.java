package com.Ejercicios.Eje5;

public enum Difficulty {
   EASY("The level is easy."),
   MEDIUM("The level is medium."),
   HARD("The level is hard."),
   EXPERT("The level is expert.");

   private final String DiffiltyLevel;

   private Difficulty(String difficultyLevel) {
      this.DiffiltyLevel = difficultyLevel;
   }

   public String getDifficultyLevel() {
      return DiffiltyLevel;
   }
}

class Main {
   public static void main(String[] args) {
      Difficulty diff = Difficulty.HARD;
      System.out.println(diff.getDifficultyLevel());
   }
}

