import java.util.ArrayList;
import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Servicos servicos = new Servicos();

        int opcao;
// ctrl + shift + r = replace
        do {
            System.out.printf("----------------------------%n" +
                    "Digite uma opção: %n" +
                    "1- Cadastrar Tutor %n" +
                    "2- Adicionar Pet %n" +
                    "3- Dar Banho %n" +
                    "4- Tosar %n" +
                    "5- Hidratar%n" +
                    "6- Adicionar Produto%n" +
                    "7- Mostrar Nota Fiscal%n" +
                    "8- Finalizar%n" +
                    "----------------------------%n");
            opcao = input.nextInt();

        } while (opcao !=8);
            System.out.println("Você finalizou suas compras!!");

//        Ao finalizar a compra deve-se mostrar uma nota
//        fiscal com todos os itens comprados.

//        ArrayList<Pet> listaPetsSofia = new ArrayList<Pet>();
//        Pet amora = new Pet("Amora", 5, "Shitzu", 2, "Branca, Cinza");
//
//        listaPetsSofia.add(amora);
//
//        Tutor sofia = new Tutor("Sofia", "Rua ABC,123", listaPetsSofia);
//
//
//        ArrayList<Pet> listaPetsLouri = new ArrayList<Pet>();
//        Pet luna = new Pet("Luna", 10, "Lhasa", 4, "Branca e Marrom");
//        Pet vicente = new Pet("vicente", 20, "Humano", 40, "Branca");
//
//
//        listaPetsLouri.add(luna);
//        listaPetsLouri.add(vicente);
//
//        Tutor louri = new Tutor("Louri", "Rua BCA,123", listaPetsLouri);
//
//
//        System.out.println(sofia.toString());
//
//        servicos.tosar(sofia, 30);
//        servicos.banho(sofia, sofia.getPet().get(0));
//        System.out.println(sofia.toString());
//        servicos.banho(louri, louri.getPet().get(0));
//        servicos.banho(louri, louri.getPet().get(1));
//        System.out.println(louri.toString());



    }
}


