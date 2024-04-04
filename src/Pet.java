

public class Pet {
    private String nomePet;
    private double peso;
    private String raca;
    private int idade;
    private String cor;

    public Pet(String nomePet, double peso, String raca, int idade, String cor) {
        this.nomePet = nomePet;
        this.peso = peso;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
    }

    public Pet() { // chamar a classe sem instanciar um objeto
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomePet() {

        return nomePet;
    }

    public void setNomePet(String nomePet) {

        this.nomePet = nomePet;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nomePet='" + nomePet + '\'' +
                ", peso=" + peso +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

}
