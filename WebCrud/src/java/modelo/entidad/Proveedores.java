package modelo.entidad;
// Generated 26/05/2022 06:46:17 PM by Hibernate Tools 4.3.1



public class Proveedores  implements java.io.Serializable {


     private Integer idProveedor;
     private String nombre;
     private String apellido;
     private String identificacion;
     private String empresa;
     private int telefono;

    public Proveedores() {
    }

    public Proveedores(String nombre, String apellido, String identificacion, String empresa, int telefono) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.identificacion = identificacion;
       this.empresa = empresa;
       this.telefono = telefono;
    }
   
    public Integer getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getIdentificacion() {
        return this.identificacion;
    }
    
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }




}


