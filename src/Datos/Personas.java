package Datos;

import java.util.List;

public class Personas {

    private String Usuario;
    private String Clave;
    private String Nombre;
    private String Apellido;
    private List<String> TareasPendientes;
    private List<String> TareasCompletas;

    public Personas(String Usuario, String Clave, String Nombre, String Apellido) {
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
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

    public List<String> getTareasPendientes() {
        return TareasPendientes;
    }

    public void setTareasPendientes(List<String> TareasPendientes) {
        this.TareasPendientes = TareasPendientes;
    }

    public List<String> getTareasCompletas() {
        return TareasCompletas;
    }

    public void setTareasCompletas(List<String> TareasCompletas) {
        this.TareasCompletas = TareasCompletas;
    }

}
