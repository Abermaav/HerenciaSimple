public class Estudiante extends persona{
    private int nmCarnet;

    public Estudiante(){
        super();
        this.nmCarnet=0;
    }


    public Estudiante(persona per, int nmCarnet) {
        super(per);
        this.nmCarnet = nmCarnet;
    }

    public Estudiante(Estudiante est){
        super(est);
        this.nmCarnet=est.nmCarnet;
    }

    public int getNmCarnet() {
        return nmCarnet;
    }
    public void setNmCarnet(int nmCarnet) {
        this.nmCarnet = nmCarnet;
    }
}
