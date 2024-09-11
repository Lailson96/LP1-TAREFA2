public class Fracao { 
    private int numerador;   
    private int denominador;

    public Fracao(int numerador, int denominador) { 
        if (denominador == 0) { 
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        this.numerador = numerador; 
        this.denominador = denominador; 
        simplificar();
    }

    private void simplificar() { 
        int gcd = mdc(Math.abs(numerador), Math.abs(denominador)); 
        numerador /= gcd;
        denominador /= gcd;

        if (denominador < 0) { 
            numerador = -numerador; 
            denominador = -denominador; 
        }
    }

    private int mdc(int a, int b) { 
        return (b == 0) ? a : mdc(b, a % b); 
    }

    public String exibir() { 
        return numerador + "/" + denominador;
    }

    private Fracao operar(Fracao outra, char operador) { 
        int novoNumerador = 0; 
        int novoDenominador = this.denominador * outra.denominador;

        switch (operador) {
            case '+':
                novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
                break; 
            case '-': 
                novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador; 
                break; 
            case '*': 
                novoNumerador = this.numerador * outra.numerador;
                novoDenominador = this.denominador * outra.denominador;
                break; 
            case '/': 
                if (outra.numerador == 0) { 
                    throw new IllegalArgumentException("Não é possível dividir por zero."); 
                }
                novoNumerador = this.numerador * outra.denominador; 
                novoDenominador = this.denominador * outra.numerador; 
                break; 
        }

        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao somar(Fracao outra) {
        return operar(outra, '+'); 
    }

    public Fracao subtrair(Fracao outra) {
        return operar(outra, '-'); 
    }

    public Fracao multiplicar(Fracao outra) {
        return operar(outra, '*'); 
    }

    public Fracao dividir(Fracao outra) { 
        return operar(outra, '/'); 
    }

    public static void main(String[] args) { 
        Fracao f1 = new Fracao(1, 2); 
        Fracao f2 = new Fracao(3, 4); 

        System.out.println("Soma: " + f1.somar(f2).exibir());
        System.out.println("Subtração: " + f1.subtrair(f2).exibir()); 
        System.out.println("Multiplicação: " + f1.multiplicar(f2).exibir()); 
        System.out.println("Divisão: " + f1.dividir(f2).exibir()); 
    }
}
