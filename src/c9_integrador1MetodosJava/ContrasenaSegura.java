package c9_integrador1MetodosJava;

import java.util.Scanner;

public class ContrasenaSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "";
        boolean contrasenaSegura = true;
        boolean passOk = false;
        String messagesError = "";
        int maxIntentos = 0;
        while (!passOk && maxIntentos < 4) {
            System.out.println("Ingresa tu password");
            password = scanner.next();


            if (password.length() < 8) {
                contrasenaSegura = false;
                messagesError = messagesError.concat("La contraseña debe tener al menos 8 caracteres. ");
                System.out.println("messagesError = " + messagesError);
            }

            if (password.toLowerCase().equals(password) || password.toUpperCase().equals(password)) {
                contrasenaSegura = false;
                messagesError = messagesError.concat("La contraseña debe contener al menos una letra mayúscula y una letra minúscula. ");
                System.out.println("messagesError = " + messagesError);
            }

            if (!password.contains("0") &&
                    !password.contains("1") &&
                    !password.contains("2") &&
                    !password.contains("3") &&
                    !password.contains("4") &&
                    !password.contains("5") &&
                    !password.contains("6") &&
                    !password.contains("7") &&
                    !password.contains("8") &&
                    !password.contains("9")) {

                contrasenaSegura = false;
                messagesError = messagesError.concat("La contraseña debe contener al menos un número. ");
                System.out.println("messagesError = " + messagesError);
            }

            if (!password.contains("!") &&
                    !password.contains("@") &&
                    !password.contains("#") &&
                    !password.contains("$")) {

                contrasenaSegura = false;
                messagesError = messagesError.concat("La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).");
                System.out.println("messagesError = " + messagesError);
            }

            if (contrasenaSegura) {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
                passOk = true;
            } else {
                System.out.println("==>> Contraseña no segura.".concat(messagesError));
                messagesError = "";
                contrasenaSegura = true;
                maxIntentos++;
                if (maxIntentos < 4) {
                    System.out.println(">>>> Te quedan " + (4 - maxIntentos) + " intentos <<<<");
                }
            }
        }

        scanner.close();
    }
}
