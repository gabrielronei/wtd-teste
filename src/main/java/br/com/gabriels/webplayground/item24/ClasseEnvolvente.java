package br.com.gabriels.webplayground.item24;

public class ClasseEnvolvente {
    private String nome;

    class ClasseAninhada {

        private String nomeAninhado;

        public ClasseAninhada(String nomeAninhado) {
            this.nomeAninhado = nomeAninhado.concat(nome);
        }
    }
}


