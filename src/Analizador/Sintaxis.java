
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Mar 23 17:11:02 COT 2020
//----------------------------------------------------

package Analizador;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Mar 23 17:11:02 COT 2020
  */
public class Sintaxis extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintaxis() {super();}

  /** Constructor which sets the default scanner. */
  public Sintaxis(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintaxis(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\051\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\002\003\000\002\002\003\000\002\005\006" +
    "\000\002\005\007\000\002\005\005\000\002\005\006\000" +
    "\002\005\011\000\002\005\012\000\002\004\003\000\002" +
    "\004\005\000\002\003\006\000\002\003\010\000\002\003" +
    "\006\000\002\003\004\000\002\003\005\000\002\003\011" +
    "\000\002\003\010\000\002\003\007\000\002\003\007\000" +
    "\002\006\012\000\002\006\013\000\002\007\003\000\002" +
    "\007\005\000\002\010\003\000\002\010\005\000\002\010" +
    "\003\000\002\011\013\000\002\011\014\000\002\011\015" +
    "\000\002\011\016\000\002\011\007\000\002\011\010\000" +
    "\002\012\003\000\002\012\005\000\002\013\012\000\002" +
    "\013\013\000\002\013\014\000\002\013\015" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\137\000\014\007\004\010\010\033\015\036\014\042" +
    "\012\001\002\000\004\011\102\001\002\000\004\002\ufffd" +
    "\001\002\000\004\002\uffff\001\002\000\004\002\101\001" +
    "\002\000\004\012\076\001\002\000\004\002\000\001\002" +
    "\000\004\037\061\001\002\000\004\002\ufffe\001\002\000" +
    "\004\012\037\001\002\000\004\034\016\001\002\000\004" +
    "\012\017\001\002\000\004\035\020\001\002\000\004\020" +
    "\021\001\002\000\010\005\025\017\024\030\022\001\002" +
    "\000\006\021\uffe7\027\uffe7\001\002\000\004\021\033\001" +
    "\002\000\006\021\uffe5\027\uffe5\001\002\000\004\012\031" +
    "\001\002\000\006\021\uffe9\027\027\001\002\000\010\005" +
    "\025\017\024\030\022\001\002\000\004\021\uffe8\001\002" +
    "\000\004\005\032\001\002\000\006\021\uffe6\027\uffe6\001" +
    "\002\000\004\026\034\001\002\000\016\002\uffeb\007\004" +
    "\010\010\033\015\036\014\042\012\001\002\000\004\002" +
    "\uffea\001\002\000\004\037\042\001\002\000\006\027\040" +
    "\037\uffde\001\002\000\004\012\037\001\002\000\004\037" +
    "\uffdd\001\002\000\004\012\043\001\002\000\006\026\044" +
    "\040\045\001\002\000\016\002\uffe0\007\004\010\010\033" +
    "\015\036\014\042\012\001\002\000\004\012\046\001\002" +
    "\000\004\041\047\001\002\000\006\005\051\030\050\001" +
    "\002\000\004\026\056\001\002\000\004\012\052\001\002" +
    "\000\004\005\053\001\002\000\004\026\054\001\002\000" +
    "\016\002\uffe2\007\004\010\010\033\015\036\014\042\012" +
    "\001\002\000\004\002\uffe1\001\002\000\016\002\uffe4\007" +
    "\004\010\010\033\015\036\014\042\012\001\002\000\004" +
    "\002\uffe3\001\002\000\004\002\uffdf\001\002\000\004\012" +
    "\062\001\002\000\004\040\063\001\002\000\004\012\064" +
    "\001\002\000\004\041\065\001\002\000\006\005\067\030" +
    "\066\001\002\000\004\026\074\001\002\000\004\012\070" +
    "\001\002\000\004\005\071\001\002\000\004\026\072\001" +
    "\002\000\016\002\uffda\007\004\010\010\033\015\036\014" +
    "\042\012\001\002\000\004\002\uffd9\001\002\000\016\002" +
    "\uffdc\007\004\010\010\033\015\036\014\042\012\001\002" +
    "\000\004\002\uffdb\001\002\000\004\026\077\001\002\000" +
    "\016\002\ufffa\007\004\010\010\033\015\036\014\042\012" +
    "\001\002\000\004\002\ufff9\001\002\000\004\002\001\001" +
    "\002\000\004\012\103\001\002\000\006\020\104\026\105" +
    "\001\002\000\006\012\112\013\107\001\002\000\016\002" +
    "\ufffc\007\004\010\010\033\015\036\014\042\012\001\002" +
    "\000\004\002\ufffb\001\002\000\004\014\136\001\002\000" +
    "\004\021\133\001\002\000\006\021\ufff6\027\131\001\002" +
    "\000\004\006\113\001\002\000\016\013\114\020\115\021" +
    "\ufff1\027\ufff1\043\116\044\117\001\002\000\004\014\130" +
    "\001\002\000\004\030\123\001\002\000\004\044\120\001" +
    "\002\000\006\021\ufff0\027\ufff0\001\002\000\010\013\121" +
    "\021\ufff2\027\ufff2\001\002\000\004\014\122\001\002\000" +
    "\006\021\ufff3\027\ufff3\001\002\000\004\021\124\001\002" +
    "\000\012\021\uffed\027\uffed\043\125\044\126\001\002\000" +
    "\004\044\127\001\002\000\006\021\uffee\027\uffee\001\002" +
    "\000\006\021\uffef\027\uffef\001\002\000\006\021\ufff4\027" +
    "\ufff4\001\002\000\006\012\112\013\107\001\002\000\004" +
    "\021\ufff5\001\002\000\004\026\134\001\002\000\016\002" +
    "\ufff8\007\004\010\010\033\015\036\014\042\012\001\002" +
    "\000\004\002\ufff7\001\002\000\004\020\137\001\002\000" +
    "\004\012\140\001\002\000\004\021\141\001\002\000\006" +
    "\021\uffec\027\uffec\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\137\000\014\002\006\005\010\006\005\011\012\013" +
    "\004\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\035" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\007\022\010\025\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\007\027\010\025" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\002\034\005\010\006\005" +
    "\011\012\013\004\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\040\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\002" +
    "\057\005\010\006\005\011\012\013\004\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\002\054\005\010\006\005\011\012\013\004\001" +
    "\001\000\002\001\001\000\014\002\056\005\010\006\005" +
    "\011\012\013\004\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\002\072\005\010\006\005\011\012\013\004\001\001\000" +
    "\002\001\001\000\014\002\074\005\010\006\005\011\012" +
    "\013\004\001\001\000\002\001\001\000\002\001\001\000" +
    "\014\002\077\005\010\006\005\011\012\013\004\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\003\110\004\107\001\001\000\014" +
    "\002\105\005\010\006\005\011\012\013\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\003" +
    "\110\004\131\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\002\134\005\010\006\005\011\012\013\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintaxis$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintaxis$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintaxis$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintaxis$actions {
  private final Sintaxis parser;

  /** Constructor */
  CUP$Sintaxis$actions(Sintaxis parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintaxis$do_action(
    int                        CUP$Sintaxis$act_num,
    java_cup.runtime.lr_parser CUP$Sintaxis$parser,
    java.util.Stack            CUP$Sintaxis$stack,
    int                        CUP$Sintaxis$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintaxis$result;

      /* select the action based on the action number */
      switch (CUP$Sintaxis$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // ELIMINAR ::= DELETE FROM Identificador WHERE Identificador Igual Comilla_s Identificador Comilla_s P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("ELIMINAR",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-10)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // ELIMINAR ::= DELETE FROM Identificador WHERE Identificador Igual Comilla_s Identificador Comilla_s P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("ELIMINAR",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-9)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // ELIMINAR ::= DELETE FROM Identificador WHERE Identificador Igual Numero P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("ELIMINAR",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-8)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // ELIMINAR ::= DELETE FROM Identificador WHERE Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("ELIMINAR",9, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-7)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // IDENTIFICADORES ::= Identificador Coma IDENTIFICADORES 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("IDENTIFICADORES",8, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // IDENTIFICADORES ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("IDENTIFICADORES",8, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SELECCIONAR ::= SELECT IDENTIFICADORES FROM Identificador P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SELECCIONAR",7, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SELECCIONAR ::= SELECT IDENTIFICADORES FROM Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SELECCIONAR",7, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SELECCIONAR ::= SELECT IDENTIFICADORES FROM Identificador WHERE Identificador Igual Comilla_s Identificador Comilla_s P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SELECCIONAR",7, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-11)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SELECCIONAR ::= SELECT IDENTIFICADORES FROM Identificador WHERE Identificador Igual Comilla_s Identificador Comilla_s P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SELECCIONAR",7, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-10)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SELECCIONAR ::= SELECT IDENTIFICADORES FROM Identificador WHERE Identificador Igual Numero P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SELECCIONAR",7, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-9)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // SELECCIONAR ::= SELECT IDENTIFICADORES FROM Identificador WHERE Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SELECCIONAR",7, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-8)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // S_VALORES ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("S_VALORES",6, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // S_VALORES ::= Comilla_s Identificador Comilla_s 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("S_VALORES",6, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // S_VALORES ::= Numero 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("S_VALORES",6, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // VALORES ::= S_VALORES Coma VALORES 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("VALORES",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // VALORES ::= S_VALORES 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("VALORES",5, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // INSERTAR ::= INSERT INTO Identificador VALUES Parentesis_a VALORES Parentesis_c P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INSERTAR",4, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-8)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // INSERTAR ::= INSERT INTO Identificador VALUES Parentesis_a VALORES Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INSERTAR",4, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-7)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SENTENCIA ::= TIPO_KEY KEY Parentesis_a Identificador Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SENTENCIA ::= Identificador T_dato Parentesis_a Numero Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SENTENCIA ::= Identificador T_dato Parentesis_a Numero Parentesis_c NULL 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // SENTENCIA ::= Identificador T_dato Parentesis_a Numero Parentesis_c NOT NULL 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // SENTENCIA ::= Identificador T_dato NULL 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // SENTENCIA ::= Identificador T_dato 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // SENTENCIA ::= Identificador T_dato NOT NULL 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA ::= Identificador T_dato NOT NULL TIPO_KEY KEY 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-5)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= Identificador T_dato TIPO_KEY KEY 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DATOS_TABLA ::= SENTENCIA Coma DATOS_TABLA 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DATOS_TABLA",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DATOS_TABLA ::= SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("DATOS_TABLA",2, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CREAR ::= CREATE Reservada Identificador Parentesis_a DATOS_TABLA Parentesis_c P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("CREAR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-7)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CREAR ::= CREATE Reservada Identificador Parentesis_a DATOS_TABLA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("CREAR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-6)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CREAR ::= USE Identificador P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("CREAR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CREAR ::= USE Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("CREAR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-2)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CREAR ::= CREATE Reservada Identificador P_coma INICIO 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("CREAR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-4)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CREAR ::= CREATE Reservada Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("CREAR",3, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-3)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INICIO ::= ELIMINAR 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= SELECCIONAR 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= INSERTAR 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= CREAR 
            {
              Object RESULT =null;

              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          return CUP$Sintaxis$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)).value;
		RESULT = start_val;
              CUP$Sintaxis$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.elementAt(CUP$Sintaxis$top-1)), ((java_cup.runtime.Symbol)CUP$Sintaxis$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintaxis$parser.done_parsing();
          return CUP$Sintaxis$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

