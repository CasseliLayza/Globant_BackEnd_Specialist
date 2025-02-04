package c9_integrador1MetodosJava;

import javax.swing.*;

public class ConversorTemperatura {
    public static void main(String[] args) {
        /*1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).
        /*2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.
                De Celsius a Fahrenheit	De Fahrenheit a Celsius
                [°F] = ([°C] × 9 ⁄ 5) + 32	[°C] = ([°F] − 32) × 5 ⁄ 9

        3. El programa debe manejar al menos las siguientes situaciones:
        Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
        Si ingresa una temperatura no válida, mostrará un mensaje de error.*/

        Double inputTempAConvertir = null;
        String inputUnidadGradosToConvert = null;

        while (inputTempAConvertir == null || inputTempAConvertir.isNaN()) {
            try {
                inputTempAConvertir = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la temperatura a convertir"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Temperatura no válida. Ingrese una temperatura numérica.");
            }
        }

        while (inputUnidadGradosToConvert == null || inputUnidadGradosToConvert.length() == 0 || (inputUnidadGradosToConvert.charAt(0) != 'C' && inputUnidadGradosToConvert.charAt(0) != 'F')) {
            try {
                inputUnidadGradosToConvert = (JOptionPane.showInputDialog("Ingresa la unidad de temperatura a convertir")).toUpperCase();

                if (inputUnidadGradosToConvert.charAt(0) != 'C' && inputUnidadGradosToConvert.charAt(0) != 'F') {
                    throw new RuntimeException("Err de entrada de unidades");
                }
                System.out.println("inputUnidadGradosToConvert = " + inputUnidadGradosToConvert);
                System.out.println("inputUnidadGradosToConvert.length() = " + inputUnidadGradosToConvert.length());
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        }

        String gradosCurrent = inputUnidadGradosToConvert.equals("C") ? "F" : "C";
        double resultTempConvertida = 0;

        resultTempConvertida = switch (inputUnidadGradosToConvert) {
            case "F" -> ((inputTempAConvertir * 9) / 5) + 32;
            case "C" -> ((inputTempAConvertir - 32) * 5) / 9;
            default -> 0;
        };

        System.out.println("resultTempConvertida = " + resultTempConvertida);
        JOptionPane.showMessageDialog(null, inputTempAConvertir + " grados " + gradosCurrent + " equivale a: " + resultTempConvertida + " grados " + inputUnidadGradosToConvert);
    }
}
