package thirdpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String tempContainer;
        String finalContainer ="";


        //Created object of file reader and inside the file reader constructor we injected the path of the file that i want to read
        try {
            FileReader fileReader = new FileReader ("src/thirdpackage/data.txt");
            //using the fileReader object we create bufferedReader object
            //BufferedReader object has been initialized

            BufferedReader bufferedReader = new BufferedReader (fileReader);

            //while you have a next line, keep reading it.
            //using the buffered reader object, it's going to read every line and store inside our temporary container
            // it's going to read one line at a time using the readLine method and store inside the temporary container,
            // it's going to keep doing that until temporary container is null
            while((tempContainer= bufferedReader.readLine())!= null){

                finalContainer= finalContainer+ tempContainer;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //throws you an exception: reason is java is saying i understand you're giving me a file path but what if that file doesn't exist. java is taking precaution.
        //when an exception is thrown there are two things that you can do
        //you can catch the exception or you can throw it again
        //Now we'll practice to catch the exception


        System.out.println(finalContainer);
    }
}
