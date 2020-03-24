
/*
*Compilador SQL (Simulador) - Ciencias 3 - Universidad Distrital Francisco Jose de Caldas
*Juan David Neisa - Cod: 20161020083
*Juan Camilo Rojas - Cod: 20162020427
*/

package Analizador;
import java_cup.runtime.Symbol;
import static Analizador.Tokens.*;
%%
%class Lexer
%public
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
%{
    public String lexeme;
%}
%%

/* Palabras reservadas con formato DDL (Lenguaje de Definicion de Datos) */
CREATE |
ALTER |
DROP |
TRUNCATE {lexeme=yytext(); return DDL;}

/* Palabras reservadas con formato DML (Lenguaje de Manipulacion de Datos) */
SELECT |
INSERT |
UPDATE |
DELETE |
COMMIT |
ROLLBACK {lexeme=yytext(); return DML;}

/* Palabras reservadas con formato DML (Lenguaje de Control de Datos) */
GRANT |
REVOKE {lexeme=yytext(); return DCL;}

/* Palabras reservadas Del lenguaje SQL */
TABLE |
DATABASE |
NULL |
NOT |
UNIQUE |
PRIMARY |
FOREIGN |
KEY |
CONSTRAINT |
CHECK |
DEFAULT |
REFERENCES |
INDEX |
INTO |
USE |
VALUES |
FROM |
ORDER BY |
WHERE {lexeme=yytext(); return Reservada;}

{espacio} {/*Ignore*/}

"//".* {/*Ignore*/}

/* Punto y coma (;) */
";" {return PuntoComa;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Comillas simples*/
( "\'" ) {lexeme=yytext(); return Comillas_S;}

/* Tipos de datos numericos*/
( VARCHAR | INT | DATE | TINYINT  | FLOAT | DOUBLE | BOOLEAN ) {lexeme=yytext(); return TipoDato;}

/* Coma (,) */
"," {return Coma;}

/* Parentesis () (;) */
"(" {return ParentesisAbierto;}
")" {return ParentesisCerrado;}

/* Corchete {} */
"{" {return CorcheteAbierto;}
"}" {return CorcheteCerrado;}

/* Definicion de palabras y numeros */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

 . {return ERROR;}