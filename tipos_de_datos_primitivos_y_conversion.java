public class tipos_de_datos_primitivos_y_conversion {
    public static void main(String[] args) {
        byte _byte;
        short _short;
        int _int;
        long _long;
        char _char;
        String _string = "string";
        boolean _boolean;
        float _float;
        double _double;

        _byte = 127;
        _short = 32767;
        _int = 2147483647;
        // _long = 9223372036854775807;
        _char = 'A';
        _float = 12.12345f;
        _double = 12.123456789012345d;
        _boolean = true;
        _boolean = false;

        _short = _byte;
        _int = _short;
        _long = _int;

        _char = _string.charAt(0);
        _string = String.valueOf(_char);

        _string = String.valueOf(_boolean);
        _float = (float) _int;
        _double = _float;

        // // String a Integer
        // Integer entero = Integer.valueOf(cadena);
        // int entero = Integer.parseInt(cadena);

// // Integer a String
// String cadena = Integer.toString(entero);
// String cadena = String.valueOf(entero);

// // Char a String
// String cadena = Character.toString(char);

// // String a Char
// char caracter = cadena.charAt(0);

// // String a Double
// double doble = Double.parseDouble(cadena);
   
// // Double a String
// String cadena = String.valueOf(doble);

// // String a Float
// float flotante = Float.parseFloat(cadena);

// // Float a String
// String cadena = Float.toString(flotante);

// // String a Boolean
// Boolean boolean = Boolean.valueOf(cadena);
// boolean boolean = Boolean.parseBoolean(cadena);

// // Boolean a String
// String cadena = String.valueOf(b);
// String cadena = Boolean.toString(b);


}
