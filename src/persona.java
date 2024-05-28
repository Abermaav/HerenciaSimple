import java.util.Date;

public class persona {
    private int id, tipoId;
    private  String nombre, apellidos, tipodeSangre;
    private Date nacimiento;
    private char genero;
    private double peso, estatura;
//Constantes
    static final int SIN_REGISTRAR=0;
    static final int REGISTRO_CIVIL=1;
    static final int TARJETA_IDENTIDAD=2;
    static final int CEDULA_CIUDADANIA=3;
    static final int PASAPORTE=4;
    static final int CEDULA_EXTRANJERA=5;

    public persona(){
        this.id=0;
        this.tipoId= 0;
        this.apellidos=" ";
        this.nombre=" ";
        this.genero= ' ';
        this.tipodeSangre=" ";
        this.peso= 0.0;
        this.estatura=0.0;
    }

    public persona(persona per){
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
}
