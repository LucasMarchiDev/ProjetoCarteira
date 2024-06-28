import java.util.ArrayList;

public abstract class Cofrinho extends Moeda {
    public static double totalMoedas;
    public static ArrayList<Double> arrayMoedas = new ArrayList<>();
    public static ArrayList<String> arrayTmoeda = new ArrayList<>();

    //Opção 1 Menu. Adicionar Moedas
    public static void adicionar(double moeda, String tmoeda) {
        arrayMoedas.add(moeda);
        arrayTmoeda.add(tmoeda);
        System.out.println("Adicionado com sucesso");
    }

    //Opção 2 Menu. Listar todas as moedas
    public static void listar() {
        for (int i = 0; i < arrayMoedas.size(); i++) {
            String result = (i + 1) + " - " + arrayTmoeda.get(i) + " - " + Double.toString(arrayMoedas.get(i));
            System.out.println(result);
        }
    }

    //Opção 3 Menu. Remover Moedas
    public static void remover(int opcao) {
        System.out.println(opcao);
        arrayMoedas.remove(opcao - 1);
        arrayTmoeda.remove(opcao - 1);
    }

    //Opção 4 Menu. Converter Moedas para real
    public static double converter() {
        System.out.println("Iniciando conversão...");
        for (int i = 0; i < arrayMoedas.size(); i++) {
            totalMoedas += converterMoeda(arrayMoedas.get(i), arrayTmoeda.get(i));
        }
        System.out.println(totalMoedas);
        return 0;
    }
}
