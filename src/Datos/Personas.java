package Datos;

public class Personas {

    private String Usuario;
    private String Clave;
    private String Nombre;
    private String Apellido;
    private String[] TareasPendientes;
    private String[] TareasCompletas;

    public Personas(String Usuario, String Clave, String Nombre, String Apellido) {
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String[] getTareasPendientes() {
        return TareasPendientes;
    }

    public void setTareasPendientes(String[] TareasPendientes) {
        this.TareasPendientes = TareasPendientes;
    }

    public String[] getTareasCompletas() {
        return TareasCompletas;
    }

    public void setTareasCompletas(String[] TareasCompletas) {
        this.TareasCompletas = TareasCompletas;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }


}
