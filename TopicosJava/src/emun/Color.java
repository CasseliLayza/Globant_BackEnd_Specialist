package emun;

public enum Color {
    ROJO("#FF0000"),
    AMARILLO("#FFFF00"),
    AZUL("#0000FF");

    private final String valorHexadecimal;

    Color(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }

    public String getValorHexadecimal() {
        return valorHexadecimal;
    }

    public static Color fromHex(String valorHexadecimal) {
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)) {
                return color;
            }
        }
        return null;
    }
}

