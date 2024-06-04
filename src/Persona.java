import java.util.Date;

public class Persona {
    private int id, tipoId;
    private  String nombre, apellidos, tipodeSangre,genero;
    private Date nacimiento;
    private double peso, estatura;
//Constantes
    static final int SIN_REGISTRAR=0;
    static final int REGISTRO_CIVIL=1;
    static final int TARJETA_IDENTIDAD=2;
    static final int CEDULA_CIUDADANIA=3;
    static final int PASAPORTE=4;
    static final int CEDULA_EXTRANJERA=5;
    public Persona(){
        this.id=0;
        this.tipoId= 0;
        this.apellidos=" ";
        this.nombre=" ";
        this.genero= " ";
        this.tipodeSangre=" ";
        this.peso= 0.0;
        this.estatura=0.0;
    }
    public Persona(Persona per){
        this.id=per.id;
        this.tipoId= per.tipoId;
        this.apellidos=per.apellidos;
        this.nombre=per.nombre;
        this.genero= per.genero;
        this.tipodeSangre=per.tipodeSangre;
        this.peso= per.peso;
        this.estatura=per.estatura;
        this.nacimiento=per.nacimiento;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoId() {
        return tipoId;
    }
    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipodeSangre() {
        return tipodeSangre;
    }
    public void setTipodeSangre(String tipodeSangre) {
        this.tipodeSangre = tipodeSangre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

}
