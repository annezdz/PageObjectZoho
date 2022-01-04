package ooppt1;

public class Overload {

    /*
    Sobre Overloading
    * normalmente a sobrecarga acontece dentro de uma única classe, mas um método também pode
      ser tratado como sobrecarregado na subclasse dessa classe.
      * Isso porque uma subclasse herda uma versão do método da classe pai e, em seguida, a
      * subclasse pode ter outra versão sobrecarregada desse método.
      * Para ser sobrecarregado deve obedecer essas regras :
      * os métodos devem ter o mesmo nome de método e os métodos devem ter parâmetros diferentes.
    * */

    /**
     * Sobre Overriding
     * significa definir um método no filho ou
     * em uma classe filha que já existe na
     * classe pai com o mesmo assinatura
     *outras palavras, o mesmo nome e os mesmos argumentos,
     * ao estender a classe pai, a
     * classe filha obtém todos os
     * métodos definidos na classe pai e esses
     * métodos são conhecidos como métodos derivados.
     * A substituição de método também é conhecida
     * como polymrphism e Dynamic Merhod Dispatch porque o método que será chamado é decidido em tempo
     * de execução pela JVM.
     * Quando substituímos um método, é recomendado colocar uma anotação acima do método @Override
     * e o compilador irá ler essa anotação e irá nos mostrar um erro se nós não seguirmos
     * as regras de substituição corretamente para esse método, então não podemos
     * substituir métodos estáticos, apenas métodos de instância podem ser substituídos.
     * Regras para Overriden :
     * - o mesmo nome e os mesmos argumentos
     * - o tipo de retorno deve ser uma subclasse do tipo de retorno na classe Pai
     * - não pode ter um modificador de acesso inferior, então, por exemplo, se o
     * método pai é protected, o uso de private no filho não é permitido,
     * no entanto, o uso de public no filho seria permitido neste exemplo.
     *
     * Pontos importantes:
     * apenas os métodos herdados
     * podem ser substituídos em outras palavras, os
     * métodos podem ser sobrescrito
     * somente em construtores de classes filhas.
     * COnstrutores e métodos privados não podem ser sobrescritos
     *
     * Métodos que são final não podem ser sobrescritos
     * **/
}
