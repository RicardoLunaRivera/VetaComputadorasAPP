package mundopc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamannio;
    private  static int contadorMonitores;

    private Monitor() {
        idMonitor = ++ contadorMonitores;
    }

    public Monitor(String marca, double tamannio) {
        this(); // manda a llamar al constructor que tiene el idMonitor
        this.marca = marca;
        this.tamannio = tamannio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamannio() {
        return tamannio;
    }

    public void setTamannio(double tamannio) {
        this.tamannio = tamannio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", tamannio=" + tamannio +
                '}';
    }
}
