/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.battledev;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author ml.riedinger
 *
 *
 *
 * /** Liens Stackoverflow
 * https://stackoverflow.com/questions/45826412/how-to-parse-a-simple-text-file-in-java
 * https://stackoverflow.com/questions/4716503/reading-a-plain-text-file-in-java
 * https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java
 * @author ml.riedinger
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("..\\exercices\\BattleDev S11 - Mars 2018\\Exercice 1 - Le meilleur restaurant\\input1.txt"));
            String line;
            double bestNote = 0;
            while ((line = reader.readLine()) != null) {
                String[] notes = line.split(" ");
                if (notes.length > 1) {
                    float average = (Float.parseFloat(notes[0]) + Float.parseFloat(notes[1]) + Float.parseFloat(notes[2])) / 3;
                    double finalAverage = Math.ceil(average);
                    if (bestNote < finalAverage) {
                        bestNote = finalAverage;
                    }
                }
            }
            System.out.println(bestNote);
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}
