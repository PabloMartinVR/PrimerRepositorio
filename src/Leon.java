public class Leon extends Mamífero{
//    Método propio
    public void Rugir(){
        System.out.println("    Rugiendo");
    }

//    Método sobrescrito
    public void reproducirse(){
        System.out.println("Reproduciendose");
    }


//    Método sobrecargado: Una nueva versión de
//    uno de los metodos
    public void crecer(int cm){
        System.out.printf("    Creciendo %dcm %n",cm);
    }

}
