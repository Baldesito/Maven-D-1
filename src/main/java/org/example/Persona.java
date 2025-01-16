package org.example;

    public class Persona {
        private String cf;
        private  String nome;

        public Persona(String cf, String nome) {
            this.cf = cf;
            this.nome = nome;
        }

        public String getCf() {
            return cf;
        }

        public void setCf(String cf) {
            this.cf = cf;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "cf='" + cf + '\'' +
                    ", nome='" + nome + '\'' +
                    '}';
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }


