package model;

public class AreaAtencion{
	private String nombre;
	private int cantidadProfesionales;
	private int cantidadPacientes;
	private String rutaImagen;
	private int cantidadCuposDisponibles;
	private int cantidadCuposOfrecidos;
	
	public AreaAtencion(String _nombre, int cProfesionales, int cPacientes, String ruta, int cuposDisponibles, int cuposOfrecidos){
		nombre = _nombre;
        cantidadProfesionales=cProfesionales;
        cantidadPacientes = cPacientes;
        rutaImagen = ruta;
        cantidadCuposDisponibles = cuposDisponibles;
        cantidadCuposOfrecidos =cuposOfrecidos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCantidadProfesionales(int cantidadProfesionales){
        this.cantidadProfesionales = cantidadProfesionales;
    }
    public void setCantidadPacientes(int cantidadPacientes){
        this.cantidadPacientes = cantidadPacientes;
    }
    public void setRutaImagen(String rutaImagen){
        this.rutaImagen = rutaImagen;
    }
    public void setCuporDisponibles(String cuposDisponibles){
        this.cantidadCuposDisponibles = cuposDisponibles;
    }
    public void setCuposOfrecidos(String cuposOfrecidos){
        this.cantidadCuposOfrecidos = cuposOfrecidos;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidadProfesionales(){
        return cantidadCuposDisponibles;
    }
    public int getCantidadPacientes(){
        return cantidadPacientes;
    }
    public String getRutaImagen(){
        return rutaImagen;
    }
    public int getCuposDisponibles(){
        return cuposDisponibles;
    }
    public int getCuposOfrecidos(){
        return cuposOfrecidos;
    }

	
}
