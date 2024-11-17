package taller3.televisores;

public class Control {
    public TV tv;
    
    public Control(){
        this.tv = null;
    }

    public void setTv(TV tv){
        return;
    }

    public TV getTv(){
        return tv;
    }

    public void enlazar(TV televisor){
        televisor = tv;
        televisor.setControl(this);
        System.out.println("El control remoto se ha enlazado con el televisor.");
    }

    public void setCanal(int canal){
        return;
    }


    public void setvolumen(int volumen){
        return;
    }

    public void turnOff(){
        turnOff();
    }

    public void turnOn(){
        turnOn();
    }

    public void canalUp(){
        canalUp();
    }

    public void canalDown(){
        canalDown();

    }

    public void volumenUp(){
        volumenUp();

    }

    public void volumenDown(){
        volumenDown();
    }
    
}
