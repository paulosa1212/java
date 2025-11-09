import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);



        produtos a;
        a = new produtos();


        System.out.println("digite o nome do produto");
        a.nome = input.nextLine();
        System.out.println("digite o preço do produto");
        a.preco = input.nextDouble();
        System.out.println("digite a quantidade do produto");
        a.quantidade = input.nextInt();

        System.out.println();
        System.out.println("produtos data:" + a);

        System.out.println();
        System.out.println("adicione mais uma quantidade no estqoe");
        int qteentrada= input.nextInt();
        a.entrada(qteentrada);

        System.out.println("dados atualizados"+ a);

        System.out.println(" de uma saida do estoque");
        int qtesaida= input.nextInt();
        a.saida(qtesaida);

        System.out.println("agora seu estoque é:"+ a);



        input.close();
    }


}