public class Empregado {
    private String nome;
    private String sobrenome;
    private double salariomensal;

    public Empregado(String nome, String sobrenome, double salariomensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalariomensal(salariomensal);
    }

    public double getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(double salariomensal) {
        this.salariomensal = (salariomensal > 0) ? salariomensal : 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getSalarioAnual(){
        return salariomensal * 12;
    }
    public void aplicarAumento(){
        this.salariomensal *=1.10;
    }
}
