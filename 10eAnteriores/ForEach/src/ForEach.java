public class ForEach {
    // sintaxe opcional e simplificada para percorrer coleções

    public static void main(String[] args) {
        String[] vetor = new String[] {"Maria","Bob", "Rodrigo"};

        System.out.println("For normal:");
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("------------------");
        System.out.println("For each:");
        for(String apelido : vetor){
            System.out.println(apelido);
        }
    }
}
