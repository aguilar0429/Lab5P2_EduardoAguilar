package lab5p2_eduardoaguilar;


public class Alumno {
    private String nombre;
    private String apellido;
    private int cuenta;
    private int anio;
    private int clases;
    private String user;
    private String pass;

    public Alumno() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Alumno(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Alumno(String nombre, String apellido, int cuenta, int anio, int clases, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.anio = anio;
        this.clases = clases;
        this.user = user;
        this.pass = pass;
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

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getClases() {
        return clases;
    }

    public void setClases(int clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\nApellido: " + apellido + "\nCuenta: " + cuenta + "\nAnio: " + anio + "\nClases: " + clases 
                +"\nUsuario: "+user+"\nPassword: "+pass;
    }
}
