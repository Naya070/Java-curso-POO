public class Main {
    public static void main(String[] args) {
        Doctor myDoctor1 = new Doctor();
        Doctor myDoctor2 = new Doctor("Nayarith Jiménez");
        // Doctor() es el métod constructor.
        //crea nuevas instancias de una clase.
        //Usa la palabra new para invocarlo.
        myDoctor2.name = "Joan Blanco";
        myDoctor2.showName();
    }
}