package ejerciciosbasicos.java;

/**
 *
 * @author Carlos Lizana
 */
public class EjerciciosBasicosJava {
    
    public boolean fiestaArdillas (int numBellotas, boolean finDeSemana){
        if(finDeSemana){
            return true;
        }
        if(numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }

    public int multa (int velocidad, boolean birthday){
        if(birthday){
            velocidad -= 5;
        }
        if(velocidad <= 60){
            return 0;
        }
        if(velocidad > 60 && velocidad <= 80){
            return 1;
        }
        return 2; //el resto de casos, que son que voy a más de 80
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.print(ejercicios.fiestaArdillas(30, false));
        System.out.print(ejercicios.fiestaArdillas(50, true));
        System.out.print(ejercicios.fiestaArdillas(70, true));
        //testeo el ejercicio 2
        System.out.print(ejercicios.multa(60, false));
        System.out.print(ejercicios.multa(65, false));
        System.out.print(ejercicios.multa(65, true));
    }
    
}
