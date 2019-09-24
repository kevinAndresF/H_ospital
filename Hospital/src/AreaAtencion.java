package model; 

public class SalasAtencion{
    private int area1;
    private int area2;
    private int area3;
    private int area4;

    public SalasAtencion(int _area1, int _area2, int _area3, int _area4){
        area1 = _area1;
        area2 = _area2;
        area3 = _area3;
        area4 = _area4;

    }
    public void setArea1(int area1){
        this.area1 = area1;
    }
    public void setArea2(int area2){
        this.area2 = area2;
    }
    public void setArea3(int area3){
        this.area3 = area3;
    }
    public void setArea4(int area4){
        this.area4 = area4;
    }
    public int getArea1(){
        return area1;
    }
    public int getArea2(){
        return area2;
    }
    public int getArea3(){
        return area3;
    }
    public int getArea4(){
        return area4;
    }


}

package model;

public class AreaAtencion{
	private String nombre;
	private double cantidadProfesionales;
	private int cantidadPacientes;
	private String rutaImagen;
	private int cantidadCuposDisponibles;
	private int cantidadCuposOfrecidos;
	
	public AreaAtencion(String _nombre, Double cProfesionales, int cPacientes, String ruta, int cuposDisponibles, int cuposOfrecidos){
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
    public void setCantidadProfesionales(Double cantidadProfesionales){
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
    public double getCantidadPacientes(){
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