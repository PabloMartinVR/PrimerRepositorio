public class Mamífero extends Animal{
//    Atributos:
//    - Heredados: identificador y adulto
//    - Propio:
    private int mesesLactancia;

    public Mamífero(){
        this.mesesLactancia = 4;
    }


//    Método
//    Heredados: crecer, comer, reproducirse y respirar

//    Propios:
    public void mamar(){
        System.out.println("  Mamando... ");
    }

//    getters y setters


    public int getMesesLactancia() {
        return mesesLactancia;
    }

    public void setMesesLactancia(int mesesLactancia) {
        this.mesesLactancia = mesesLactancia;
    }
}
