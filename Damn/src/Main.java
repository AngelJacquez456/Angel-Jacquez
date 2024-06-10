
public class Main {
    public static void main(String[] args) {

        Atletismo competenciaAtletismo = new Atletismo();
        competenciaAtletismo.setSede("Estadio Olímpico");
        competenciaAtletismo.setPrueba("100 metros lisos");
        competenciaAtletismo.setRama("Masculino");
        competenciaAtletismo.setCategoria("Senior");
        competenciaAtletismo.setEtapa("Final");
        competenciaAtletismo.setFecha("10 de junio de 2024");
        competenciaAtletismo.setHora("18:00");
        competenciaAtletismo.setGanador("Usain Bolt");
        competenciaAtletismo.setSegundoLugar("Justin Gatlin");
        competenciaAtletismo.setTercerLugar("Trayvon Bromell");
        competenciaAtletismo.setTiempoGanador("9.81 segundos");

 
        Natacion competenciaNatacion = new Natacion();
        competenciaNatacion.setSede("Piscina Olímpica");
        competenciaNatacion.setPrueba("200 metros libres");
        competenciaNatacion.setRama("Femenino");
        competenciaNatacion.setCategoria("Juvenil");
        competenciaNatacion.setEtapa("Preliminar");
        competenciaNatacion.setFecha("11 de junio de 2024");
        competenciaNatacion.setHora("10:00");
        competenciaNatacion.setGanador("Katie Ledecky");
        competenciaNatacion.setSegundoLugar("Ariarne Titmus");
        competenciaNatacion.setTercerLugar("Siobhan Haughey");
        competenciaNatacion.setTiempoGanador("1:54.40");

        // Mostrar información de las competencias
        System.out.println("Competencia de Atletismo:");
        mostrarInformacionCompetencia(competenciaAtletismo);

        System.out.println("\nCompetencia de Natación:");
        mostrarInformacionCompetencia(competenciaNatacion);
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
        }
        else if (competencia instanceof Natacion) {
            Natacion natacion = (Natacion) competencia;
            System.out.println("Tiempo del Ganador: " + natacion.getTiempoGanador());
        }
    }
    
} 
