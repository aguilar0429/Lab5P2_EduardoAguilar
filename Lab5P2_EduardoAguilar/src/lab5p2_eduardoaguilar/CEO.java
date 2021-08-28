package lab5p2_eduardoaguilar;

public class CEO {
    private String nombre;
    private String apellido;
    private String pregrado;
    private int ID;
    private int experiencia;
    private int edad;
    private String user;
    private String pass;

    public CEO() {
    }

    public CEO(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public CEO(String nombre, String apellido, String pregrado, int ID, int experiencia, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pregrado = pregrado;
        this.ID = ID;
        this.experiencia = experiencia;
        this.edad = edad;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "CEO{" + "nombre=" + nombre + ", apellido=" + apellido + ", pregrado=" + pregrado + ", ID=" + ID + ", experiencia=" + experiencia + ", edad=" + edad + '}';
    }
    
    
    
}
