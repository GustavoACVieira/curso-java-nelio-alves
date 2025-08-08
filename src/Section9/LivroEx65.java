package src.Section9;

public class LivroEx65 {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean emprestado;

    //construtores
    public LivroEx65() {

    }

    public LivroEx65(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public LivroEx65(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPagina(int paginas) {
        this.paginas = paginas;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    //métodos
    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    @Override
    public String toString() {
        return "Livro: "
                + titulo
                + " - Páginas: "
                + paginas
                + " - Autor: "
                + autor
                + " - Emprestado: "
                + emprestado;
    }
}
