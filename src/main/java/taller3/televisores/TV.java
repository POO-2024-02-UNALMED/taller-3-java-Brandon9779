package taller3.televisores;

public class TV {
    public Marca marca;
    public int precio = 500;
    public int canal = 1;
    public int volumen = 1;
    public boolean estado;
    public  Control control;
    public static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void setCanal(int canal) {
        if (estado && canal > 0 && canal <= 120) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return this.canal;
    }
    
    public void canalUp() {
        if (estado && canal < 120) {
            canal++;
        }
    }

    public void canalDown() {
        if (estado && canal > 1) {
            canal--;
        }
    }

    public void setVolumen(int volumen) {
        if (estado && volumen >= 0 && volumen <= 7) {
            this.volumen = volumen;
        }
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void volumenUp() {
        if (estado && volumen < 7) {
            volumen++;
        }
    }

    public void volumenDown() {
        if (estado && volumen > 0) {
            volumen--;
        }
    }

    public boolean getEstado() {
        return estado;
    }

    public void turnOn() {
        if (!estado) {
            estado = true;
        }
    }

    public void turnOff() {
        if (estado) {
            estado = false;
        }
    }


    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return this.control;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public Marca getMarca() {
        return this.marca;
    }

}
