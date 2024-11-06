public class Contacorrente {
        private String numero;
        private double saldo;
        private boolean Especial;
        private double limite;


        public Contacorrente(String numero, double saldo, boolean ehEspecial, double limite) {
            this.numero = numero;
            this.saldo = saldo;
            this.Especial = ehEspecial;
            this.limite = limite;
        }


        public boolean sacar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor de saque inválido.");
                return false;
            }

            if (saldo >= valor) {
                saldo -= valor;
                return true;
            } else if (Especial && (saldo + limite >= valor)) {
                saldo -= valor;
                return true;
            } else {
                System.out.println("Saldo insuficiente para saque.");
                return false;
            }
        }


        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }


        public double consultarSaldo() {
            return saldo;
        }


        public boolean usandoChequeEspecial() {
            return saldo < 0;
        }


        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public double getLimite() {
            return limite;
        }

        public void setLimite(double limite) {
            this.limite = limite;
        }

        public boolean isEhEspecial() {
            return Especial;
        }

        public void setEhEspecial(boolean ehEspecial) {
            this.Especial = ehEspecial;
        }
    }


