/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashton
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names =  new String[80];
        int [] scores = new int[80];
        
       
    }
    private static void readNamesAndScores(String[] names, int[]scores, String filename){
        try {
            Scanner scan = new Scanner(new File(filename));
            int index = 0;
            while(scan.hasNext()){
                String[] line = scan.nextLine().split(" ");
                
                names[index] = line[0];
                scores[index] = Integer.parseInt(line[1]);
                index++;
                
                
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("File not found in readingNamesAndScores");
        }
        
    }
}
