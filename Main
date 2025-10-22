import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] secret;
        String text;
        int vidas=3;
        char letra;

        // Pide la frase para buscar
        text = getSecretWord();
        // Determina la logintud de el array
        secret = new char[text.length()];
        // Muestra los caracteres introducidos
        fill(secret,text);

        do{
            show(secret);
            letra = getChar(text);
            if (check(secret, text, letra) == false) {
                System.out.println("-1 vida");
                vidas--;
            }

        }while (vidas > 0 && count(secret) > 0);
        if (vidas <= 0) {
            System.out.println("Has perdido pedazo de bot");
        } else {
            System.out.println("Has GANADOOO");
        }
    }

    // Obtener del usuario el texto a adivinar
    private static String getSecretWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto para adivinar");
        String texto = sc.nextLine();
        return texto;
    }

    // Comprobar si la letra pasada por parametro se encuentra en el texto.
    // En caso afirmativo se pone la letra del texto en el array, y se devuelve true.
    // En caso negativo se devuelve false.
    private static boolean check(char[] secret,String text,char letra) {
        boolean valor = false;
        for (int i = 0; i<text.length();i++) {
            if (letra == text.charAt(i)) {
                secret[i] = text.charAt(i);
                System.out.println("si");
                valor = true;
            } else {
                System.out.println("no");
            }
        }
        if (valor == true) {
            return true;
        } else {

            return false;
        }
    }

    // Se rellena el array con '_' en la posicion de cada letra,
    // y ' ' en los espacios en blanco
    private static void fill(char[] secret, String text){
        for (int i = 0; i<text.length();i++) {
            if (text.charAt(i) == ' ') {
                secret[i] = ' ';
            } else {
                secret[i] = '_';
            }
        }
    }

    // Contar la cantidad de '_' en un array;
    private static int count(char[] secret){
        int Downbar = 0;
        for (int i = 0; i<secret.length;i++) {
            if (secret[i] != ' ') {
                if (secret[i] == '_') {
                    Downbar++;
                }
            }
        }
        return Downbar;
    }

    // Muestra el array de caracteres. Cada caracter se muestra seguido de un espacio en blanco
    private static void show(char[] text){
        for (int i = 0; i<text.length; i++) {
            System.out.print(text[i] + " ");
        }
        System.out.println();
    }


    // Se muestra el texto y se obtiene un caracter por parte del usuario.
    private static char getChar(String text){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char letrica = sc.nextLine().charAt(0);
        return letrica;
    }
}
