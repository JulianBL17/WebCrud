
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.ProveedoresDao;
import modelo.entidad.Proveedores;


/**
 *
 * @author elcon
 */
@ManagedBean
@ViewScoped
public class ProveedoresControl {

    /**
     * Creates a new instance of proveedoresControl
     */
    private List<Proveedores> listaProveedores;
    private Proveedores proveedores;

    public ProveedoresControl() {
        proveedores = new Proveedores();
    }

    public List<Proveedores> getListaProveedores() {
        ProveedoresDao ad = new ProveedoresDao();
        listaProveedores = ad.listarProveedores();
        return listaProveedores;
    }

    public void setListaProveedores(List<Proveedores> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public void limpiarProveedores() {
        proveedores = new Proveedores();
    }

    public void agregarProveedores() {
        ProveedoresDao ad = new ProveedoresDao();
        ad.agregar(proveedores);
    }

    public void modificarProveedores() {
        ProveedoresDao ad = new ProveedoresDao();
        ad.modificar(proveedores);
        limpiarProveedores();
    }

    public void eliminarProveedores() {
        ProveedoresDao ad = new ProveedoresDao();
        ad.eliminar(proveedores);
        limpiarProveedores();
    }
}
