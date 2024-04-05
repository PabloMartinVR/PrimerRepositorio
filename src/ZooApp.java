public class ZooApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.comer();
        animal1.crecer();
        animal1.respirar();
        if (animal1.isAdulto()) {
            animal1.reproducirse();
        }
        else{
            animal1.setAdulto(true);
            animal1.reproducirse();
        }
        Mamífero unMamifero = new Mamífero();
        System.out.println("Un mamífero");
        unMamifero.comer();
        unMamifero.crecer();
        unMamifero.respirar();
        unMamifero.mamar();
        System.out.printf("     durante %d meses.%n",unMamifero.getMesesLactancia());
        Pez salmon = new Pez();
        System.out.println("Un pez llamado Nemo");
        salmon.comer();
        salmon.crecer();
        salmon.respirar();
        //nemo.mamar(); No tiene ese método

    }
}
