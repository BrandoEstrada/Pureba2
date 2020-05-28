package com.example.TrabajoFacultativa2;

public class Model {
    private String titulo;
    private String descripcion;
    private int imagen;
    private String hora;
    private String fechaentrega;
    private String dia;
    private String profesor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getProfesor() {return profesor;}

    public void setProfesor(String profesor) { this.profesor = profesor;}

    public String getDia() { return dia; }

    public void setDia(String dia) { this.dia = dia; }

    public String getFechaentrega() { return fechaentrega; }

    public void setFechaentrega(String fechaentrega) { this.fechaentrega = fechaentrega; }

   public String getHora() { return hora; }

  public void setHora(String hora) { this.hora = hora;}
}

