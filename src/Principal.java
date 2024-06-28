import java.util.Scanner;

//Menu Cofrinho
public class Principal extends Cofrinho{

    public static void main(String[] args) {

        menu();
        return;

    }

    public static void menu() {

        Scanner sc = new Scanner(System.in);

        int opcao;
        int tmoeda;
        double moeda;


        System.out.println("Menu");
        System.out.println("1-Adicionar");
        System.out.println("2-Remover");
        System.out.println("3-Listar");
        System.out.println("4-Calcular total convertido para Real");
        System.out.println("0-Encerrar");
        opcao=sc.nextInt();


        while(opcao!=0) {

            switch(opcao) {

                case 1:
                    System.out.println("Selecione a moeda");
                    System.out.println("1 - Real \n2 - Dolar \n3 - Euro \n4 - Voltar");
                    tmoeda = sc.nextInt();
                    System.out.println("Digite o valor:");
                    moeda = sc.nextDouble();
                    if(tmoeda == 1) {
                        adicionar(moeda,"real");
                        menu();
                    }
                    if(tmoeda == 2) {
                        adicionar(moeda,"dolar");
                        menu();
                    }
                    if(tmoeda == 3) {
                        adicionar(moeda,"euro");
                        menu();
                    }

                case 2:
                    System.out.println("Selecione qual moeda deseja remover");
                    listar();
                    opcao = sc.nextInt();
                    remover(opcao);
                    menu();

                case 3:
                    System.out.println("Moedas listadas");
                    listar();
                    menu();

                case 4:
                    converter();
                    menu();

                default:
                    System.out.println("Opcao invalida!");
            }

            System.out.println("Menu");
            System.out.println("1-Adicionar");
            System.out.println("2-Remover");
            System.out.println("3-Listar");
            System.out.println("0-Encerrar");
            opcao=sc.nextInt();

        }
    }


}