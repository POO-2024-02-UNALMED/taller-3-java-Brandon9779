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
        this.marca = marca;
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
        this.control = control;
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


    public void turnOff(){
        estado = false;
        System.out.println("El televisor esta apagado");
    }

    public void turnOn(){
        estado = true;
        System.out.println("El televisor esta encendido");
    }

    public void canalUp(int canal){
        if (estado){
            if (canal < 120){
                this.canal++;
                System.out.println("has subido de canal a:" + canal);
            } else {
                System.out.println("el canal esta en el maximo");
            }
        } else {
            System.out.println("El televisor esta apagado");
        }

    }

    public void canalDown(int canal){
        if (estado){
            if (canal > 1){
                this.canal--;
                System.out.println("has bajado de canal a:" + canal);
            } else{
                System.out.println("El canal esta en el minimo");
            }
        } else {
            System.out.println("el televisor esta apagado");
        }
    }

    public void volumenUp(int volumen){
        if (estado){
            if (volumen < 100){
                this.volumen++;
                System.out.println("Has subido el volumen a:" + volumen);
            } else{
                System.out.println("el volumen ya esta al maximo");
            }
        } else {
            System.out.println("El televisor esta apagado");
        } 
    }

    public void volumenDown(int volumen){
        if (estado){
            if (volumen > 0){
                this.volumen--;
                System.out.println("Has bajado el volumen a: " + volumen);
            } else {
                System.out.println("El volumen ya esta en el minimo");
            }
        } else {
            System.out.println("El televisor esta apagdo");
        }
    }
}
