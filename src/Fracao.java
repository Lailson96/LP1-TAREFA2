public class Fracao { // Define uma classe chamada Fracao para representar frações matemáticas.
    private int numerador;   // Declara um campo privado para o numerador da fração.
    private int denominador; // Declara um campo privado para o denominador da fração.

    public Fracao(int numerador, int denominador) { // Construtor da classe Fracao, que recebe um numerador e um denominador como parâmetros.
        if (denominador == 0) { // Verifica se o denominador é zero, o que é inválido para uma fração.
            throw new IllegalArgumentException("Denominador não pode ser zero."); // Lança uma exceção se o denominador for zero.
        }
        this.numerador = numerador; // Atribui o numerador passado ao campo numerador da instância.
        this.denominador = denominador; // Atribui o denominador passado ao campo denominador da instância.
        simplificar(); // Chama o método simplificar para reduzir a fração para sua forma mais simples.
    }

    private void simplificar() { // Método privado para simplificar a fração.
        int gcd = mdc(Math.abs(numerador), Math.abs(denominador)); // Calcula o máximo divisor comum (MDC) entre o numerador e o denominador, usando seus valores absolutos.
        numerador /= gcd; // Divide o numerador pelo MDC para simplificá-lo.
        denominador /= gcd; // Divide o denominador pelo MDC para simplificá-lo.

        if (denominador < 0) { // Verifica se o denominador é negativo.
            numerador = -numerador; // Se o denominador for negativo, inverte o sinal do numerador.
            denominador = -denominador; // Inverte o sinal do denominador para torná-lo positivo.
        }
    }

    private int mdc(int a, int b) { // Método privado para calcular o máximo divisor comum (MDC) usando o algoritmo de Euclides.
        return (b == 0) ? a : mdc(b, a % b); // Se b for 0, retorna a. Caso contrário, continua recursivamente até encontrar o MDC.
    }

    public String exibir() { // Método público que retorna a representação da fração como uma string.
        return numerador + "/" + denominador; // Retorna a representação da fração no formato "numerador/denominador".
    }

    private Fracao operar(Fracao outra, char operador) { // Método privado que realiza a operação aritmética entre duas frações com base no operador fornecido.
        int novoNumerador = 0; // Declara e inicializa o novo numerador.
        int novoDenominador = this.denominador * outra.denominador; // Calcula o novo denominador multiplicando os denominadores das duas frações.

        switch (operador) { // Seleciona a operação com base no operador fornecido.
            case '+': // Caso o operador seja '+', realiza a soma das frações.
                novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador; // Calcula o novo numerador da soma.
                break; // Interrompe o fluxo do switch após a operação ser realizada.
            case '-': // Caso o operador seja '-', realiza a subtração das frações.
                novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador; // Calcula o novo numerador da subtração.
                break; // Interrompe o fluxo do switch após a operação ser realizada.
            case '*': // Caso o operador seja '*', realiza a multiplicação das frações.
                novoNumerador = this.numerador * outra.numerador; // Calcula o novo numerador multiplicando os numeradores.
                novoDenominador = this.denominador * outra.denominador; // Calcula o novo denominador multiplicando os denominadores.
                break; // Interrompe o fluxo do switch após a operação ser realizada.
            case '/': // Caso o operador seja '/', realiza a divisão das frações.
                if (outra.numerador == 0) { // Verifica se o numerador da fração pela qual estamos dividindo é zero.
                    throw new IllegalArgumentException("Não é possível dividir por zero."); // Lança uma exceção se o numerador da outra fração for zero, indicando divisão por zero.
                }
                novoNumerador = this.numerador * outra.denominador; // Calcula o novo numerador multiplicando o numerador da primeira fração pelo denominador da segunda.
                novoDenominador = this.denominador * outra.numerador; // Calcula o novo denominador multiplicando o denominador da primeira fração pelo numerador da segunda.
                break; // Interrompe o fluxo do switch após a operação ser realizada.
        }

        return new Fracao(novoNumerador, novoDenominador); // Retorna uma nova instância de Fracao com os valores calculados.
    }

    public Fracao somar(Fracao outra) { // Método público para somar duas frações.
        return operar(outra, '+'); // Chama o método operar com o operador '+' para realizar a soma.
    }

    public Fracao subtrair(Fracao outra) { // Método público para subtrair duas frações.
        return operar(outra, '-'); // Chama o método operar com o operador '-' para realizar a subtração.
    }

    public Fracao multiplicar(Fracao outra) { // Método público para multiplicar duas frações.
        return operar(outra, '*'); // Chama o método operar com o operador '*' para realizar a multiplicação.
    }

    public Fracao dividir(Fracao outra) { // Método público para dividir duas frações.
        return operar(outra, '/'); // Chama o método operar com o operador '/' para realizar a divisão.
    }

    public static void main(String[] args) { // Método principal para executar testes.
        Fracao f1 = new Fracao(1, 2); // Cria uma nova instância de Fracao com numerador 1 e denominador 2.
        Fracao f2 = new Fracao(3, 4); // Cria uma nova instância de Fracao com numerador 3 e denominador 4.

        System.out.println("Soma: " + f1.somar(f2).exibir()); // Soma f1 e f2, e imprime o resultado usando o método exibir().
        System.out.println("Subtração: " + f1.subtrair(f2).exibir()); // Subtrai f2 de f1, e imprime o resultado usando o método exibir().
        System.out.println("Multiplicação: " + f1.multiplicar(f2).exibir()); // Multiplica f1 e f2, e imprime o resultado usando o método exibir().
        System.out.println("Divisão: " + f1.dividir(f2).exibir()); // Divide f1 por f2, e imprime o resultado usando o método exibir().
    }
}
