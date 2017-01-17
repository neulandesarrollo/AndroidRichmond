package mx.neuland.richmond;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MapaActivity extends AppCompatActivity implements View.OnClickListener, OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener {

    LatLng ubicacion = new LatLng(1, 1);

    private AgregarMarcadores agregarMarcadores = null;

    private Toolbar toolbar;
    private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;

    private GoogleApiClient mGoogleApiClient;
    private LocationRequest mLocationRequest;

    public static final String TAG = MapaActivity.class.getSimpleName();

    LatLng coordenadasInicio;

    GoogleMap googleMapObject;

    String ubicacionFinal;
    int origen;

    //LatLong de las tiendas

    List<Tienda> Tiendas = new ArrayList<Tienda>();

    ImageView search;

    FloatingActionButton fabEstados;

    LinearLayout home;
    LinearLayout buscar;
    LinearLayout where;

    TextView textHome;
    TextView textSearch;
    TextView textWhere;

    LatLng t1 = new LatLng(32.5204762, -117.01971430000003);
    LatLng t2 = new LatLng(32.4816744, -116.9505456);
    LatLng t3 = new LatLng(32.6485714, -115.439911);
    LatLng t4 = new LatLng(23.0598671, -109.70342979999998);
    LatLng t5 = new LatLng(19.8153097, -90.5504745);
    LatLng t6 = new LatLng(16.7812076, -93.10244460000001);
    LatLng t7 = new LatLng(17.5092802, -91.9923685);
    LatLng t8 = new LatLng(28.6417743, -106.08712450000002);
    LatLng t9 = new LatLng(31.7426557, -106.52035639999997);
    LatLng t10 = new LatLng(28.652981, -106.0915776);
    LatLng t11 = new LatLng(19.2676235, -99.17079319999999);
    LatLng t12 = new LatLng(19.3672839, -99.16286350000001);
    LatLng t13 = new LatLng(19.3641094, -99.1786586);
    LatLng t14 = new LatLng(19.3835132, -99.19656379999998);
    LatLng t15 = new LatLng(19.4354116, -99.16365789999998);
    LatLng t16 = new LatLng(19.3803335, -99.24650029999998);
    LatLng t17 = new LatLng(19.3871686, -99.08613919999999);
    LatLng t18 = new LatLng(19.4350778, -99.16455869999999);
    LatLng t19 = new LatLng(19.3789605, -99.25787439999999);
    LatLng t20 = new LatLng(19.4367718, -99.13318959999998);
    LatLng t21 = new LatLng(19.3288318, -99.13316309999999);
    LatLng t22 = new LatLng(19.4359409, -99.13167320000002);
    LatLng t23 = new LatLng(25.533476, -103.53086289999999);
    LatLng t24 = new LatLng(21.1399, -101.7050858);
    LatLng t25 = new LatLng(20.5203446, -100.81552010000001);
    LatLng t26 = new LatLng(20.6898905, -101.32369649999998);
    LatLng t27 = new LatLng(17.6384976, -101.55788569999999);
    LatLng t28 = new LatLng(20.7069491, -103.45406689999999);
    LatLng t29 = new LatLng(20.6437583, -103.34888710000001);
    LatLng t30 = new LatLng(20.6647785, -103.35393520000002);
    LatLng t31 = new LatLng(19.4062602, -99.015537);
    LatLng t32 = new LatLng(19.6221614, -99.20404719999999);
    LatLng t33 = new LatLng(19.4505497, -99.26209289999997);
    LatLng t34 = new LatLng(19.2790896, -99.65550990000003);
    LatLng t35 = new LatLng(19.5876991, -99.03983399999998);
    LatLng t36 = new LatLng(19.6902258, -101.18453169999998);
    LatLng t37 = new LatLng(19.4087292, -102.0615818);
    LatLng t38 = new LatLng(21.4960741, -104.89687800000002);
    LatLng t39 = new LatLng(25.6604372, -100.33276169999999);
    LatLng t40 = new LatLng(25.7172966, -100.35687280000002);
    LatLng t41 = new LatLng(25.7193619, -100.3502459);
    LatLng t42 = new LatLng(17.1193283, -96.7525488);
    LatLng t43 = new LatLng(19.0420739, -98.21719669999999);
    LatLng t44 = new LatLng(19.0206747, -98.17991769999998);
    LatLng t45 = new LatLng(19.0461708, -98.20410319999996);
    LatLng t46 = new LatLng(20.5878716, -100.3746165);
    LatLng t47 = new LatLng(20.5894453, -100.41015870000001);
    LatLng t48 = new LatLng(20.5745579, -100.4129676);
    LatLng t49 = new LatLng(21.1295466, -86.81701320000002);
    LatLng t50 = new LatLng(18.5059802, -88.3108277);
    LatLng t51 = new LatLng(22.14196, -100.99246929999998);
    LatLng t52 = new LatLng(24.8200898, -107.43663190000001);
    LatLng t53 = new LatLng(24.798493, -107.40114590000002);
    LatLng t54 = new LatLng(29.08565, -110.9695716);
    LatLng t55 = new LatLng(29.0834457, -110.953644);
    LatLng t56 = new LatLng(29.0892291, -110.9438055);
    LatLng t57 = new LatLng(17.9869076, -92.93632309999998);
    LatLng t58 = new LatLng(25.8427979, -97.49543299999999);
    LatLng t59 = new LatLng(22.2364393, -97.8689147);
    LatLng t60 = new LatLng(22.2923514, -97.84427490000002);
    LatLng t61 = new LatLng(19.1914151, -96.12751750000001);
    LatLng t62 = new LatLng(20.5271822, -97.4600734);
    LatLng t63 = new LatLng(17.9877691, -94.54707459999997);
    LatLng t64 = new LatLng(20.9906527, -89.62221009999996);
    LatLng t65 = new LatLng(22.7599078, -102.54779989999997);

    Tienda tienda1 = new Tienda("IMPULSORA LIBRO CLUB", "Río Bravo núm. 9836, Col. Revolución, 2201, Tijuana, B. C.", "(664) 686-28-80", "", "www.libroclub.com", "ventas@libroclub.com", t1);
    Tienda tienda2 = new Tienda("LIBRERÍA DE MEXICO DEL NOROESTE S. DE R.L. DE C.V.", "Av. Paseo de los Héroes núm. 95, Local B 20-A, Centro Comercial Plaza Río, 22425, Tijuana, B. C.", "(664) 634-16-54", "", "", "libreriasdemexico@yahoo.com.mx", t2);
    Tienda tienda3 = new Tienda("SOLUCIÓN EDUCATIVA", "Juan Escutia núm. 501, Col. Prohogar, 21240, Mexicali, B.C.", "(686) 566-73-33", "(664) 608-07-18", "", "solucioneducativa@prodigy.net.mx", t3);
    Tienda tienda4 = new Tienda("PUBLICACIONES LAHESA", "Manuel Doblado S/N, Col. 5 de Febrero, 23400, San José del Cabo, B. C. S.", "(624) 142-10-18", "", "", "maganaloscabos@hotmail.com", t4);
    Tienda tienda5 = new Tienda("DISTRIBUIDORA TIERRA Y VENADO", "Calle 12 núm. 38. entre 13 y 15, Col. Samula, 24090, San Francisco de Campeche, Camp.", "(916) 348-08-70", "", "", "artestyv@hotmail.com", t5);
    Tienda tienda6 = new Tienda("DINALI", "2 Av. Sur Oriente núm. 342, Col. Estrada, 29017, Tuxtla Gutiérrez, Chis.", "(961) 656-68-25", "", "", "letrep24@hotmail.com", t6);
    Tienda tienda7 = new Tienda("DISTRIBUIDORA TIERRA Y VENADO", "Prolongación 12 de Octubre S/N, Fracc. Tulija, 29960, Palenque, Chis.", "(916) 345-06-73", "(916) 348-08-70", "", "artestyv@hotmail.com", t7);
    Tienda tienda8 = new Tienda("BODEGA DE LIBROS S.A. DE C.V.", "Av. Deza y Ulloa núm. 604, Col. San Felipe, 31203, Chihuahua, Chih.", "(614) 414-7212", "", "", "bodegadl@prodigy.net.mx", t8);
    Tienda tienda9 = new Tienda("LUIS GUERRERO GASPAR", "Santo Tomás núm. 1009, Col. Periodista, 32178, Cd. Juárez, Chih.", "(656) 301-36-72", "", "", "libroles@hotmail.com", t9);
    Tienda tienda10 = new Tienda("OLINOR DISTRIBUIDORA DE LIBROS S.A. DE C.V.", "Av. Pascual Orozco núm. 701, Col.Parques de San Felipe, 31203, Chihuahua, Chih.", "(614) 414-48-88", "", "www.olinor.com", "olinor@olinor.com", t10);
    Tienda tienda11 = new Tienda("BODELI OSNAYA", "Carretera Federal a Cuernavaca núm. 5595, Col. San Pedro Mártir, Tlalpan, 14650 México, D.F.", "(55) 55-73-05-89", "(55) 56-55-41-95", "www.bodeli.com.mx", "store@bodeli.com.mx", t11);
    Tienda tienda12 = new Tienda("BOOKS 2 GO", "Av. Popocatépetl, núm. 415 Local 28, Col. Santa Cruz Atoyac,Benito Juárez, México, D.F.", "(55) 47-37-77-50", "", "www.books2go.com.mx", "mdelatorre@books2go.com.mx", t12);
    Tienda tienda13 = new Tienda("CASA DEL LIBRO", "Barranca del Muerto núm. 40, Col Florida, Álvaro Obregón, 01030, México, D.F.", "(55) 56-62-52-17", "(55) 56-62-52-18", "www.casadelibro.com.mx", "ventas@casadelibro.com.mx", t13);
    Tienda tienda14 = new Tienda("DELTI SAN ANTONIO", "Av. Prolongación San Antonio núm. 170, Col. Carola, 01180, Álvaro Obregón México, D.F.", "(55) 36-86-20-00", "", "www.delti.com.mx", "ggonzalez@delti.com.mx", t14);
    Tienda tienda15 = new Tienda("DELTI ANTONIO CASO", "Antonio Caso núm. 127 Col. San Rafael, 07470, Cuauhtémoc México, D.F.", "(55) 55-46-88-20", "", "www.delti.com.mx", "psolis@delti.com.mx", t15);
    Tienda tienda16 = new Tienda("DILSE", "V. Gómez Farías núm. 38, Col. Bejero, 01340, Álvaro Obregón México, D.F.", "(55) 52-57-31-00", "(55) 21-67-18-74", "", "", t16);
    Tienda tienda17 = new Tienda("DISTRIBUIDORA GUIMAR", "Cto. Río Zitácuaro núm. 49, Col. Paseos de Churubusco, Iztapalapa, 09030, México, D. F.", "(55) 56-54-74-09", "", "", "gsuarez70@hotmail.com", t17);
    Tienda tienda18 = new Tienda("ENGLISH TEXTBOOKS", "Gabino Barreda núm. 132, Col. San Rafael, 06470 , Cuauhtémoc, México, D.F.", "(55) 55-46-10-51", "(55) 67-23-97-51", "", "gb@etb-elt.com", t18);
    Tienda tienda19 = new Tienda("LEARNING TIME", "Carretera México - Toluca núm. 2853, Col. Campestre Palo Alto,05110, Cuajimalpa, México, D.F.", "(55) 21-63-53-92", "(55) 21-63-53-41", "", "clientes@learningtime.com.mx", t19);
    Tienda tienda20 = new Tienda("MATERIAL PEDAGÓGICO", "Luis Gónzalez Obregón núm. 9, Col. Centro, 06020, Cuauhtémoc, México, D.F.", "(55) 91-40-65-00", "", "www.mplibros.com.mx", "pedidos@mplibros.com.mx", t20);
    Tienda tienda21 = new Tienda("MEETING POINT BOOK SHOP", "Av. Canal de Miramontes núm. 2640 Local-G, Col. Avante, 04460, Coyoacán, México, D.F.", "(55) 56-84- 72-61", "", "", "mpbcompras@meetingpoint.com.mx", t21);
    Tienda tienda22 = new Tienda("OFICINAS DE LIBRERÍA PORRÚA ", "República de Argentina núm. 17, Col. Centro, 06020, Cuauhtémoc, México, D.F.", "(55) 57-04-75-00", "", "www.porrua.mx", "", t22);
    Tienda tienda23 = new Tienda("DISTRIBUIDORA DE LIBROS DALUMA", "Donato Guerra núm. 445 Sur, Col. Centro, 35150 Lerdo, Dgo.", "(871) 455-56-38", "(871) 234-84-12", "", "malberto_urrutia@hotmail.com", t23);
    Tienda tienda24 = new Tienda("DITEXBA", "Litio núm. 109, Col. Piletas, 37310, León, Gto", "(477) 758-21-82", "01-800-836-76-56", "www.ditexba.com.mx", "ventas@ditexba.com.mx", t24);
    Tienda tienda25 = new Tienda("LIBRERÍA EL TERCER MILENIO S.A. DE C.V.", "Benito Juárez núm. 436 PB, Col. Centro, 38000, Celaya, Gto. ", "(461) 612-55-37", "(461) 616-26-38", "", "libelli.mitzi@hotmail.com", t25);
    Tienda tienda26 = new Tienda("MARÍA DE LA LUZ ALICIA AGUILAR TORRES", "Río Suchiate núm. 1626, Col. La Pradera, 36630, Irapuato, Gto.", "(462) 600-13-95", "", "", "karcava@hotmail.com", t26);
    Tienda tienda27 = new Tienda("LIBRERÍA VAQUITA", "Cuauhtémoc núm. 33-A, Col. Centro, 40890, Zihuatanejo, Gro.", "(755) 554-14-93", "(755) 558-89-97", "", "vaquitazihua@hotmail.com", t27);
    Tienda tienda28 = new Tienda("ALLBOOKS LIBRERÍA", "Av. Aviacion núm. 5051-6, Condominio City Park, Col. San Juan de Ocotán, 45019, Zapopan, Jal.", "(331) 201-11-50", "(333) 627-73-56", "www.allbooks.com.mx", "charlemos@allbooks.com.mx", t28);
    Tienda tienda29 = new Tienda("LIBRERÍA ESCOLAR", "Calle 9 núm. 250, Col. Ferrocarril, 44440, Guadalajara, Jal.", "(333) 614-17-70", "(333) 613-37-51", "libreriaescolargdl.mx", "libreriaescolargdl@live.com.mx", t29);
    Tienda tienda30 = new Tienda("LIBRERÍAS GONVILL S.A. DE C.V.", "Av. 8 de Julio núm. 825, Col. Moderna, 44190, Guadalajara, Jal. ", "(33) 3837-23-00", "(33) 3837-23-09", "www.gonvill.com.mx", "librosbooks@gonvill.com.mx", t30);
    Tienda tienda31 = new Tienda("DELTI NEZA", "Av. Chimalhuacán núm. 349-A esq. con Zandunga, Col. Benito Juárez, 57000, Ciudad Nezahualcóyotl, Edo. de Méx.", " (55) 22-32-73-66", "", "www.delti.com.mx", "shernandez@delti.com.mx", t31);
    Tienda tienda32 = new Tienda("DELTI IZCALLI", "Av. 1o de Mayo Mz. C núm. 24-B Locales 269 y 271, Col. Centro, 54740, Cuautitlán Izcalli, Edo. de Méx.", "(55) 58-81-17-98", "", "www.delti.com.mx", "avillarreal@delti.com.mx", t32);
    Tienda tienda33 = new Tienda("DISTRIBUIDORA DE LIBROS GOGA", "Barranca Dos núm. 12, Col. Valle Dorado Chamapa, 53690, Naucalpan, Edo. de Méx.", "(55) 53-01-68-35", "", "", "angeles-5520@hotmail.com", t33);
    Tienda tienda34 = new Tienda("LONDON BOOKSTORE S.A DE C.V.", "Ignacio Allende núm. 909-B, Col. Francisco Murguía, 50130, Toluca, Edo. de Méx.", "(722) 216-45-65", "", "", "londonmetepec@prodigy.net.mx", t34);
    Tienda tienda35 = new Tienda("MEETING POINT BOOK SHOP NORTE", "Vía Morelos Km.20.5 Local-7 Col. San José Jajalpa, 55090, \u2028Ecatepec de Morelos, Edo. de Méx.", "(55) 51-16-37-64", "", "", "mpbcompras@meetingpoint.com.mx", t35);
    Tienda tienda36 = new Tienda("LIBRERÍA HIDALGO", "Lago de Camécuaro núm. 690, Col. Ventura Puente, 58020, Morelia, Mich.", "(443) 317-20-26", "", "www.libreriashidalgo.com.mx", "iceniceros@libreriashidalgo.com.mx", t36);
    Tienda tienda37 = new Tienda("ROSENDO ALFONSO MARTÍNEZ CHÁVEZ", "2da. Privada Diagonal de Aldama núm. 13, Col. Tamacua, 60090, Uruapan, Mich. ", "(452) 523-17-53", "(452) 149-18-23", "", "rosendomartinezsantillana@prodigy.net.mx", t37);
    Tienda tienda38 = new Tienda("LIBRERÍA SEMBRADORA DE LIBROS", "Blvd. Tepic-Xalisco núm. 97-D, Col. Caja de Agua, 63158, Tepic, Nay.", "(311) 119-19-15", "(311) 133-06-65", "", "sembradora_libros@hotmail.com", t38);
    Tienda tienda39 = new Tienda("DILSE", "Castelar núm. 23, Col. Independencia, 64720, Monterrey, N. L.", "(81) 81-90-15-97", "", "", "enlance_karlarredondo@hotmail.com", t39);
    Tienda tienda40 = new Tienda("DITEXA BOOKSTORE, S.A. DE C.V.", "ueva Jersey núm. 4335, Col. Res. Abraham Lincoln, 64310, Monterrey, N. L.", "(81) 83-11-85-39", "(81) 83-11-85-40", "www.ditexa.com", "ditexa@prodigy.net.mx", t40);
    Tienda tienda41 = new Tienda("EDIMSA", "Morelos núm. 437, Col. Centro,64000, Monterrey, N. L.", "(81) 83-40-11-64", "(81) 83-43-80-30", "www.edimsa.com.mx", "informes@edimsa.com.mx", t41);
    Tienda tienda42 = new Tienda("PROVEEDORA ESCOLAR", "Independencia núm. 1001, Col. Centro, 68000, Oaxaca de Juárez, Oax.", "(951) 501-85-00", "(951) 501-52-17", "www.proveedora-escolar.com.mx", "juanjoseproveedora@gmail.com", t42);
    Tienda tienda43 = new Tienda("LIBRERÍA BRITÁNICA", "Av. 25 Pte. núm. 1705, Locales A y B, Col. Volcanes, 72410, Puebla, Pue.", "(222) 296-73-37", "(222) 296-73-38", "www.libreriabritanica.com", "libreriabritanica@prodigy.net.mx", t43);
    Tienda tienda44 = new Tienda("ROCÍO JAIMEZ DISTRIBUIDOR", "Carlos Pacheco núm. 34, Col. Héroes de Puebla, 72520, Puebla, Pue.", "(222) 236-87-67", "(222) 235-78-27", "", "rociojaimez@hotmail.com", t44);
    Tienda tienda45 = new Tienda("TEXTOS Y TENTACIONES LITERARIAS", "3 Poniente núm. 719-B, Col. Centro, 72000, Puebla, Pue.", "(222) 298-23-66", "", "", "textosytentacionesliterarias@gmail.com", t45);
    Tienda tienda46 = new Tienda("CASI DISTRIBUIDORA", "Av. Canadá núm. 244, Plaza de las Américas Col. Carretas, 76050, Querétaro, Qro.", "(442) 248-37-81", "(442) 142-59-85", "", "je57_cabrera@hotmail.com", t46);
    Tienda tienda47 = new Tienda("LIBRERIA ENGLISH SERVICES", "Francisco I. Madero núm 301 Poniente, Col. Niños Héroes,76010, Querétaro, Qro.", "(442) 216-65-60", "", "", "english.services@cdq-libros.com", t47);
    Tienda tienda48 = new Tienda("PROVESA", "Miguel Ángel de Quevedo núm. 17, Local J Plaza Zeus, Col. Jardines de la Hacienda,76180, Querétaro, Qro", "(442) 195-53-69", "(442) 195-56-23", "", "pedidosweb@provesa.mx", t48);
    Tienda tienda49 = new Tienda("JOSÉ ALEJANDRINO LEAL MARTÍNEZ", "Av. De las Torres SM 505 Mza 6 Lote 3, 77500, Cancún, Q. Roo", "(998) 848-22-53", "", "", "libreriaalbatros@hotmail.com", t49);
    Tienda tienda50 = new Tienda("LIBRERÍA Y PAPELERÍA EL RECREO", "Av. Héroes núm. 273 esquina Camelias, Col. Adolfo López Mateos, 77010, Chetumal, Q. Roo", "(983) 285-34-38", "", "", "sicavi34@hotmail.com", t50);
    Tienda tienda51 = new Tienda("THE ENGLISH CORNER", "Tatanacho núm. 245, Col. Jardines del Estadio, 78280, San Luis Potosí, S.L.P.", "(444) 833-14-00", "(444) 8137153", "", "almacen.eltslp@hotmail.com", t51);
    Tienda tienda52 = new Tienda("DISTRIBUIDORA JAVEL", "Av. del Océano núm. 1602, Col. Residencial Azaleas, 80058, Culiacán, Sin.", "(667) 257-04-51", "(667) 150-55-87", "", "veronica.javel@hotmail.com", t52);
    Tienda tienda53 = new Tienda("LIBRERÍAS MÉXICO DEL PACÍFICO S.A. DE C.V.", "Álvaro Obregón núm. 433 Sur esq. Juan Jose Ríos, Col. Jorge Almada, 80200, Culiacán, Sin.", "(667) 712-85-56", "(667) 716-36-85", "", "libreriasmexico@hotmail.com", t53);
    Tienda tienda54 = new Tienda("DELTI", "Blvd. Navarrete núm. 80-B, Col. Valle Escondido, 83207, Hermosillo, Son.", "(662) 213-77-33", "", "www.delti.com.mx", "pvillanueva@delti.com.mx", t54);
    Tienda tienda55 = new Tienda("LIBRERÍA NOROESTE", "Luis Donaldo Colosio y Matamoros, Edif. Fer Loc. 12, Col. Centro, 83000 Hermosillo, Son.", "(662) 217-19-89", "(662) 212-29-86", "", "librerianoroeste@hotmail.com", t55);
    Tienda tienda56 = new Tienda("LIBROMEX", "5 de Febrero núm. 14, Col. 5 de Mayo, 83010, Hermosillo, Son.", "(662) 212-65-25", "(662) 212-65-26", "", "karlaleon@libromex.com.mx", t56);
    Tienda tienda57 = new Tienda("JUAN JOSÉ GUERRERO TAPIA", "Venustiano Carranza núm. 1209, Col. Centro, 86000, Villahermosa, Tab.", "(993) 315-65-97", "", "", "librosintegrales@hotmail.com", t57);
    Tienda tienda58 = new Tienda("GRUPO LYPRO, S. DE R.L. DE C.V", "Blvd. Manuel Cavazos Lerma núm 203, Col. Euzkadi, 87370, Nuevo Laredo, Tamps.", "(868) 819-26-06", "", "www.lypro.com.mx", "servicioaclientes_libros@lypro.com.mx", t58);
    Tienda tienda59 = new Tienda("LIBRERÍA COSMOS", "Plaza Palmas 7 y 8, Col.Petrolera, 89110, Tampico, Tamps.", "(833) 217-64-30", "", "www.libreriacosmos.com", "ventas@libreriacosmos.com", t59);
    Tienda tienda60 = new Tienda("LIBROS Y TEXTOS EN ACCIÓN", "Jesús Luna Luna Norte núm. 304, Col. Luna Luna, C.P. 89514, CD. Madero, Tamps.", "(833) 361-37-99", "", "", "dlt_litea@yahoo.com.mx", t60);
    Tienda tienda61 = new Tienda("LIBRERÍA CIENTÍFICA", "20 de Noviembre núm. 717, Col. Flores Magón, C.P. 91900, Veracruz, Ver.", "(229) 932-90-53", "", "", "escolar@libcientifica.com", t61);
    Tienda tienda62 = new Tienda("LIBRERÍA VIRGO", "Calle 8 norte S/N, Edificio Juárez PB, Col. Obrera, C.P. 93260, Poza Rica, Ver", "(782) 823-21-46", "", "www.libreriavirgo.com.mx", "libreriavirgo@hotmail.com", t62);
    Tienda tienda63 = new Tienda("LIBRERÍA Y PAPELERÍA DEL MAESTRO", "Ejército Mexicano núm. 10, Col. Centro, 96700, Minatitlán, Ver.", "(922) 223-20-48", "", "", "librería.del.maestro@gmail.com", t63);
    Tienda tienda64 = new Tienda("LIBRERÍA LONDRES", "Calle 62 núm. 295-C X 29 y Cúpules, Col. Alcalá Martín, 97050, Mérida, Yuc.", "(999) 920-24-34", "(999) 925-61-47", "", "", t64);
    Tienda tienda65 = new Tienda("DISTRIBUIDORA LAS COLINAS", "Colina del Ángel núm. 213, Col. Las Colinas 98098, Zacatecas, Zac.", "(492) 922-60-22", "", "", "elquijote.zac@hotmail.es", t65);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarMapa);
        setSupportActionBar(toolbar);

        ActionBar bar = getSupportActionBar();
        final Drawable upArrow = getResources().getDrawable(R.drawable.rsz_back_simple);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        bar.setDisplayHomeAsUpEnabled(true);

        bar.setTitle("");

        fabEstados = (FloatingActionButton)findViewById(R.id.fabEstados);
        fabEstados.setOnClickListener(this);


        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();

        mLocationRequest = LocationRequest.create()
                .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
                .setInterval(10 * 1000)        // 10 seconds, in milliseconds
                .setFastestInterval(1 * 1000); // 1 second, in milliseconds

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            origen = extras.getInt("origen");
        }

        int off = 0;
        try {
            off = Settings.Secure.getInt(getContentResolver(), Settings.Secure.LOCATION_MODE);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }

        if(off==0){
            Intent onGPS = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(onGPS);
        }

        agregarMarcadores = new AgregarMarcadores();

        Tiendas.add(tienda1);
        Tiendas.add(tienda2);
        Tiendas.add(tienda3);
        Tiendas.add(tienda4);
        Tiendas.add(tienda5);
        Tiendas.add(tienda6);
        Tiendas.add(tienda7);
        Tiendas.add(tienda8);
        Tiendas.add(tienda9);
        Tiendas.add(tienda10);
        Tiendas.add(tienda11);
        Tiendas.add(tienda12);
        Tiendas.add(tienda13);
        Tiendas.add(tienda14);
        Tiendas.add(tienda15);
        Tiendas.add(tienda15);
        Tiendas.add(tienda16);
        Tiendas.add(tienda17);
        Tiendas.add(tienda18);
        Tiendas.add(tienda19);
        Tiendas.add(tienda20);
        Tiendas.add(tienda21);
        Tiendas.add(tienda22);
        Tiendas.add(tienda23);
        Tiendas.add(tienda24);
        Tiendas.add(tienda25);
        Tiendas.add(tienda26);
        Tiendas.add(tienda27);
        Tiendas.add(tienda28);
        Tiendas.add(tienda29);
        Tiendas.add(tienda30);
        Tiendas.add(tienda31);
        Tiendas.add(tienda32);
        Tiendas.add(tienda33);
        Tiendas.add(tienda34);
        Tiendas.add(tienda35);
        Tiendas.add(tienda36);
        Tiendas.add(tienda37);
        Tiendas.add(tienda38);
        Tiendas.add(tienda39);
        Tiendas.add(tienda40);
        Tiendas.add(tienda41);
        Tiendas.add(tienda42);
        Tiendas.add(tienda43);
        Tiendas.add(tienda44);
        Tiendas.add(tienda45);
        Tiendas.add(tienda46);
        Tiendas.add(tienda47);
        Tiendas.add(tienda48);
        Tiendas.add(tienda49);
        Tiendas.add(tienda50);
        Tiendas.add(tienda51);
        Tiendas.add(tienda52);
        Tiendas.add(tienda53);
        Tiendas.add(tienda54);
        Tiendas.add(tienda55);
        Tiendas.add(tienda56);
        Tiendas.add(tienda57);
        Tiendas.add(tienda58);
        Tiendas.add(tienda59);
        Tiendas.add(tienda60);
        Tiendas.add(tienda61);
        Tiendas.add(tienda62);
        Tiendas.add(tienda63);
        Tiendas.add(tienda64);
        Tiendas.add(tienda65);

        search = (ImageView)findViewById(R.id.imageView8);
        search.setOnClickListener(this);

        home = (LinearLayout)findViewById(R.id.home);
        buscar = (LinearLayout)findViewById(R.id.buscar);
        where = (LinearLayout)findViewById(R.id.where);

        home.setOnClickListener(this);
        buscar.setOnClickListener(this);
        where.setOnClickListener(this);

        Typeface leagueGothic = Typeface.createFromAsset(getAssets(), "league_gothic.otf");
        textHome = (TextView)findViewById(R.id.textHome);
        textSearch = (TextView)findViewById(R.id.textSearch);
        textWhere = (TextView)findViewById(R.id.textWhere);

        textHome.setTypeface(leagueGothic);
        textSearch.setTypeface(leagueGothic);
        textWhere.setTypeface(leagueGothic);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.imageView8:
            {
                Intent intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            }break;

            case R.id.home:
            {
                Intent intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            }break;

            case R.id.buscar:
            {
                Intent intent = new Intent(this, SearchActivity.class);
                startActivity(intent);
            }break;

            case R.id.where:
            {
                Intent intent = new Intent(this, MapaActivity.class);
                startActivity(intent);
            }break;

            case R.id.fabEstados:
            {
                Intent intent = new Intent(this, ListaEstadosActivity.class);
                startActivity(intent);
            }
        }
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        Location mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);
        if (mLastLocation != null) {

            LatLng actual = new LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude());
            coordenadasInicio = actual;


            handleNewLocation(coordenadasInicio);

        }
    }

    @Override
    public void onConnectionSuspended(int i) {
        Log.i(TAG, "Location services suspended. Please reconnect.");
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            try {
                // Start an Activity that tries to resolve the error
                connectionResult.startResolutionForResult(this, CONNECTION_FAILURE_RESOLUTION_REQUEST);
            } catch (IntentSender.SendIntentException e) {
                e.printStackTrace();
            }
        } else {
            Log.i(TAG, "Location services connection failed with code " + connectionResult.getErrorCode());
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGoogleApiClient.connect();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mGoogleApiClient.isConnected()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
            mGoogleApiClient.disconnect();
        }
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        googleMapObject = googleMap;

    }

    private void handleNewLocation(LatLng actual) {

        Geocoder geocoder;
        List<Address> yourAddresses;
        geocoder = new Geocoder(this, Locale.getDefault());
        try {
            yourAddresses = geocoder.getFromLocation(coordenadasInicio.latitude, coordenadasInicio.longitude, 1);
            if (yourAddresses.size() > 0) {
                String yourAddress = yourAddresses.get(0).getAddressLine(0);
                String yourCity = yourAddresses.get(0).getAddressLine(1);
                String yourCountry = yourAddresses.get(0).getAddressLine(2);

                String completo;
                completo = yourAddress + ", " + yourCity + ", " + yourCountry;

                ubicacionFinal = completo;

                if (completo.length() > 38) {
                    completo = completo.substring(0, 35);
                    completo = completo + "...";
                }

                //ubicacionActual.setText(completo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        googleMapObject.clear();
        LatLng temporal = new LatLng(19.414764, -99.176663);
        CameraUpdate center = CameraUpdateFactory.newLatLng(actual);
        CameraUpdate zoom = CameraUpdateFactory.zoomTo(12);

        for (int i = 0; i < Tiendas.size() ; i++)
        {
            String upToNCharacters = Tiendas.get(i).address.substring(0, Math.min(Tiendas.get(i).address.length(), 30));

            Bitmap img = BitmapFactory.decodeResource(getResources(),R.drawable.pin_richmond);
            BitmapDescriptor bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(img);

            MarkerOptions markerOptions = new MarkerOptions().icon(bitmapDescriptor).position(Tiendas.get(i).location).title(Tiendas.get(i).name);

            googleMapObject.addMarker(markerOptions).setSnippet(upToNCharacters + "... Tel: " + Tiendas.get(i).phoneA);

        }

        googleMapObject.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {

            @Override
            public void onInfoWindowClick(Marker marker) {

                info(marker.getTitle());
            }
        });

        googleMapObject.moveCamera(center);
        googleMapObject.animateCamera(zoom);

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        googleMapObject.setMyLocationEnabled(true);

    }

    public void info(String titulo)
    {
        String tienda = "";
        String direccion = "";
        String telefono = "";

        for (int i = 0; i < Tiendas.size(); i++)
        {
            if(Tiendas.get(i).name.equals(titulo))
            {
                tienda = Tiendas.get(i).name;
                direccion = Tiendas.get(i).address;
                ubicacion = Tiendas.get(i).location;
                telefono = Tiendas.get(i).phoneA;
            }
        }


        new AlertDialog.Builder(this)
                .setTitle(tienda)
                .setMessage(direccion + "\n" + "Teléfono: " + telefono)
                .setPositiveButton("Navegar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        Uri gmmIntentUri = Uri.parse("google.navigation:q=" + ubicacion.latitude + "," + ubicacion.longitude);
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        startActivity(mapIntent);
                    }
                })
                .setNegativeButton("Cerrar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setIcon(R.mipmap.ic_launcher)
                .show();
    }

    public class AgregarMarcadores extends AsyncTask<Void, Void, Boolean> {

        AgregarMarcadores() {

        }
        @Override
        protected Boolean doInBackground(Void... params) {
            new Thread(new Runnable() {
                @Override
                public void run() {



                }
            }).start();
            try {
                // Simulate network access.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                return false;
            }
            // TODO: register the new account here.
            return true;
        }
        @Override
        protected void onPostExecute(final Boolean success) {

           agregarMarcadores = null;
        }
        @Override
        protected void onCancelled() {

            agregarMarcadores = null;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, MainMenuActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
