package org.example.Model.Toys;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RaffleWriter {

    Path path;
    FileWriter fileWriter;

    public RaffleWriter(){
        try {
            fileWriter = new FileWriter( "Statistic.txt" );
        } catch (IOException e) {
            throw new RuntimeException( e );
        }
    }

    public void writeToFile(String str){

        path = Path.of("Statistic.txt");

        if(!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                throw new RuntimeException( e );
            }
        } else{
            try {
                fileWriter.write(str + "\n");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
