package lab5p2_eduardoaguilar;

public class Docente {
    private String nombre;
    private String apellido;
    private String pregrado;
    private String maestria;
    private int alumnos;
    private String clase;
    private String descripcion;
    private String user;
    private String pass;

    public Docente() {
    }

    public Docente(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Docente(String nombre, String apellido, String pregrado, String maestria, int alumnos, String clase, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pregrado = pregrado;
        this.maestria = maestria;
        this.alumnos = alumnos;
        this.clase = clase;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPregrado() {
        return pregrado;
    }

    public void setPregrado(String pregrado) {
        this.pregrado = pregrado;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return   nombre;
    }
}
