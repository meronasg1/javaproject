package thirdpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingMyData {
    public static void main(String[] args) {

        String tempContainer;
        String finalContainer= " ";

        try {
            FileReader fileReader = new FileReader("src/thirdpackage/myData.txt");
            BufferedReader bufferedReader= new BufferedReader(fileReader);

            while ((tempContainer=bufferedReader.readLine())!=null){
                String space = " ";
                finalContainer = finalContainer+ space + tempContainer;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalContainer);


    }
}
