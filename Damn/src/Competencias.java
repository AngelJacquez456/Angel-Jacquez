import java.util.ArrayList;


class Competencia {
    private String sede;
    private String prueba;
    private String rama;
    private String categoria;
    private String etapa;
    private String fecha;
    private String hora;
    private String recordMundial;
    private String recordPanamericano;
    private String ganador;
    private String segundoLugar;
    private String tercerLugar;
    private String observaciones;

 
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
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

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getRecordMundial() {
        return recordMundial;
    }

    public void setRecordMundial(String recordMundial) {
        this.recordMundial = recordMundial;
    }

    public String getRecordPanamericano() {
        return recordPanamericano;
    }

    public void setRecordPanamericano(String recordPanamericano) {
        this.recordPanamericano = recordPanamericano;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getSegundoLugar() {
        return segundoLugar;
    }

    public void setSegundoLugar(String segundoLugar) {
        this.segundoLugar = segundoLugar;
    }

    public String getTercerLugar() {
        return tercerLugar;
    }

    public void setTercerLugar(String tercerLugar) {
        this.tercerLugar = tercerLugar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}


class Atletismo extends Competencia {
    private String juezArbitro;
    private String juezArbitroSalida;
    private String juezLlegada;
    private ArrayList<String> juecesAuxiliares;
    private ArrayList<String> cronometrores;
    private int hits;
    private String tiempoGanador;
    private String tiempo2doLugar;
    private String tiempo3erLugar;

    public String getJuezArbitro() {
        return juezArbitro;
    }

    public void setJuezArbitro(String juezArbitro) {
        this.juezArbitro = juezArbitro;
    }

    public String getJuezArbitroSalida() {
        return juezArbitroSalida;
    }

    public void setJuezArbitroSalida(String juezArbitroSalida) {
        this.juezArbitroSalida = juezArbitroSalida;
    }

    public String getJuezLlegada() {
        return juezLlegada;
    }

    public void setJuezLlegada(String juezLlegada) {
        this.juezLlegada = juezLlegada;
    }

    public ArrayList<String> getJuecesAuxiliares() {
        return juecesAuxiliares;
    }

    public void setJuecesAuxiliares(ArrayList<String> juecesAuxiliares) {
        this.juecesAuxiliares = juecesAuxiliares;
    }

    public ArrayList<String> getCronometrores() {
        return cronometrores;
    }

    public void setCronometrores(ArrayList<String> cronometrores) {
        this.cronometrores = cronometrores;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getTiempoGanador() {
        return tiempoGanador;
    }

    public void setTiempoGanador(String tiempoGanador) {
        this.tiempoGanador = tiempoGanador;
    }

    public String getTiempo2doLugar() {
        return tiempo2doLugar;
    }

    public void setTiempo2doLugar(String tiempo2doLugar) {
        this.tiempo2doLugar = tiempo2doLugar;
    }

    public String getTiempo3erLugar() {
        return tiempo3erLugar;
    }

    public void setTiempo3erLugar(String tiempo3erLugar) {
        this.tiempo3erLugar = tiempo3erLugar;
    }
}


class Natacion extends Competencia {
    private String oficialMayor;
    private String juezSalida;
    private String juezNado;
    private String inspectorVueltas;
    private int hits;
    private String tiempoGanador;
    private String tiempo2doLugar;
    private String tiempo3erLugar;

   
    public String getOficialMayor() {
        return oficialMayor;
    }

    public void setOficialMayor(String oficialMayor) {
        this.oficialMayor = oficialMayor;
    }

    public String getJuezSalida() {
        return juezSalida;
    }

    public void setJuezSalida(String juezSalida) {
        this.juezSalida = juezSalida;
    }

    public String getJuezNado() {
        return juezNado;
    }

    public void setJuezNado(String juezNado) {
        this.juezNado = juezNado;
    }

    public String getInspectorVueltas() {
        return inspectorVueltas;
    }

    public void setInspectorVueltas(String inspectorVueltas) {
        this.inspectorVueltas = inspectorVueltas;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getTiempoGanador() {
        return tiempoGanador;
    }

    public void setTiempoGanador(String tiempoGanador) {
        this.tiempoGanador = tiempoGanador;
    }

    public String getTiempo2doLugar() {
        return tiempo2doLugar;
    }

    public void setTiempo2doLugar(String tiempo2doLugar) {
        this.tiempo2doLugar = tiempo2doLugar;
    }

    public String getTiempo3erLugar() {
        return tiempo3erLugar;
    }

    public void setTiempo3erLugar(String tiempo3erLugar) {
        this.tiempo3erLugar = tiempo3erLugar;
    }
}
