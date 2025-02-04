package c5_estructurasDeControlSwicthStamentExpression;

import javax.swing.*;
import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("\n Opción 1: \"Circulo\" \n Opción 2: \"Triangulo\"");
        //int inputFigura = scanner.nextInt();
        int inputFigura = Integer.parseInt(JOptionPane.showInputDialog("""
                1 Circulo
                2 Triangulo
                """));
        String result = "";

        switch (inputFigura) {
            case 1 -> result = calculosCirculo(scanner);
            case 2 -> result = calculosTriangulo(scanner);
            default -> System.out.println("Ingrese opc de figura");
        }

        if (result.length() != 0) {
            //System.out.println("El resultado del " + result);
            JOptionPane.showMessageDialog(null,"Resultado:  " +result);
        }
    }


    private static String calculosCirculo(Scanner scanner) {
        String result;
        // System.out.println("Ingresa el radio para los calculos: ");
        // double r = scanner.nextDouble();
        double r = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio para los calculos:"));
        // System.out.println("Ingresa\n opc 1 Area circulo: \n opc 2 Perimetro circulo: ");
        // int opCalculoC = scanner.nextInt();
        int opCalculoC = Integer.parseInt(JOptionPane.showInputDialog("""
                Ingresa
                opc 1 Area circulo:
                opc 2 Perimetro circulo:
                """));

        result = switch (opCalculoC) {
            case 1 -> "Area Circulo: " + (Math.PI * Math.pow(r, 2));
            case 2 -> "Perimetro Circulo: " + (2 * Math.PI * r);
            default -> "Ingresa una opCalculoC";
        };
        return result;
    }

    private static String calculosTriangulo(Scanner scanner) {
        String result;
        //System.out.println("Ingresa\n opc 1 Area Triangulo: \n opc 2 Perimetro Triangulo: ");
        //int opCalculoT = scanner.nextInt();
        int opCalculoT = Integer.parseInt(JOptionPane.showInputDialog("""
                Ingresa
                opc 1 calcularAreaTriangulo:
                opc 2 calcularPerimetroTriangulo:
                """));

        result = switch (opCalculoT) {
            case 1 -> calcularAreaTriangulo(scanner);
            case 2 -> calcularPerimetroTriangulo(scanner);
            default -> "Ingresa una opCalculoT";
        };
        return result;
    }

    private static String calcularPerimetroTriangulo(Scanner scanner) {
        /*System.out.println("Ingresa los lados a b c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();*/
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa lado a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa lado b"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Ingresa lado c"));
        return "Perimetro Triangulo: " + (a + b + c);
    }

    private static String calcularAreaTriangulo(Scanner scanner) {
        /*System.out.println("Ingresa base a y altura h: ");
        double a = scanner.nextDouble();
        double h = scanner.nextDouble();*/
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa base a"));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Ingresa altura h"));
        return "Area Triangulo: " + ((a * h) / 2);
    }


}
