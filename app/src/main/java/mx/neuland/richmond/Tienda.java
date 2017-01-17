package mx.neuland.richmond;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Feelink on 13/10/16.
 */

public class Tienda {

    String name;
    String address;
    String phoneA;
    String phoneB;
    String website;
    String email;
    LatLng location;

    Tienda(String nombre, String direccion, String telefono1, String telefono2, String pagina, String email1, LatLng ubicacion)
    {
        name = nombre;
        address = direccion;
        phoneA = telefono1;
        phoneB = telefono2;
        website = pagina;
        email = email1;
        location = ubicacion;
    }

}
