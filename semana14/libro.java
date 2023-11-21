package semana14;

public class libro {
    String titulolibro;
    String autor;
    String aniospublicacion;
    int numeropaginas;
    
    // region [Getters & Setters]
    public String getTitulolibro() {
        return titulolibro;
    }
    public void setTitulolibro(String titulolibro) {
        this.titulolibro = titulolibro;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAniospublicacion() {
        return aniospublicacion;
    }
    public void setAniospublicacion(String aniospublicacion) {
        this.aniospublicacion = aniospublicacion;
    }
    public int getNumeropaginas() {
        return numeropaginas;
    }
    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }
    //endregion
   
    public libro(String titulolibro, String autor, String aniospublicacion, int numeropaginas) {
        this.titulolibro = titulolibro;
        this.autor = autor;
        this.aniospublicacion = aniospublicacion;
        this.numeropaginas = numeropaginas;
    }
    @Override
    public String toString(){
    return String.format(" EL titulo del libro es \"%s\" su autor es \"%s\"  se publico el año  %s y tiene %d paginas" , 
    titulolibro, autor , aniospublicacion,numeropaginas);
    }
}

