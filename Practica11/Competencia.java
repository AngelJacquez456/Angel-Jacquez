
public abstract class Competencia {
    private String disciplina;
    private String rama;
    private String categoria;

    public Competencia(String disciplina, String rama, String categoria) {
        this.disciplina = disciplina;
        this.rama = rama;
        this.categoria = categoria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public abstract void mostrarDetalles();
}

public class Individual extends Competencia {

    public Individual(String disciplina, String rama, String categoria) {
        super(disciplina, rama, categoria);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Competencia Individual:");
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Rama: " + getRama());
        System.out.println("Categoría: " + getCategoria());
    }
}

public class DeConjunto extends Competencia {
    private int numeroDeParticipantes;

    public DeConjunto(String disciplina, String rama, String categoria, int numeroDeParticipantes) {
        super(disciplina, rama, categoria);
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    public int getNumeroDeParticipantes() {
        return numeroDeParticipantes;
    }

    public void setNumeroDeParticipantes(int numeroDeParticipantes) {
        this.numeroDeParticipantes = numeroDeParticipantes;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Competencia de Conjunto:");
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Rama: " + getRama());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Número de Participantes: " + getNumeroDeParticipantes());
    }
}

// Clase principal para probar las competiciones
public class Main {
    public static void main(String[] args) {
        Competencia gimnasiaIndividual = new Individual("Gimnasia", "Femenina", "Senior");
        gimnasiaIndividual.mostrarDetalles();

        Competencia atletismoConjunto = new DeConjunto("Atletismo", "Masculina", "Junior", 4);
        atletismoConjunto.mostrarDetalles();

        Competencia natacionIndividual = new Individual("Natación", "Mixta", "Juvenil");
        natacionIndividual.mostrarDetalles();
    }
}
