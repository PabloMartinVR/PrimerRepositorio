public class Pez extends Animal{
    private int numAletas;

    public Pez(){
        numAletas = 5;
    }

//    Método propio:
    public void nadar(){
        System.out.println("  ^* Nadando...");
    }

//    Método SOBRESCRITO: No lo hereda y
//    creo una implementación propia (especializada)

    public void respirar(){
        System.out.println("  Respirando por branquias");
    }

}
