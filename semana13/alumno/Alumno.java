package semana13.alumno;
public class Alumno {
    private String foto;
    private String nombre;
    private int edad;
    private int pc1, pc2, pc3, ef;

    // constructor vacío
    public Alumno() {
        pc1 = pc2 = pc3 = ef = -1;
        // System.out.println("Se ha ejecutado el constructor...");
    }

    // constructor parametrizado sobrecargado
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    // constructor parametrizado sobrecargado
    public Alumno (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // constructor parametrizado completo
    public Alumno(String foto, String nombre,
                  int edad, int pc1, int pc2, int pc3, int ef) {
        this.foto = foto;
        this.nombre = nombre;
        this.edad = edad;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.ef = ef;
    }

    // region [Getters & Setters]
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }
    // endregion

    public double obtenerPromedio() {
        return (pc1 + pc2 + pc3 + ef) / 4.0;
    }
}

