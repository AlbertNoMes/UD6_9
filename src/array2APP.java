import javax.swing.JOptionPane;
public class array2APP {
 
    public static void main(String[] args) {
 
    	//Indicamos el tamaño del array
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(texto)];
 
        //Funciones
        rellenarNumAleatorioArray(num, 0, 9);
        mostrarArray(num);
    }
 
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){

            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}