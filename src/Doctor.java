public class Doctor {
    //Estos son los atributos o propiedades de la clase Doctor.
    int id;
    String name;
    String speciality;
    //Método constructor.
    //debe tener el nombre de la clase en la mayoría de los casos.
    //No retorna ningún valor.
    //Usa cero o más argumentos contenidos dentro de los
    // paréntesis que siguen al nombre.

    //Aquí hay dos opciones para construir objetos de la clase Doctor.
    Doctor(){
        System.out.println("Construyendo el objeto doctor");
    }
    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    //comportamientos
    public void showName(){
        System.out.println(name);

    }
}
