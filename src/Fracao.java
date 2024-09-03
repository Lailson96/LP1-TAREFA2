public class Fracao { // Define uma classe chamada Fracao para representar frações matemáticas.
    private int numerador;   // Declara um campo privado para o numerador da fração.
    private int denominador; // Declara um campo privado para o denominador da fração.

    public Fracao(int numerador, int denominador) { // Construtor da classe Fracao, recebe um numerador e um denominador como parâmetros.
        if (denominador == 0) { // Verifica se o denominador é zero, o que é inválido em frações.
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

        // Garante que o denominador seja positivo
        if (denominador < 0) { // Verifica se o denominador é negativo.
            numerador = -numerador; // Se o denominador for negativo, inverte o sinal do numerador.
            denominador = -denominador; // Inverte o sinal do denominador para torná-lo positivo.
        }
    }

    private int mdc(int a, int b) { // Método privado para calcular o máximo divisor comum (MDC) usando o algoritmo de Euclides.
        while (b != 0) { // Enquanto o segundo número (b) não for zero...
            int temp = b; // Armazena o valor de b em uma variável temporária.
            b = a % b; // Calcula o resto da divisão de a por b e o atribui a b.
            a = temp; // Atribui o valor original de b a a.
        }
        return a; // Retorna o valor de a, que agora é o MDC.
    }

    @Override
    public String toString() { // Método sobrescrito da classe Object para converter a fração em uma String.
        return numerador + "/" + denominador; // Retorna a representação da fração como "numerador/denominador".
    }

    public Fracao somar(Fracao outra) { // Método público para somar duas frações.
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador; // Calcula o novo numerador da fração resultante.
        int novoDenominador = this.denominador * outra.denominador; // Calcula o novo denominador da fração resultante.
        return new Fracao(novoNumerador, novoDenominador); // Retorna uma nova instância de Fracao com os valores calculados.
    }

    public Fracao subtrair(Fracao outra) { // Método público para subtrair duas frações.
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador; // Calcula o novo numerador da fração resultante da subtração.
        int novoDenominador = this.denominador * outra.denominador; // Calcula o novo denominador da fração resultante.
        return new Fracao(novoNumerador, novoDenominador); // Retorna uma nova instância de Fracao com os valores calculados.
    }

    public Fracao multiplicar(Fracao outra) { // Método público para multiplicar duas frações.
        int novoNumerador = this.numerador * outra.numerador; // Calcula o novo numerador multiplicando os numeradores das duas frações.
        int novoDenominador = this.denominador * outra.denominador; // Calcula o novo denominador multiplicando os denominadores das duas frações.
        return new Fracao(novoNumerador, novoDenominador); // Retorna uma nova instância de Fracao com os valores calculados.
    }

    public Fracao dividir(Fracao outra) { // Método público para dividir duas frações.
        if (outra.numerador == 0) { // Verifica se o numerador da fração pela qual estamos dividindo é zero.
            throw new IllegalArgumentException("Não é possível dividir por zero."); // Lança uma exceção se o numerador for zero, indicando divisão por zero.
        }
        int novoNumerador = this.numerador * outra.denominador; // Calcula o novo numerador multiplicando o numerador da primeira fração pelo denominador da segunda.
        int novoDenominador = this.denominador * outra.numerador; // Calcula o novo denominador multiplicando o denominador da primeira fração pelo numerador da segunda.
        return new Fracao(novoNumerador, novoDenominador); // Retorna uma nova instância de Fracao com os valores calculados.
    }

    // Método principal para testes
    public static void main(String[] args) { // Método principal para executar testes.
        Fracao f1 = new Fracao(1, 2); // Cria uma nova instância de Fracao com numerador 1 e denominador 2.
        Fracao f2 = new Fracao(3, 4); // Cria uma nova instância de Fracao com numerador 3 e denominador 4.

        System.out.println("Soma: " + f1.somar(f2)); // Soma f1 e f2, e imprime o resultado.
        System.out.println("Subtração: " + f1.subtrair(f2)); // Subtrai f2 de f1, e imprime o resultado.
        System.out.println("Multiplicação: " + f1.multiplicar(f2)); // Multiplica f1 e f2, e imprime o resultado.
        System.out.println("Divisão: " + f1.dividir(f2)); // Divide f1 por f2, e imprime o resultado.
    }
}
