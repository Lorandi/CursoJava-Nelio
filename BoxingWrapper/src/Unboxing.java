public class Unboxing {
    // é o processo de conversão de um objeto tipo referência para um
    // objeto tipo valor compatível

    public static void main(String[] args) {

        int x = 20;

        Object obj = x;

        int y = (int) obj; //compilador reclama pq os tipos não são necessariamente compatíveis


        System.out.println("X: " + x + " Obj: " + obj + " Y: " + y);

        x = 40;

        System.out.println("X: " + x + " Obj: " + obj + " Y: " + y);





    }

}
