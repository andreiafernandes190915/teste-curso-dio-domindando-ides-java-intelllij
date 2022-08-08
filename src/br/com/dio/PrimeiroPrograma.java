package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    private static Object Livro;

    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        String nome;
        
        Livro = new Livro(nome: "o problema dos 3 corpos" , numPaginas: 300)

/*        int a = 5;
       int b = 3;
        System.out.println("Hello World!" + (a+b));*/

    }
}

class Livro {
            private String nome;

    public Livro (String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    private Integer numPaginas;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

