import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner (System.in);

        System.out.println("Seleccione el tipo de competencia a mostrar:");
        System.out.println("1. Competencia Individual");
        System.out.println("2. Competencia De Conjunto");
        int seleccion = scanner.nextInt();

        CompetenciaIndividual competenciaIndividual = new CompetenciaIndividual("Simone Biles");
        competenciaIndividual.setSede("Gimnasio Nacional");
        competenciaIndividual.setPrueba("Gimnasia Artística");
        competenciaIndividual.setRama("Femenino");
        competenciaIndividual.setCategoria("Senior");
        competenciaIndividual.setFecha("12 de junio de 2024");
        competenciaIndividual.setHora("16:00");
        competenciaIndividual.setGanador("Simone Biles");

        CompetenciaDeConjunto competenciaDeConjunto = new CompetenciaDeConjunto("Los Tigres");
        competenciaDeConjunto.setSede("Estadio Nacional");
        competenciaDeConjunto.setPrueba("Fútbol");
        competenciaDeConjunto.setRama("Masculina");
        competenciaDeConjunto.setCategoria("Liga");
        competenciaDeConjunto.setFecha("14 de junio de 2024");
        competenciaDeConjunto.setHora("16:00");
        competenciaDeConjunto.setGanador("Los Tigres");

        if (seleccion == 1) {
            System.out.println("\nCompetencia Individual:");
            System.out.println("Sede: " + competenciaIndividual.getSede());
            System.out.println("Prueba: " + competenciaIndividual.getPrueba());
            System.out.println("Rama: " + competenciaIndividual.getRama());
            System.out.println("Categoría: " + competenciaIndividual.getCategoria());
            System.out.println("Fecha: " + competenciaIndividual.getFecha());
            System.out.println("Hora: " + competenciaIndividual.getHora());
            System.out.println("Ganador: " + competenciaIndividual.getGanador());
            System.out.println("Nombre del Atleta: " + competenciaIndividual.getNombreAtleta());
         
        } else if (seleccion == 2) {
            System.out.println("\nCompetencia De Conjunto:");
            System.out.println("Sede: " + competenciaDeConjunto.getSede());
            System.out.println("Prueba: " + competenciaDeConjunto.getPrueba());
            System.out.println("Rama: " + competenciaDeConjunto.getRama());
            System.out.println("Categoría: " + competenciaDeConjunto.getCategoria());
            System.out.println("Fecha: " + competenciaDeConjunto.getFecha());
            System.out.println("Hora: " + competenciaDeConjunto.getHora());
            System.out.println("Ganador: " + competenciaDeConjunto.getGanador());
            System.out.println("Nombre del Equipo: " + competenciaDeConjunto.getNombreEquipo());
           
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
        System.out.println("Etapa: " + competencia.getEtapa());
        System.out.println("Fecha: " + competencia.getFecha());
        System.out.println("Hora: " + competencia.getHora());
        System.out.println("Ganador: " + competencia.getGanador());
        System.out.println("Segundo Lugar: " + competencia.getSegundoLugar());
        System.out.println("Tercer Lugar: " + competencia.getTercerLugar());

        if (competencia instanceof Atletismo) {
            Atletismo atletismo = (Atletismo) competencia;
            System.out.println("Tiempo del Ganador: " + atletismo.getTiempoGanador());
        } else if (competencia instanceof Natacion) {
            Natacion natacion = (Natacion) competencia;
            System.out.println("Tiempo del Ganador: " + natacion.getTiempoGanador());
        }
    }
}