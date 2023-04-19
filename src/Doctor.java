public class Doctor {
    //Estos son los atributos o propiedades de la clase Doctor.
    //int id;
    //String name;
    //String speciality;
    //Método constructor.
    //debe tener el nombre de la clase en la mayoría de los casos.
    //No retorna ningún valor.
    //Usa cero o más argumentos contenidos dentro de los
    // paréntesis que siguen al nombre.

        //Atributos
        static int id = 0; //Autoincrement
        String name;
        String speciality;

        Doctor(){
            System.out.println("Construyendo el Objeto Doctor");

        }

        Doctor(String name, String speciality){
            System.out.println("El nombre del Doctor asignado es: " + name);
            id++;
            this.name = name;
            this.speciality = speciality;
        }

        //Comportamientos
        public void showName(){
            System.out.println(name);
        }

        public void showId(){
            System.out.println("ID Doctor: " + id);
        }

    }

