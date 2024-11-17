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

    public void canalUp(){
        if (tv != null && tv.getEstado()) {
            tv.canalUp();
        } else {
            System.out.println("El televisor no está encendido o no está enlazado.");
        }
    }

    public void canalDown(){
        if (tv != null && tv.getEstado()) {
            tv.canalDown();
        } else {
            System.out.println("El televisor no está encendido o no está enlazado.");
        }
    }

    public void volumenUp(){
        if (tv != null && tv.getEstado()) {
            tv.volumenUp();
        } else {
            System.out.println("El televisor no está encendido o no está enlazado.");
        }
    }

    public void volumenDown(){
        if (tv != null && tv.getEstado()) {
            tv.volumenDown();
        } else {
            System.out.println("El televisor no está encendido o no está enlazado.");
        }
    }

    public void turnOff(){
        if (tv != null) {
            tv.turnOff();
        } else {
            System.out.println("El televisor no está enlazado.");
        }
    }

    public void turnOn(){
        if (tv != null) {
            tv.turnOn();
        } else {
            System.out.println("El televisor no está enlazado.");
        }
    }
}
