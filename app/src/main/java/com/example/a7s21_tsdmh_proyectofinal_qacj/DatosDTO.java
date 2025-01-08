package com.example.a7s21_tsdmh_proyectofinal_qacj;

import android.os.Parcel;
import android.os.Parcelable;

public class DatosDTO implements Parcelable {
    private String numero;
    private String nombreCompleto;
    private String edad;
    private String correoElectronico;

    public DatosDTO(String numero, String nombreCompleto, String edad, String correoElectronico) {
        this.numero = numero;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    protected DatosDTO(Parcel in) {
        numero = in.readString();
        nombreCompleto = in.readString();
        edad = in.readString();
        correoElectronico = in.readString();
    }

    public static final Creator<DatosDTO> CREATOR = new Creator<DatosDTO>() {
        @Override
        public DatosDTO createFromParcel(Parcel in) {
            return new DatosDTO(in);
        }

        @Override
        public DatosDTO[] newArray(int size) {
            return new DatosDTO[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(numero);
        dest.writeString(nombreCompleto);
        dest.writeString(edad);
        dest.writeString(correoElectronico);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEdad() {
        return edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}
