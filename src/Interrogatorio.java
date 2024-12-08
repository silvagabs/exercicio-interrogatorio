
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interrogatorio {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        List<Boolean> perguntas = new ArrayList<>();

        System.out.println("Responda as perguntas apenas com TRUE ou FALSE:\n");

        System.out.println("Telefonou para a vítima?");
        Boolean p1 =scan.nextBoolean();
        perguntas.add(p1);

        System.out.println("Esteve no local do crime?");
        Boolean p2 =scan.nextBoolean();
        perguntas.add(p2);

        System.out.println("Mora perto da vítima?");
        Boolean p3 =scan.nextBoolean();
        perguntas.add(p3);

        System.out.println("Devia para a vítima?");
        Boolean p4 =scan.nextBoolean();
        perguntas.add(p4);

        System.out.println("Já trabalhou com a vítima?");
        Boolean p5 =scan.nextBoolean();
        perguntas.add(p5);

        System.out.println(perguntas);

    

    } 
}
