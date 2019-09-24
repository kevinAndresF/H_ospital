package model;

public class AreaAtencion{
	private String nombre;
	private double cantidadPromedioProfesionales;
	private int cantidadTotalProfesionales;
	private int cantidadCuposlibres;
	private int cantidadCuposOfrecidos;
    private int cantidadPacientes;
    private double porcentajeOcupacionSala;
	
	public AreaAtencion(String _nombre, Double _cantidadPromedioProfesionales, int _cantidadTotalProfesionales , int _cantidadCuposlibres, int _cantidadcuposofrecidos, int _cantidadPacientes, double _porcentajeOcupacionSala ){
		nombre = _nombre;
        cantidadPromedioProfesionales= _cantidadPromedioProfesionales;
        cantidadTotalProfesionales = _cantidadTotalProfesionales;
        cantidadCuposlibres = _cantidadCuposlibres;
        cantidadCuposOfrecidos = _cantidadcuposofrecidos;
        cantidadPacientes = _cantidadPacientes;
        porcentajeOcupacion = _porcentajeOcupacionSala;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setcantidadPromedioProfesionales(Double _cantidadPromedioProfesionales){
        this.cantidadPromedioProfesionales = _cantidadPromedioProfesionales;
    }
    public void setcantidadTotalProfesionales(int _cantidadTotalProfesionales){
        this.cantidadTotalProfesionales = _cantidadTotalProfesionales;
    }
    public void setCantidadCuposLibres(String _cantidadCUposLibres){
        this.cantidadCuposlibres = _cantidadCuposlibres;
    }
    public void setcantidadCuposOfrecidos(String _cantidadCuposOfrecidos){
        this.cantidadCuposOfrecidos = _cantidadCuposOfrecidos;
    }
    public void setcantidadPacientes(String cantidadPacientes){
        this.cantidadPacientes = _cantidadPacientes;
    }
    public String getNombre(){
        return nombre;
    }
    public int getcantidadPromedioProfesionales(){
        return cantidadPromedioProfesionales;
    }
    public double getcantidadTotalProfesionales(){
        return cantidadTotalProfesionales;
    }
    public String getCantidadCuposLibres(){
        return cantidadCuposlibres;
    }
    public int getcantidadCuposOfrecidos(){
        return cantidadCuposOfrecidos;
    }
    public int getcantidadPacientes(){
        return porcentajeOcupacion;
    }

	
}