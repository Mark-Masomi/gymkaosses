package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class myclass {


    static List<String> kundlista_raw = new ArrayList<>();
    public static void första_stränghjälparen () throws IOException {
        String line = "";
        try(BufferedReader kl = new BufferedReader(new FileReader("C:/Users/moinm/Downloads/gymkaos/customers,gymkaos.txt"))) {

            while ((line = kl.readLine()) != null) {
                kundlista_raw.add(line);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
/*
    public String readAndFindTallPerson(Path path){
        String res = "";

        try(BufferedReader buf = Files.newBufferedReader(path);){
            String row1;
            String row2;
            int length = 0;

            while ((row1 = buf.readLine()) != null){
                row2 = buf.readLine();
                length = getLength(row2);
                if (findTallPerson(limit, length)){
                    res += row1+"\n";
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }*/
}
