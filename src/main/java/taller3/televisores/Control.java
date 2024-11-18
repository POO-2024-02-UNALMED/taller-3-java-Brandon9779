package taller3.televisores;

public class Control {
    public TV tv;
    
    public Control(){
        this.tv = null;
    }

    public void setTv(TV tv){
        this.tv = tv;
    }

    public TV getTv(){
        return tv;
    }

    public void enlazar(TV televisor){
        this.tv = televisor;
        televisor.setControl(this);
        System.out.println("El control remoto se ha enlazado con el televisor.");
    }

    public void setCanal(int canal){
        tv.setCanal(canal);
    }

    public void setVolumen(int volumen){
        tv.setVolumen(volumen);
    }

    public void turnOff(){
        tv.turnOff();
    }

    public void turnOn(){
        tv.turnOn();
    }


    public void volumenUp(){
        tv.volumenUp();
    }

    public void volumenDown(){
        tv.volumenDown();
    }

    public void canalUp() {
        if (tv != null && tv.getEstado()) {
            tv.canalUp(); 
        } else {
            System.out.println("El televisor no está encendido o no está enlazado.");
        }
    }
    
    public void canalDown() {
        if (tv != null && tv.getEstado()) {
            tv.canalDown(); 
        } else {
            System.out.println("El televisor no está encendido o no está enlazado.");
        }
    }
    
}
