package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("A revolução dos bichos", 150);
//        System.out.println(gato);
        System.out.println(livro);
        /* int a = 5;
        int b = 3;
        System.out.println("Hello, World! " + (a+b));*/
    }
}
