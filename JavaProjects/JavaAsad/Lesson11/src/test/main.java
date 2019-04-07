package test;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

class karakterer {

    public int tall;
    public int tall2;
    public int tall3;
    public int tall4;
    public int tall5;

    public karakterer(int tall, int tall2, int tall3, int tall4, int tall5) {
        this.tall = tall;
        this.tall2 = tall2;
        this.tall3 = tall3;
        this.tall4 = tall4;
        this.tall5 = tall5;
    }
}

public class main {
    public static void main(String[] args) {
        karakterer karakter = new karakterer(2,3,4,5,6);

        System.out.println(karakter.toString());


    }

}
