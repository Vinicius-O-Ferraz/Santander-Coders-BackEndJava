/**
* <h1>Calculator</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Vinícius Ferraz
* @version 1.0
* @since   28/04/2024
*/
public class Calculator {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int sum(int numeroUm, int numeroDois) {
        System.out.println(numeroUm + numeroDois);
        return (numeroUm + numeroDois);
    }

    public int subtract(int numeroUm, int numeroDois) {
        System.out.println(numeroUm - numeroDois);
        return (numeroUm - numeroDois);
    }
}
