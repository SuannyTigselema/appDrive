package com.example.appdrive.Models;

public class documento {
    private int imgTipoArchivo;
    private String lblTitulo;
    private int imgDoc;
    private int imgperfil;
    private String lblFecha;

    public documento(int imgTipoArchivo, String lblTitulo, int imgDoc, int imgperfil, String lblFecha) {
        this.imgTipoArchivo = imgTipoArchivo;
        this.lblTitulo = lblTitulo;
        this.imgDoc = imgDoc;
        this.imgperfil = imgperfil;
        this.lblFecha = lblFecha;
    }

    public int getImgTipoArchivo() {
        return imgTipoArchivo;
    }

    public void setImgTipoArchivo(int imgTipoArchivo) {
        this.imgTipoArchivo = imgTipoArchivo;
    }

    public String getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(String lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public int getImgDoc() {
        return imgDoc;
    }

    public void setImgDoc(int imgDoc) {
        this.imgDoc = imgDoc;
    }

    public int getImgperfil() {
        return imgperfil;
    }

    public void setImgperfil(int imgperfil) {
        this.imgperfil = imgperfil;
    }

    public String getLblFecha() {
        return lblFecha;
    }

    public void setLblFecha(String lblFecha) {
        this.lblFecha = lblFecha;
    }
}
