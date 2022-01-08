package domain;

public class Persona {
    private int id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String username;
    private String correo;
    private String password;
    
    public Persona(){
    }
    public Persona(int id, String nombre, String apellidoP, String apellidoM, String username, String correo, String password){
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.username = username;
        this.correo = correo;
        this.password = password;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return this.apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return this.apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", username=" + username + ", correo=" + correo + ", password=" + password + '}';
    }
    
    
    
}
