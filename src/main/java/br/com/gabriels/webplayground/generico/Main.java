package br.com.gabriels.webplayground.generico;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Generator<Duas> duasGenerator = new Generator<>();

        Duas build = duasGenerator.build();
    }
}
