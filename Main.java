import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] secret;
        String text;
        int vidas=3;
        char letra;

        text = getSecretWord();
        secret = new char[text.length()];

        fill(secret,text);

        do{

            show(secret);
            letra = getChar(text);
            if (check(secret, text, letra) == false) {
                vidas--;
            }
            if (count(secret) == 0) {
                break;
            }
        }while (vidas > 0);

        if (vidas == 0) {
            System.out.println("Has perdido pedazo de bot");
        } else {
            System.out.println("Victoria Magistral");
        }
    }

    // Obtener del usuario el texto a adivinar
    private static String getSecretWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase que quieres usar");
        String texto = sc.nextLine();
        return texto;
    }

    // Comprobar si la letra pasada por parametro se encuentra en el texto.
    // En caso afirmativo se pone la letra del texto en el array, y se devuelve true.
    // En caso negativo se devuelve false.
    private static boolean check(char[] secret,String text,char letra) {
        boolean valor = false;
        String texto = text.toLowerCase();
        char letrica = Character.toLowerCase(letra);
        for (int i = 0; i<secret.length;i++) {
            if (letrica == texto.charAt(i)) {
                secret[i] = text.charAt(i);
                valor = true;
            }
        }
        return valor;

    }

    // Se rellena el array con '_' en la posicion de cada letra,
    // y ' ' en los espacios en blanco
    private static void fill(char[] secret, String text){
        for (int i = 0; i<secret.length;i++) {
            if (text.charAt(i) != ' ') {
                secret[i] = '_';
            } else {
                secret[i] = ' ';
            }
        }
    }

    // Contar la cantidad de '_' en un array;
    private static int count(char[] secret){
        int DownBar = 0;
        for (int i = 0; i<secret.length; i++) {
            if (secret[i] == '_') {
                DownBar++;
            }
        }
        return DownBar;
    }

    // Muestra el array de caracteres. Cada caracter se muestra seguido de un espacio en blanco
    private static void show(char[] text){
        for (int i = 0; i<text.length; i++) {
            System.out.print(text[i] + " ");
        }
    }

    // Se muestra el texto y se obtiene un caracter por parte del usuario.
    private static char getChar(String text){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Introduce el caracter que quieres poner");
        return sc.nextLine().charAt(0);
    }
}
