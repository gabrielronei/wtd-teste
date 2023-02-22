package br.com.gabriels.webplayground.item24;

public class ClasseEnvolventeDaEstatica {
    private String nome;

    static class ClasseAninhada {

        private String nomeAninhado;

        public ClasseAninhada(String nomeAninhado) {
            this.nomeAninhado = nomeAninhado;
        }
    }
}
