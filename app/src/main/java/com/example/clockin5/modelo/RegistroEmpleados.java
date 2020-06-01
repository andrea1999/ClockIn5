package com.example.clockin5.modelo;

import java.util.Date;

public class RegistroEmpleados  implements java.io.Serializable {


    private String empleadoIdEmp;
    private Empleado empleado;
    private String fechaAlta;
    private String fechaBaja;

    public RegistroEmpleados() {

    }


    public RegistroEmpleados(Empleado empleado, String fechaAlta) {
        this.empleado = empleado;
        this.fechaAlta = fechaAlta;
    }
    public RegistroEmpleados(Empleado empleado, String fechaAlta, String fechaBaja) {
        this.empleado = empleado;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public String getEmpleadoIdEmp() {
        return this.empleadoIdEmp;
    }

    public void setEmpleadoIdEmp(String empleadoIdEmp) {
        this.empleadoIdEmp = empleadoIdEmp;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getFechaBaja() {
        return this.fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}

