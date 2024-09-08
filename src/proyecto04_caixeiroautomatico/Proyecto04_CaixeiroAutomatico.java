/*
EXERCICIO
Implementa en JAVA empregando POO e a librería javax.swing unha aplicación que 
simule un caixeiro automático dun banco.
Todas as entradas e visualizacións de datos deberán pedirse e/ou amosarse por
fiestras (salvo a creación do cliente e a conta bancaria).
As funcionalidades que se piden serán as habituais dun caixeiro automático real.
En particular:
	1. Consultar información da conta (Nª de conta, nome e dni do titular e saldo
	   da conta).
	2. Consulta de saldo da conta.
	3. Ingresar fondos/cartos/diñeiro.
		a) Prohibido cantidades negativas, cero ou que non sexan múltiplos de 10.
		b) Tampouco se permite tipos erróneos (morralla NON!) --> Vólvese pedir.
	4. Retirar fondos/cartos/diñeiros.
		a) Controlar as posibles retiradas --> Que sexan correctas (non a
	 	   negativos, cero, os distintos de múltiplos de 10, máis do que hai na
		   conta ou máis do limite: todo iso NO).
		b) Quero poder facer retiradas "rápidas". En concreto: 50,100,200,500.
	5. Quero consultar os últimos 10 movementos (nos movementos entran calquer
	   operación realizada dende o punto 1 ata o 5 incluído).
	   O rexistro de todos os movementos gardarase completo nun ficheiro de texto.
	6. SAÍR.

*/

package proyecto04_caixeiroautomatico;

import java.io.IOException;

public class Proyecto04_CaixeiroAutomatico {

    final static int max_movimientos = 10;
    
    public static void main(String[] args) throws IOException {
        
        
        Cliente cli = new Cliente("Jorge","Sobradelo Prol","78810081Q");
        ContaBancaria cuenta1 = new ContaBancaria(cli,123456789,45000.00,max_movimientos);
        
        //Despois de crear o cliente e construir unha conta bancaria con ese cliente 
        //leemos do ficheiro os ultimos movementos se tuvera.
        
        
        
        Vp Vp1 = new Vp(cuenta1);
        Vp1.setVisible(true);
        Vp1.setTitle("CAIXEIRO AUTOMÁTICO");
        
        

        

        
        
        
    }

   

}
