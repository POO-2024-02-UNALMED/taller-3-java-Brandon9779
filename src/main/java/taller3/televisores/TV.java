package taller3.televisores;


public class TV {
    public Marca marca;
    public int canal = 1;
    public int precio = 500;
    public boolean estado;
    public int volumen = 1;
    public Control control;
    public static int NumTV = 0; 

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
    }
    
    public int getCanal(){
        return canal;

    }

    public void setCanal(int canal){
        return;
    }

    public Marca getMarca(){
        return marca;

    }

    public void setMarca(Marca marca){
        return;
    }

    public int getVolumen(){
        return volumen;

    }

    public void setVolumen(int volumen){
        return;
    }

    public int getPrecio(){
        return precio;

    }

    public void setPrecio(int precio){
        return;
    }

    public Control getControl(){
        return control;

    }

    public void setControl(Control control){
        return;
    }

    public boolean getEstado(){
        return estado;
    }

    public static void setNumTV(int NumTV){
        return;
    }

    public static int getNumTV(){
        return NumTV;
    }


    public void NumerosTv(int NumTV){

    }

    public void turnOff(boolean estado){

    }

    public void turnOn(boolean estado){

    }

    public void canalUp(int canal){

    }

    public void canalDown(int canal){

    }

    public void volumenUp(int volumen){

    }

    public void volumenDown(int volumen){

    }


}
