

public class App {
    public static void main(String[] args) throws Exception {
        
        Caja<Integer> integCaja = new Caja<>();
        Caja<String> stringCaja = new Caja<>();
        Caja<Double> doubleCaja = new Caja<>();

        integCaja.setObjeto(120456);
        stringCaja.setObjeto("Hola");
        doubleCaja.setObjeto(2.1569);

        System.out.println("Valor numerico: " +integCaja.getObjeto());
        System.out.println("Cadena de caracteres: " +stringCaja.getObjeto());
        System.out.println("Valor decimal: " +doubleCaja.getObjeto());

        Par<Integer, String> objPar1 = new Par<>(); 
        Par<String, Integer> objPar2 = new Par<>();

        objPar1.setValores(12345, "Hola");
        objPar2.setValores("Segundo par", 789456);

        System.out.println("Primer par: " +objPar1.getValor());

        Par<Integer, String> par3 = new Par<>(1, "Valor en constructor");
        Par<String, Integer> par4 = new Par<>();
        
        par4.setValores("4", 4);

        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Juan", 30);
        personas[1] = new Persona("Ana", 20);
        personas[2] = new Persona("Pedro", 40);
        personas[3] = new Persona("Maria", 15);
        personas[4] = new Persona("Lucia", 25);
        personas[5] = new Persona("Carlos", 35);
        personas[6] = new Persona("Sofia", 10);
        personas[7] = new Persona("Luis", 45);
        personas[8] = new Persona("Elena", 5);
        personas[9] = new Persona("Pablo", 50);

        int personasMayores = 0;
        int personasMenores = 0;

        for (int i = 0; i < personas.length;i++){
            if(personas[i].getEdad() < 18){
                personasMenores++;
            }else{
                personasMayores++;
            }
        }

        Par<Integer, String>[] menores = new Par[personasMenores];

        int indice = 0;
        int aux = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() < 18) {
                menores[indice] = new Par<>(personas[i].getEdad(), personas[i].getNombre());
                indice++;
            }
        }

        Par<Integer, String>[] mayores = new Par[personasMayores];

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {
                mayores[aux] = new Par<>(personas[i].getEdad(), personas[i].getNombre());
                aux++;
            }
        }

        System.out.println("Personas menores de edad:");
        for (Par<Integer, String> par : menores) {
        System.out.println("Nombre: " + par.getValor() + ", Edad: " + par.getClave());
        }

        System.out.println("\nPersonas mayores de edad:");
        for (Par<Integer, String> par : mayores) {
            System.out.println("Nombre: " + par.getClave() + ", Edad: " + par.getValor());
        }


    }
}
