package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        myclass.första_stränghjälparen();
        System.out.println(myclass.kundlista_raw.get(2));
       /* String line = "";
        List<String> kundlista_raw = new ArrayList<>();
        try {
            BufferedReader kl = new BufferedReader(new FileReader("C:/Users/moinm/Downloads/gymkaos/customers,gymkaos.txt"));
            while ((line = kl.readLine()) != null) {
                kundlista_raw.add(line);
            }
            kl.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        ArrayList betaldatum = new ArrayList<LocalDate>();
        int nr=2;
        int zero=0;
        LocalDate yetAnotherDay = LocalDate
                .parse(kundlista_raw.get(1).toString());
        betaldatum.add(yetAnotherDay);
        while (betaldatum.size()<(kundlista_raw.size()/2)){
            zero++;
            nr=zero+2;
            yetAnotherDay = LocalDate
                    .parse(kundlista_raw.get(nr).toString());
            betaldatum.add(yetAnotherDay);
            zero++;

        }*/
        /*System.out.println(betaldatum.indexOf(2017-03-12));
        System.out.println(betaldatum.indexOf("2017-03-12"));*/
    }
}
