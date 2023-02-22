package br.com.gabriels.webplayground.item24;

public class TestaClassesEnvolventes {
    public static void main(String[] args) {


        //ANONIMA
        new Comparable<String>() {
            @Override
            public int compareTo(String o) {
                return 0;
            }
        };

        //CLASSE LOCAL
        Comparable<String> comparable = new Comparable<>() {
            @Override
            public int compareTo(String o) {
                return 0;
            }
        };



    }
}
