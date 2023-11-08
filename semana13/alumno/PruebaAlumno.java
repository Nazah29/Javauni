package semana13.alumno;

public class PruebaAlumno {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();

        alumno1.setNombre("Juan Carlos Vera");
        alumno1.setEdad(25);
        alumno1.setPc1(16);

        System.out.printf("%s tiene %d años y su nota de PC1 es: %d",
                alumno1.getNombre(), alumno1.getEdad(), alumno1.getPc1());

        Alumno alumno2 = new Alumno("Ana Ramírez");
        Alumno alumno3 = new Alumno("Pedro Villa", 34);

        Alumno alumno4 = new Alumno("c:\\imagenes\\carla.png",
                "Carla Tello", 25, 16, 18, 14, 15);
                System.out.println("");
        System.out.printf("%s tiene sus imagenes en la ruta %s con %d años de edad con su examen final con nota de %d",
        alumno4.getNombre(), alumno4.getFoto(),alumno4.getEdad(),alumno4.getEf() );

    }
}
