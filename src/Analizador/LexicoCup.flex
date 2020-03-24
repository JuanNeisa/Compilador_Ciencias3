/*
*Compilador SQL (Simulador) - Ciencias 3 - Universidad Distrital Francisco Jose de Caldas
*Juan David Neisa - Cod: 20161020083
*Juan Camilo Rojas - Cod: 20162020427
*/

package Analizador;
import java_cup.runtime.Symbol;
%%
%class LexicoCup
%public
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( VARCHAR | INTEGER | INT | DATE | TINYINT  | FLOAT | DOUBLE | BOOLEAN ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Sentencia CREATE */
( CREATE ) {return new Symbol(sym.CREATE, yychar, yyline, yytext());}

/* Sentencia INSERT */
( INSERT ) {return new Symbol(sym.INSERT, yychar, yyline, yytext());}

/* Sentencia NOT */
( NOT ) {return new Symbol(sym.NOT, yychar, yyline, yytext());}

/* Sentencia NULL */
( NULL ) {return new Symbol(sym.NULL, yychar, yyline, yytext());}

/* Sentencia INTO */
( INTO ) {return new Symbol(sym.INTO, yychar, yyline, yytext());}

/* Sentencia VALUES */
( VALUES ) {return new Symbol(sym.VALUES, yychar, yyline, yytext());}

/* Sentencia SELECT */
( SELECT ) {return new Symbol(sym.SELECT, yychar, yyline, yytext());}

/* Sentencia DELETE */
( DELETE ) {return new Symbol(sym.DELETE, yychar, yyline, yytext());}

/* Sentencia FROM */
( FROM ) {return new Symbol(sym.FROM, yychar, yyline, yytext());}

/* Sentencia WHERE */
( WHERE ) {return new Symbol(sym.WHERE, yychar, yyline, yytext());}

/* Sentencia USE */
( USE ) {return new Symbol(sym.USE, yychar, yyline, yytext());}

/* Palabras reservadas */
( TABLE | DATABASE ) {return new Symbol(sym.Reservada, yychar, yyline, yytext());}

/* Sentencias llaves primarias y foraneas */
( PRIMARY | FOREING ) {return new Symbol(sym.TIPO_KEY, yychar, yyline, yytext());}

/* Sentencia KEY */
( KEY ) {return new Symbol(sym.KEY, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false | TRUE | FALSE ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Comilla simple */
( "'" ) {return new Symbol(sym.Comilla_s, yychar, yyline, yytext());}

/* Coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Asterisco */
( "*" ) {return new Symbol(sym.Asterisco, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}