package lab5p2_eduardoaguilar;


public class Evaluaciones {
    private String equipo;
    private String cooperacion;
    private String participacion;
    private String nota;
    private Object general;

    public Evaluaciones(String equipo, String cooperacion, String participacion, String nota, Object general) {
        this.equipo = equipo;
        this.cooperacion = cooperacion;
        this.participacion = participacion;
        this.nota = nota;
        this.general = general;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getCooperacion() {
        return cooperacion;
    }

    public void setCooperacion(String cooperacion) {
        this.cooperacion = cooperacion;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Object getGeneral() {
        return general;
    }

    public void setGeneral(Object general) {
        this.general = general;
    }
    
    
}
