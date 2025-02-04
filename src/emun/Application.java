package emun;

public class Application {
    public static void main(String[] args) {
        String[] coloresHex = {
                "#FF0000", // ROJO
                "#FFFF00", // AMARILLO
                "#0000FF", // AZUL
                "#00FF00", // No es primario
                "#123456"  // No es primario
        };

        for (String hex : coloresHex) {
            Color color = ConvertidorColor.convertirHexadecimal(hex);
            if (color != null) {
                System.out.println("El color es: " + color.name());
            } else {
                System.out.println(hex + " No es un color primario");
            }
        }
    }
}

