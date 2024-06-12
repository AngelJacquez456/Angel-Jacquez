
import java.util.Scanner;

class Competencia {
    private String sede;
    private String prueba;
    private String rama;
    private String categoria;
    private String etapa;
    private String fecha;
    private String hora;
    private String ganador;
    private String segundoLugar;
    private String tercerLugar;

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }

    public String getPrueba() { return prueba; }
    public void setPrueba(String prueba) { this.prueba = prueba; }

    public String getRama() { return rama; }
    public void setRama(String rama) { this.rama = rama; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getEtapa() { return etapa; }
    public void setEtapa(String etapa) { this.etapa = etapa; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getGanador() { return ganador; }
    public void setGanador(String ganador) { this.ganador = ganador; }

    public String getSegundoLugar() { return segundoLugar; }
    public void setSegundoLugar(String segundoLugar) { this.segundoLugar = segundoLugar; }

    public String getTercerLugar() { return tercerLugar; }
    public void setTercerLugar(String tercerLugar) { this.tercerLugar = tercerLugar; }
}

class Atletismo extends Competencia {
    private String recordMundial;
    private String recordPanamericano;
    private String tiempoGanador;
    private String tiempo2doLugar;
    private String tiempo3erLugar;

    public String getRecordMundial() { return recordMundial; }
    public void setRecordMundial(String recordMundial) { this.recordMundial = recordMundial; }

    public String getRecordPanamericano() { return recordPanamericano; }
    public void setRecordPanamericano(String recordPanamericano) { this.recordPanamericano = recordPanamericano; }

    public String getTiempoGanador() { return tiempoGanador; }
    public void setTiempoGanador(String tiempoGanador) { this.tiempoGanador = tiempoGanador; }

    public String getTiempo2doLugar() { return tiempo2doLugar; }
    public void setTiempo2doLugar(String tiempo2doLugar) { this.tiempo2doLugar = tiempo2doLugar; }

    public String getTiempo3erLugar() { return tiempo3erLugar; }
    public void setTiempo3erLugar(String tiempo3erLugar) { this.tiempo3erLugar = tiempo3erLugar; }
}

class Natacion extends Competencia {
    private String tiempoGanador;
    private String tiempo2doLugar;
    private String tiempo3erLugar;

    public String getTiempoGanador() { return tiempoGanador; }
    public void setTiempoGanador(String tiempoGanador) { this.tiempoGanador = tiempoGanador; }

    public String getTiempo2doLugar() { return tiempo2doLugar; }
    public void setTiempo2doLugar(String tiempo2doLugar) { this.tiempo2doLugar = tiempo2doLugar; }

    public String getTiempo3erLugar() { return tiempo3erLugar; }
    public void setTiempo3erLugar(String tiempo3erLugar) { this.tiempo3erLugar = tiempo3erLugar; }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Pesione *1* para para mostrar la informacion de los ganadores");
        int seleccion = scanner.nextInt();

        Atletismo competenciaAtletismo = new Atletismo();
        competenciaAtletismo.setSede("Estadio Olímpico");
        competenciaAtletismo.setPrueba("1x100 metros");
        competenciaAtletismo.setRama("Femenil");
        competenciaAtletismo.setCategoria("Cualquier categoría");
        competenciaAtletismo.setFecha("11 de junio de 2024");
        competenciaAtletismo.setHora("10:00 AM");
        competenciaAtletismo.setGanador("Estados Unidos");
        competenciaAtletismo.setSegundoLugar("Jamaica");
        competenciaAtletismo.setTercerLugar("Kenya");
        competenciaAtletismo.setRecordMundial("9.58s");
        competenciaAtletismo.setRecordPanamericano("9.84s");
        competenciaAtletismo.setTiempoGanador("9.50s"); // Nuevo récord mundial y panamericano
        competenciaAtletismo.setTiempo2doLugar("9.60s");
        competenciaAtletismo.setTiempo3erLugar("9.70s");


        if (seleccion == 1) {
            System.out.println("\nCompetencia de Atletismo (1x100 femenil):");
            mostrarInformacionCompetencia(competenciaAtletismo);
            System.out.println("Nuevo récord mundial: " + competenciaAtletismo.getTiempoGanador());
            System.out.println("Nuevo récord panamericano: " + competenciaAtletismo.getTiempoGanador());
            System.out.println("Anterior récord mundial: " + competenciaAtletismo.getRecordMundial());
            System.out.println("Anterior récord panamericano: " + competenciaAtletismo.getRecordPanamericano());
            System.out.println("Tiempo del Segundo Lugar: " + competenciaAtletismo.getTiempo2doLugar());
            System.out.println("Tiempo del Tercer Lugar: " + competenciaAtletismo.getTiempo3erLugar());
        } else {
            System.out.println("Selección no válida.");
        }

        scanner.close();
    }

    public static void mostrarInformacionCompetencia(Competencia competencia) {
        System.out.println("Sede: " + competencia.getSede());
        System.out.println("Prueba: " + competencia.getPrueba());
        System.out.println("Rama: " + competencia.getRama());
        System.out.println("Categoría: " + competencia.getCategoria());
        System.out.println("Fecha: " + competencia.getFecha());
        System.out.println("Hora: " + competencia.getHora());
        System.out.println("Ganador: " + competencia.getGanador());
        System.out.println("Segundo Lugar: " + competencia.getSegundoLugar());
        System.out.println("Tercer Lugar: " + competencia.getTercerLugar());

        if (competencia instanceof Atletismo) {
            Atletismo atletismo = (Atletismo) competencia;
            System.out.println("Tiempo del Ganador: " + atletismo.getTiempoGanador());
     
        }
    }
}
