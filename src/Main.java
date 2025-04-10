import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String Nombreestudiante = sc.nextLine();
        System.out.println("Ingrese el documento del estudiante: ");
        String Documentoestudiante = sc.nextLine();
        System.out.println("Seleccione el programa : \n1 - Desarrollo de software\n2 - Diseño gráfico\n3 - Gastronomía");
        String programa = sc.nextLine();
        switch(programa){
            case "1":
                System.out.println("Programa de desarrollo de software");
                System.out.println("Seleccione la materia :\n1 - Lógica de programación\n2" +
                        " - Metodologías ágiles\n3 - Introducción a la programación");
                String Materia = sc.nextLine();
                switch (materia){
                    case "1":
                        System.out.println("Nota lógica de programación");
                        break;
                    case "2":
                        System.out.println("Nota Metodologías ágiles");
                        break;
                    case "3":
                        System.out.println("Nota introducción a la programación");
                        break;
                }
                break;
            case "2":
                System.out.println("Programa de Diseño Gráfico");
                break;
            case "3":
                System.out.println("Programa de Gastronomía");
                break;
        }
    }
}