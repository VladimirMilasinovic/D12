package Nov;

import java.util.Scanner;

public class domaci2 {

            public static void main(String[] args) {
                //        3. Napraviti proizvoljan niz brojeva,
                //        zatim uneti preko Scanner-a neki broj,
//        i u novom nizu smestiti sve brojeve iz prvog niza koji su veci od tog unetog broja (Obratiti paznju da nov niz nema prazna polja tj 0).

                Scanner sc = new Scanner(System.in);

                int[] niz = new int[10];

                niz[0] = 11;                         // niz2: 33, 42, 71, 91
                niz[1] = 2;
                niz[2] = 33;
                niz[3] = 42;
                niz[4] = 5;
                niz[5] = 6;
                niz[6] = 71;
                niz[7] = 8;
                niz[8] = 91;
                niz[9] = 10;


                System.out.println("Unesi neki broj");
                int x = sc.nextInt();                       // 30 > 33
                int brojac = 0;
                for (int i = 0; i < niz.length; i++) {
                    if(niz[i] > x){ //
                        brojac++;

                    }}
                int[] niz2 = new int[brojac];
                int index = 0;

                for(int i = 0; i< niz.length;i++){ // i=3
                    if(niz[i] > x){
                        niz2[index] =  niz[i];
                        System.out.println(niz2[index]);
                        index++;
                    }
                }
            }
        }

