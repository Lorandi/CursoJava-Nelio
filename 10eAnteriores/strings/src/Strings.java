import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String original = "   abc ABC 123 abc ABC 123  ";
        String lowerCase = original.toLowerCase();
        String uperCase = original.toUpperCase();
        String trim = original.trim();
        String substring = original.substring(2); // (2)do segundo caracter em diante
        String substring2 = original.substring(2,9); // (2)do segundo caracter em diante
        String replace = original.replace('a', 'K');
        String replace2 = original.replace("abc", " xy");
        int indexOf = original.indexOf("bc"); //primeira ocorrência. retorna -1 se não achar
        int lastIndexOf = original.lastIndexOf("bc"); //última ocorrência


        System.out.println("original: -" + original + "-" );
        System.out.println("lowercase: -" + lowerCase + "-" );
        System.out.println("uperCase: -" + uperCase + "-" );
        System.out.println("trim: -" + trim + "-" );
        System.out.println("substring(2): -" + substring + "-" );
        System.out.println("substring(2,9): -" + substring2 + "-" );
        System.out.println("replace(a,K): -" + replace + "-" );
        System.out.println("replace2(abc, xy): -" + replace2 + "-" );
        System.out.println("indexOf(bc): -" + indexOf + "-" );
        System.out.println("lastIndexOf(bc): -" + lastIndexOf + "-" );

        //// Split
        String[] vetor = original.split(" ");

        for (int i = 0; i < vetor.length; i++ ){
            System.out.println("vetor["+ i +"] é " + vetor[i]);
        }
    }
}
