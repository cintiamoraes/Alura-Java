package br.com.bitebank.banco.Modelo;

import br.com.bitebank.banco.teste.*;

public class CalculadorDeImposto {

        private double totalImposto;

        public void registra(Tributavel t) {

            double valor = t.getValorImposto();
            this.totalImposto += valor;

        }

        public double getTotalImposto() {
            return totalImposto;
        }

}