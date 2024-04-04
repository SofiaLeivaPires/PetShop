

public class Servicos {

    public void tosar(Tutor tutor, double preco) {
        Produto tosa = new Produto("Tosar Pet", preco);
        tutor.getProdutos().add(tosa);

    }

    public void banho(Tutor tutor, Pet pet) {
//        Arrumar o get (0)
        double peso = pet.getPeso();
        double preco = 0;

        if (peso <= 5) {
            preco = 50;
        } else if (peso > 5 && peso <= 10) {
            preco = 80;
        } else if (peso > 10) {
            preco = 100;
        }

        Produto banho = new Produto("Banho Pet", preco);
        tutor.getProdutos().add(banho);
    }

    public void hidratar(Tutor tutor, double preco) {
        Produto hidratar = new Produto("Hidratar Pet", preco);
        tutor.getProdutos().add(hidratar);
    }

    Produto racao = new Produto("Ração", 80);
    Produto petisco = new Produto("Petisco", 5);
    Produto brinquedo = new Produto("Brinquedo", 30);

}
