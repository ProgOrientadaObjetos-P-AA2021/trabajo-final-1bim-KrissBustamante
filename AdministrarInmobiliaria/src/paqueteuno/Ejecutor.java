/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;
import java.util.Scanner;
import paqueteseis.*;
import paquetedos.*;
import paquetetres.*;
import paquetecuatro.*;
import paquetecinco.*;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salida = true;
        int opcionIngreso;
        int ingresarMostrar;
        do {
            System.out.println("Administración Inmobiliaria");
            System.out.printf("Eliga la opcion que desea:"
                    + "\n1.Ingresar registros\n2.Mostrar registros\n3.Verificar"
                    + " Datos\n4. salir\n> ");
            ingresarMostrar = sc.nextInt();
            if (ingresarMostrar == 1) {
                System.out.println("Seleccione la opcion que desea:");
                System.out.printf("1 Si desea ingresar un propietario\n"
                        + "2 Si desea ingresar una ubicacion\n"
                        + "3 Si desea ingresar una ciudad\n"
                        + "4 Si desea ingresar una constructora\n"
                        + "5 Si desea ingresar una casa\n"
                        + "6 Si desea ingresar un departamento\n> ");
                sc.nextLine();
                opcionIngreso = sc.nextInt();
                switch (opcionIngreso) {
                    case 1:
                        ingresoPropietarios();

                        break;
                    case 2:
                        ingresoUbicaciones();
                        break;
                    case 3:
                        ingresoCiudades();
                        break;
                    case 4:
                        ingresoConstructoras();
                        break;
                    case 5:
                        System.out.println("Antes de ingresar una casa es "
                                + "necesario que verifique si constan sus\n"
                                + "datos en el sistema, caso contrario su "
                                + "solicitud sera invalidada");
                        sc.nextLine();
                        System.out.println("Ingrese la identificacion del "
                                + "Propietario:");
                        String idPropi = sc.nextLine();
                        System.out.println("Ingrese el numero de casa:");
                        int numCasa = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el nombre de la ciudad:");
                        String nombreCiudad = sc.nextLine();
                        System.out.println("Ingres ID de la empresa de la "
                                + "constructora:");
                        String constructoraID = sc.nextLine();
                       
                        verificacionPrincipal(idPropi, numCasa, nombreCiudad,
                                constructoraID);
                        ingresoCasas(idPropi, numCasa, nombreCiudad,
                                constructoraID);
                        break;
                    case 6:
                        System.out.println("Antes de ingresar un departamento "
                                + "es necesario que verifique si constan sus\n"
                                + "datos en el sistema, caso contrario su "
                                + "solicitud sera invalidada");
                        sc.nextLine();
                        System.out.println("Ingrese la identificacion del "
                                + "Propietario:");
                        String idPropiDepa = sc.nextLine();
                        System.out.println("Ingrese el numero del "
                                + "Departamento:");
                        int numDepa = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese el nombre de la ciudad:");
                        String nombreCiudadDepa = sc.nextLine();
                        System.out.println("Ingres el ID de la empresa "
                                + "constructora:");
                        String idCostructoraDepa = sc.nextLine();
               
                        verificacionPrincipal(idPropiDepa, numDepa,
                                nombreCiudadDepa, idCostructoraDepa);
                        ingresoDepartamento(idPropiDepa, numDepa,
                                nombreCiudadDepa, idCostructoraDepa);
                        break;
                    default:
                        System.err.println("Eligio una opcion fuera del "
                                + "rango(1-6)");
                }
            } else {
                if (ingresarMostrar == 2) {
                    System.out.println("Que lista desea mostrar:");
                    System.out.printf("1.Mostrar lista de propietarios\n"
                            + "2.Mostrar lista de ubicaciones\n"
                            + "3.Mostrar lista de una ciudades\n"
                            + "4.Mostrar lista de una constructoras\n"
                            + "5.Mostrar lista de una casas\n"
                            + "6.Mostrar lista de un departamentos\n> ");
                    opcionIngreso = sc.nextInt();
                    switch (opcionIngreso) {
                        case 1:
                            mostrarPropietarios();
                            break;
                        case 2:
                            mostrarUbicaciones();
                            break;
                        case 3:
                            mostrarCiudades();
                            break;
                        case 4:
                            mostrarConstructoras();
                            break;
                        case 5:
                            mostrarCasas();
                            break;
                        case 6:
                            mostrarDepartamentos();
                            break;
                        default:
                            System.err.println("Eligio una opcion fuera del "
                                    + "rango(1-6)");
                    }
                }
                if (ingresarMostrar == 3) {
                    System.out.println("Que datos desea Verificar:");
                    System.out.printf("1.Verificar propietario\n"
                            + "2.Verificar ubicaciones\n"
                            + "3.Verificar ciudad\n"
                            + "4.Verificar constructora\n");
                    sc.nextLine();
                    opcionIngreso = sc.nextInt();
                    switch (opcionIngreso) {
                        case 1:
                            System.out.println("Ingrese la identificacion del "
                                    + "Propietario:");
                            sc.nextLine();
                            String verificacionPorpi = sc.nextLine();
                            verificacionPropietarios(verificacionPorpi);
                            break;
                        case 2:
                            System.out.println("Ingrese el numero de la "
                                    + " casa o Departamento:");
                            int verificacionNumDepa = sc.nextInt();
                            verificacionUbicacion(verificacionNumDepa);
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.println("Ingrese el nombre de la ciudad:");
                            String verificacionCity = sc.nextLine();
                            verificacionCiudad(verificacionCity);
                            break;
                        case 4:
                            sc.nextLine();
                            System.out.println("Ingres el ID de la empresa "
                                    + "constructora:");
                            String verificacionidCons = sc.nextLine();
                            verificacionConstructora(verificacionidCons);
                            break;
                        default:
                            System.err.println("Eligio una opcion fuera del "
                                    + "rango(1-4)");

                    }
                }
                if (ingresarMostrar == 4) {
                    salida = false;
                    System.out.println("\u001B[34mGracias por registrarce en "
                            + "nuestra inmobiliaria");
                }
                if (ingresarMostrar != 1 && ingresarMostrar != 2
                        && ingresarMostrar != 3 && ingresarMostrar != 4) {
                    System.err.println("Eligio una opcion fuera del "
                            + "rango(1-4)");

                }
            }
        } while (salida);
    }

   
    public static void ingresoPropietarios() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus nombres:");
        String nombres = sc.nextLine();
        System.out.println("Ingrese sus apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Ingrese su identificacion");
        String id = sc.nextLine();
        Propietario propi = new Propietario(nombres, apellidos, id);

        EscrituraArchivoPropietario archivoPropi
                = new EscrituraArchivoPropietario("propietario.txt");
  
        archivoPropi.establecerRegistro(propi);
        archivoPropi.establecerSalida();
       
        archivoPropi.cerrarArchivo();
    }

    
    public static void ingresoUbicaciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su barrio:");
        String nombreBarrio = sc.nextLine();
        System.out.println("Ingrese una referencia de su ubicacion ");
        String refencia = sc.nextLine();
        System.out.println("Ingrese el numero de la casa");
        int numCasa = sc.nextInt();
        Ubicacion ubi = new Ubicacion(numCasa, nombreBarrio, refencia);
      
        EscrituraArchivoUbicacion archivoUbi
                = new EscrituraArchivoUbicacion("ubicacion.txt");
        archivoUbi.establecerRegistro(ubi);
        archivoUbi.establecerSalida();
    
        archivoUbi.cerrarArchivo();
    }


    public static void ingresoCiudades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su ciudad:");
        String ciudad = sc.nextLine();
        System.out.println("Ingrese el nombre de su provincia");
        String provincia = sc.nextLine();
        Ciudad city = new Ciudad(ciudad, provincia);
    
        EscrituraArchivoCiudad archivoCiu
                = new EscrituraArchivoCiudad("ciudad.txt");
        archivoCiu.establecerRegistro(city);
        archivoCiu.establecerSalida();
        archivoCiu.cerrarArchivo();
    }

    public static void ingresoConstructoras() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la contructora:");
        String nombreConstructora = sc.nextLine();
        System.out.println("Ingrese el id Empresarial ");
        String idEmpresa = sc.nextLine();
        Constructora constructora
                = new Constructora(nombreConstructora, idEmpresa);
       
        
        EscrituraArchivoConstructora archivoCons
                = new EscrituraArchivoConstructora("constructora.txt");
        archivoCons.establecerRegistro(constructora);
        archivoCons.establecerSalida();
        archivoCons.cerrarArchivo();
    }

    public static void ingresoCasas(String idPropi, int numCasa,
            String nameCiudad, String constructoraID) {
        Scanner sc = new Scanner(System.in);
        //Declaro Araylists de objetos para guardar los objetos
      
        ArrayList<Propietario> propietarios;
        ArrayList<Ubicacion> ubicaciones;
        ArrayList<Ciudad> ciudades;
        ArrayList<Constructora> constructoras;
        
        
        System.out.println("Ingrese el precio por metro Cuadrado");
        double precioMetroCuadrado = sc.nextDouble();
        System.out.println("Ingrese el numero de metros cuadrados de la casa:");
        int numMetroCuadrado = sc.nextInt();
        System.out.println("Ingrese el numero de cuartos de la casa:");
        int numeroCuartos = sc.nextInt();
      
        LecturaArchivoPropietario lecturPropietarios
                = new LecturaArchivoPropietario("propietario.txt");
        lecturPropietarios.establecerListaPropietarios();
        
       
        
        propietarios = lecturPropietarios.obtenerListaPropietarios();
        String nombrePropi = "";
        String apellidoPropi = "";
       
        
        for (int i = 0; i < propietarios.size(); i++) {
            if (propietarios.get(i).getIdentificacion().equals(idPropi)) {
                nombrePropi = propietarios.get(i).getNombres();
                apellidoPropi = propietarios.get(i).getApellidos();
            }
        }
        Propietario objPropi = new Propietario(nombrePropi, apellidoPropi,
                idPropi);
        
        LecturaArchivoUbicacion lecturaUbicacion
                = new LecturaArchivoUbicacion("ubicacion.txt");
        lecturaUbicacion.establecerListaUbicacion();
       
        ubicaciones = lecturaUbicacion.obtenerListaUbicacion();
        String nombreBarri = "";
        String referens = "";
        for (int i = 0; i < ubicaciones.size(); i++) {
            int numC = ubicaciones.get(i).obtenerNumCasa();
            if (numC == numCasa) {
                nombreBarri = ubicaciones.get(i).obtenerNombreBarrio();
                referens = ubicaciones.get(i).obtenerReferencia();
            }
        }
        Ubicacion objUbicacion = new Ubicacion(numCasa, nombreBarri, referens);
     
        
        LecturaArchivoCiudad lecturaCiudad
                = new LecturaArchivoCiudad("ciudad.txt");
        lecturaCiudad.establecerListaCiudad();
        
        ciudades = lecturaCiudad.obtenerListaCiudad();
        String nombreProvincia = "";
        for (int i = 0; i < lecturaCiudad.obtenerListaCiudad().size(); i++) {
            if ((ciudades.get(i).obtenerNombreCiudad().toLowerCase()).equals(nameCiudad.toLowerCase())) {
                nombreProvincia = ciudades.get(i).obtenerNombreCiudad();
            }
        }
        Ciudad objCity = new Ciudad(nameCiudad, nombreProvincia);
       
        LecturaArchivoConstructora lectruaConstructora
                = new LecturaArchivoConstructora("constructora.txt");
        lectruaConstructora.establecerListaConstructora();
    
        constructoras = lectruaConstructora.obtenerListaConstructora();
        String nombreConstructora = "";
        for (int i = 0; i < lectruaConstructora.obtenerListaConstructora().
                size(); i++) {
            if (constructoras.get(i).obtenerIdEmpresarial().equals(constructoraID)) {
                nombreConstructora = constructoras.get(i).obtenerNombreConstructora();
            }
        }
        Constructora objContructora
                = new Constructora(nombreConstructora, constructoraID);
     
        Casa casa = new Casa(objPropi, precioMetroCuadrado, numMetroCuadrado,
                objUbicacion, objCity, numeroCuartos, objContructora);
        casa.establecerPrecioFinal();
     
        EscrituraArchivoCasa archivoCasa = new EscrituraArchivoCasa("casa.txt");
        archivoCasa.establecerRegistro(casa);
        archivoCasa.establecerSalida();
        archivoCasa.cerrarArchivo();
    }


    public static void ingresoDepartamento(String idPropi, int numCasa,
            String nameCiudad, String constructoraID) {
        Scanner sc = new Scanner(System.in);
       
        
        ArrayList<Propietario> propietarios;
        ArrayList<Ubicacion> ubicaciones;
        ArrayList<Ciudad> citys;
        ArrayList<Constructora> constructoras;
       
        System.out.println("Ingrese el precio por metro Cuadrado:");
        double precioMetroCuadrado = sc.nextDouble();
        System.out.println("Ingrese el numero de metros cuadrados del "
                + "departamento:");
        int numMetroCuadrado = sc.nextInt();
        System.out.println("Ingrese el valor de la cuota mensual:");
        double cuotaMensual = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el nombre del edificio:");
        String nameEdificio = sc.nextLine();
        System.out.println("Ingrese la dirección del edificio:");
        String ubicacionEdi = sc.nextLine();
 
        
        
        LecturaArchivoPropietario lecturPropietarios
                = new LecturaArchivoPropietario("propietario.txt");
        lecturPropietarios.establecerListaPropietarios();
        propietarios = lecturPropietarios.obtenerListaPropietarios();
        String nombrePropi = "";
        String apellidoPropi = "";
        for (int i = 0; i < propietarios.size(); i++) {
            if (propietarios.get(i).getIdentificacion().equals(idPropi)) {
                nombrePropi = propietarios.get(i).getNombres();
                apellidoPropi = propietarios.get(i).getApellidos();
            }
        }
        Propietario objPropi = new Propietario(nombrePropi, apellidoPropi,
                idPropi);
   
        LecturaArchivoUbicacion lecturaUbicacion
                = new LecturaArchivoUbicacion("ubicacion.txt");
        lecturaUbicacion.establecerListaUbicacion();
        ubicaciones = lecturaUbicacion.obtenerListaUbicacion();
        String nombreBarri = "";
        String referens = "";
        for (int i = 0; i < ubicaciones.size(); i++) {
            int numC = ubicaciones.get(i).obtenerNumCasa();
            if (numC == numCasa) {
                nombreBarri = ubicaciones.get(i).obtenerNombreBarrio();
                referens = ubicaciones.get(i).obtenerReferencia();
            }
        }
        Ubicacion objUbicacion = new Ubicacion(numCasa, nombreBarri, referens);
       
        LecturaArchivoCiudad lecturaCity
                = new LecturaArchivoCiudad("ciudad.txt");
        lecturaCity.establecerListaCiudad();
        citys = lecturaCity.obtenerListaCiudad();
        String nombreProvincia = "";
        for (int i = 0; i < lecturaCity.obtenerListaCiudad().size(); i++) {
            if (citys.get(i).obtenerNombreCiudad().equals(nameCiudad)) {
                nombreProvincia = citys.get(i).obtenerNombreCiudad();
            }
        }
        Ciudad objCity = new Ciudad(nameCiudad, nombreProvincia);
        
        LecturaArchivoConstructora lectruaConstructora
                = new LecturaArchivoConstructora("constructora.txt");
        lectruaConstructora.establecerListaConstructora();
        constructoras = lectruaConstructora.obtenerListaConstructora();
        String nombreConstructora = "";
        for (int i = 0; i < lectruaConstructora.obtenerListaConstructora().
                size(); i++) {
            if (constructoras.get(i).obtenerIdEmpresarial().equals(constructoraID)) {
                nombreConstructora = constructoras.get(i).
                        obtenerNombreConstructora();
            }
        }
        Constructora objContructora = new Constructora(nombreConstructora,
                constructoraID);
       
        Departamento depa = new Departamento(objPropi, precioMetroCuadrado,
                numMetroCuadrado, cuotaMensual, objUbicacion, objCity,
                nameEdificio, ubicacionEdi, objContructora);
        depa.establecerPrecio();
        depa.establecerCostoFinal();
        EscrituraArchivoDepartamento archivoDepa
                = new EscrituraArchivoDepartamento("departamento.txt");
        archivoDepa.establecerRegistroDepartamento(depa);
        archivoDepa.establecerSalida();
        archivoDepa.cerrarArchivo();
    }

    public static void mostrarPropietarios() {
        LecturaArchivoPropietario lecturaCasas
                = new LecturaArchivoPropietario("propietario.txt");
        lecturaCasas.establecerListaPropietarios();
        System.out.println(lecturaCasas);
    }

    public static void mostrarUbicaciones() {
        LecturaArchivoUbicacion lecturaUbicacion
                = new LecturaArchivoUbicacion("ubicacion.txt");
        lecturaUbicacion.establecerListaUbicacion();
        System.out.println(lecturaUbicacion);
    }

    public static void mostrarCiudades() {
        LecturaArchivoCiudad lecturaCity
                = new LecturaArchivoCiudad("ciudad.txt");
        lecturaCity.establecerListaCiudad();
        System.out.println(lecturaCity);
    }

    public static void mostrarConstructoras() {
        LecturaArchivoConstructora lecturaConstructora
                = new LecturaArchivoConstructora("constructora.txt");
        lecturaConstructora.establecerListaConstructora();
        System.out.println(lecturaConstructora);
    }

    public static void mostrarCasas() {
        LecturaArchivoCasa lecturaCasa
                = new LecturaArchivoCasa("casa.txt");
        lecturaCasa.establecerListaCasas();
        System.out.println(lecturaCasa);
    }

    public static void mostrarDepartamentos() {
        LecturaArchivoDepartamento lecturaDepartamento
                = new LecturaArchivoDepartamento("departamento.txt");
        lecturaDepartamento.establecerDepartamentos();
        System.out.println(lecturaDepartamento);
    }


    public static void verificacionPrincipal(String idPropi, int numCas,
            String nameCiu, String constructoraID) {

        Scanner sc = new Scanner(System.in);
      
        System.out.println("Verificacion de Propietario=");
        if (verificacionPropietarios(idPropi) == 0) {
            ingresoPropietarios();
        }
        System.out.println("Verificacion de Ubicacion");
        if (verificacionUbicacion(numCas) == 0) {
            ingresoUbicaciones();
        }
        sc.nextLine();
        System.out.println("Verificacion de Ciudad");
        if (verificacionCiudad(nameCiu) == 0) {
            ingresoCiudades();
        }
        System.out.println("Verificacion de Constructota");
        if (verificacionConstructora(constructoraID) == 0) {
            ingresoConstructoras();
        }
    }

    public static int verificacionPropietarios(String idPropi) {
        String mensaje = "El propietario no consta en nuestro sistema";
        int ingreso = 0;
        ArrayList<Propietario> propietarios;
        LecturaArchivoPropietario lecturPropietarios
                = new LecturaArchivoPropietario("propietario.txt");
        lecturPropietarios.establecerListaPropietarios();
        propietarios = lecturPropietarios.obtenerListaPropietarios();
        for (int i = 0; i < propietarios.size(); i++) {
            if (propietarios.get(i).getIdentificacion().equals(idPropi)) {
                mensaje = "El propietario si consta en nuestro sistema";
                ingreso = 1;
            }
        }
        System.out.println(mensaje);
        return ingreso;
    }

    public static int verificacionUbicacion(int numCasa) {
        String mensaje = "Su ubicacion no consta en nuestro sistema";
        ArrayList<Ubicacion> ubicaciones;
        int ingreso = 0;
        LecturaArchivoUbicacion lecturaUbicacion
                = new LecturaArchivoUbicacion("ubicacion.txt");
        lecturaUbicacion.establecerListaUbicacion();
        ubicaciones = lecturaUbicacion.obtenerListaUbicacion();
        for (int i = 0; i < ubicaciones.size(); i++) {
            int numC = ubicaciones.get(i).obtenerNumCasa();
            if (numC == numCasa) {
                mensaje = "Su ubicacion si consta en nuestro sistema";
                ingreso = 1;
            }
        }
        System.out.println(mensaje);
        return ingreso;
    }

    public static int verificacionCiudad(String nombreCiudad) {
        String mensaje = "Su ciudad no consta en nuestro sistema";
        ArrayList<Ciudad> ciudad;
        int ingreso = 0;
        LecturaArchivoCiudad lecturaCity
                = new LecturaArchivoCiudad("ciudad.txt");
        lecturaCity.establecerListaCiudad();
        ciudad = lecturaCity.obtenerListaCiudad();
        for (int i = 0; i < lecturaCity.obtenerListaCiudad().size(); i++) {
            if ((ciudad.get(i).obtenerNombreCiudad().toLowerCase()).equals(nombreCiudad.toLowerCase())) {
                mensaje = "Su ciudad si consta en nuestro sistema";
                ingreso = 1;
            }
        }
        System.out.println(mensaje);
        return ingreso;
    }

    public static int verificacionConstructora(String constructoraID) {
        String mensaje = "Su constructora no consta en nuestro sistema";
        ArrayList<Constructora> constructoras;
        int ingreso = 0;
        LecturaArchivoConstructora lectruaConstructora
                = new LecturaArchivoConstructora("constructora.txt");
        lectruaConstructora.establecerListaConstructora();
        constructoras = lectruaConstructora.obtenerListaConstructora();
        for (int i = 0; i < lectruaConstructora.obtenerListaConstructora().
                size(); i++) {
            if (constructoras.get(i).obtenerIdEmpresarial().equals(constructoraID)) {
                mensaje = "Su constructora si consta en nuestro sistema";
                ingreso = 1;
            }
        }
        System.out.println(mensaje);
        return ingreso;
    }
}
