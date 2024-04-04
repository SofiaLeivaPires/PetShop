import java.util.ArrayList;

public class Tutor {
    private String nome;
    private String endereco;
    private ArrayList <Pet> pet = new ArrayList<>(); //Atributos de pet, uma lista
    private ArrayList <Produto> produtos = new ArrayList<>();

    public Tutor(String nome, String endereco, ArrayList<Pet> pet, ArrayList<Produto> produtos) {
        this.nome = nome;
        this.endereco = endereco;
        this.pet = pet;
        this.produtos = produtos;
    }

    public Tutor(String nome, String endereco, ArrayList<Pet> pet) {
        this.nome = nome;
        this.endereco = endereco;
        this.pet = pet;
    }

    public Tutor (){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Pet> getPet() {
        return pet;
    }

    public void setPet(ArrayList<Pet> pet) {
        this.pet = pet;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pet=" + pet.toString() +
                ", produtos=" + produtos +
                '}';
    }

}
