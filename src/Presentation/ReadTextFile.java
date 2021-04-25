package Presentation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

    public static void main(String[] args) {
        String tempContainer;
        String finalContainer ="";

        try {
            FileReader fileReader = new FileReader("src/Presentation/file.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((tempContainer =bufferedReader.readLine())!= null){
                finalContainer= finalContainer +"\n" + tempContainer;
            }

        } catch (FileNotFoundException e) {
            System.out.println("please fix your file name");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalContainer);
    }





}
