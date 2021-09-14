public class WapperClasses {
    //São classes equivalentes aos tipos primitivos (Double, Interger...)
    // Boxing e unboxing é natural na linguagem
    // Uso comum: campos de entidades em sistemas de informação
    // Pois tipos referência (classes) aceita valor null e usufruem dos recursos OO

    public static void main(String[] args) {

        int x = 20;

//        Object obj = x;
        Integer obj = x; // Wrapper class equivalente ao int


        //int y = (int) obj; //compilador reclama pq os tipos não são necessariamente compatíveis
        int y =  obj; // Casting neste caso não é necessário

        int z = obj * 2; //


        System.out.println("X: " + x + "    Obj: " + obj + "    Y: " + y + "     z: " + z);

        x = 40;

        System.out.println("X: " + x + "    Obj: " + obj + "    Y: " + y + "     z: " + z);

    }

}
