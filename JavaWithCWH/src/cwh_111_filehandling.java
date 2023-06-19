
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;

public class cwh_111_filehandling {
    public static void main(String[] args) {
        File myFile = new File("sim.txt");
        try{
            myFile.createNewFile();
        } catch(IOException e){
            System.out.println("Unable to create file.");
            e.printStackTrace();
        }
    }
}
