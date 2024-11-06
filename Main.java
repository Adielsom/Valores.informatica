public class Main {
    public static void main(String[] args){
        Fatura fatura = new Fatura("001", "Netebook", 2, 1500.0);

        System.out.println("Numero da fatura: " + fatura.getNumero());
        System.out.println("Descrção: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço por item: " + fatura.getPrecoPorItem());
        System.out.println("Total da fatura: " + fatura.getTotalFatura());

        System.out.println("=========================================");



        Empregado empregado1 = new Empregado("João", "Silva", 3000.0);
        Empregado empregado2 = new Empregado("Adielson","Oliveira", 3500.0);

        System.out.println("Salário anual do " + empregado1.getNome() + " " + empregado1.getSobrenome() + ": " + empregado1.getSalarioAnual());
        System.out.println("Salário anual da " + empregado2.getNome() + " " + empregado2.getSobrenome() + ": " + empregado2.getSalarioAnual());

        empregado1.aplicarAumento();
        empregado2.aplicarAumento();

        System.out.println("Novo salário anual do " + empregado1.getNome() + " " + empregado1.getSobrenome() + " após aumento: " + empregado1.getSalarioAnual());
        System.out.println("Novo salário anual da " + empregado2.getNome() + " " + empregado2.getSobrenome() + " após aumento: " + empregado2.getSalarioAnual());


        System.out.println("==============================================");

        Data data = new Data(6, 11, 2024);


        System.out.print("Data inicial: ");
        data.displayData();


        data.setDia(7);
        data.setMes(12);
        data.setAno(2025);


        System.out.print("Data modificada: ");
        data.displayData();

        System.out.println("====================================================");

        Contacorrente conta = new Contacorrente("12345", 1000.0, true, 500.0);

        System.out.println("Saldo inicial: " + conta.consultarSaldo());

        if (conta.sacar(300.0)) {
            System.out.println("Saque de 300 realizado com sucesso.");
        }
        System.out.println("Saldo após saque de 300: " + conta.consultarSaldo());

        if (conta.sacar(1500.0)) {
            System.out.println("Saque de 1500 realizado com sucesso.");
        }
        System.out.println("Saldo após saque de 1500: " + conta.consultarSaldo());

        if (conta.usandoChequeEspecial()) {
            System.out.println("A conta está usando cheque especial.");
        } else {
            System.out.println("A conta não está usando cheque especial.");
        }

        if (!conta.sacar(1000.0)) {
            System.out.println("Saque de 1000 não permitido, saldo insuficiente.");
        }
        System.out.println("Saldo final: " + conta.consultarSaldo());
    }
}


