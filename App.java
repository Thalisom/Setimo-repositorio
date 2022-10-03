import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a medida do lado do quadrado: ");
        double lado = scanner.nextDouble();
        scanner.close();
        double area = lado * lado;
        double dobroDaArea = area * 2;
    
        System.out.print("O dobro da area do quadrado inserido será: " + dobroDaArea);

    }
}