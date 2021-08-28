
package lab5p2_eduardoaguilar;


public class Decano {
    private String nombre;
    private String apellido;
    private String pregrado;
    private int ID;
    private int edad;
    private String titulo;
    private String maestria;
    private String user;
    private String pass;

    public Decano() {
    }

    public Decano(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Decano(String nombre, String apellido, String pregrado, int ID, int edad, String titulo, String maestria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pregrado = pregrado;
        this.ID = ID;
        this.edad = edad;
        this.titulo = titulo;
        this.maestria = maestria;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}

