

package prueba.horaria;


/**
 *
 * @author Rodrigo
 */
public class PruebaHoraria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int horas,minutos,segundos;
        horas=0;
        minutos=0;
        segundos=0;
        boolean test=true;
        while(test)
        {
            Thread.sleep(1000);
            segundos=segundos+1;
            if(segundos>59)
            {
                segundos=0;
                minutos=minutos+1;
            }
            if(minutos>59)
            {
                minutos=0;
                horas=horas+1;
            }
            
            if (minutos==1)
            {
               test=false;
                System.out.println("Aqui irá una ventana en un futuro");
                System.out.println("Huevos con queso a 300 el kilo vecino");
            }
        }
    }
    
}
