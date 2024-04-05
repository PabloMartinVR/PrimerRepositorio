public class Animal {
    private String identificador;
    private boolean adulto;

    public Animal(){
        this.identificador = "0000";
        this.adulto = false;
    }

    public void respirar() {
        System.out.println("  Respirando... ");
    }

    public void crecer(){
        if (!adulto){
            System.out.println("  Creciendo... ");
        }
    }

    public void reproducirse(){
        if (adulto){
            System.out.println("  Reproduciéndose... ");
        }
    }

    public void comer(){
        System.out.println("  Comiendo... ");
    }



    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public boolean isAdulto() {
        return adulto;
    }

    public void setAdulto(boolean adulto) {
        this.adulto = adulto;
    }
}