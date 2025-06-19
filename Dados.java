import java.util.Scanner;

public class Dados{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.print("Quantidade de dados: ");
        String ent = leia.nextLine();
        int quant = ent.isEmpty() ? 1 : Integer.parseInt(ent);
        for (int i = 0; i < quant; i++){
        int num = (int)(Math.random() * 6) + 1;
        rodar(num);
        }
    }
    public static void rodar(int n) {
        if (n == 1){
            System.out.println("|       |");
            System.out.println("|   *   |");
            System.out.println("|       |");
            System.out.println(" ");
        }
        if (n == 2){
            System.out.println("| *     |");
            System.out.println("|       |");
            System.out.println("|     * |");
            System.out.println(" ");
        }
        if (n == 3){
            System.out.println("| *     |");
            System.out.println("|   *   |");
            System.out.println("|     * |");
            System.out.println(" ");
        }
        if (n == 4){
            System.out.println("| *   * |");
            System.out.println("|       |");
            System.out.println("| *   * |");
            System.out.println(" ");
        }
        if (n == 5){
            System.out.println("| *   * |");
            System.out.println("|   *   |");
            System.out.println("| *   * |");
            System.out.println(" ");
        }
        if (n == 6){
            System.out.println("| *   * |");
            System.out.println("| *   * |");
            System.out.println("| *   * |");
            System.out.println(" ");
        }
    }
}

