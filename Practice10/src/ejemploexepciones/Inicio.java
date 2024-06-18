package ejemploexepciones;
public class Inicio {
void lanzaSiNegativo( int parametro ) throws Miexcepcion {
if ( parametro < 0 )
throw new Miexcepcion( "Num negativo" );
}
}


