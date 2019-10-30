
/**
 * Created by bp0413 on 30/10/2019.
 */
public class Tablero implements ITablero{
    private int tamanio;
    public int[][] tablero;

    public Tablero(int tamanio){
        this.tamanio = tamanio;
        tablero = new int[tamanio][tamanio];

    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero=tablero;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int getPosicion(int x, int y) {
        return tablero[x][y];
    }

    public void setPosicion(int x, int y, int valor) {
        tablero[x][y]=valor;

    }

    public void borra() {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                tablero[i][j]=0;
            }
        }
    }


    public int ocupacion() {
        int aux=0;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(tablero[i][j]!=0)aux++;
            }
        }
        return aux;
    }
    public String toString​(){
        String aux="";
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                aux+=tablero[i][j]+"  ";
            }
            aux+="\n";
        }
        return aux;

    }

}
