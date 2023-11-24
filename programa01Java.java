//Salvo como 'programa01Java'

class programa01 {
    public static void main(String entrada[]) {

        // Declaração de variáveis
        int numInt;
        double numReal, soma;
        char caracter;

        // Entrada de dados
        numInt = Integer.parseInt(entrada[0]);
        numReal = Double.parseDouble(entrada[1]);
        caracter = extracted(entrada);

        // Processamento
        soma = (double) numInt + numReal;

        // Saída de resultados
        System.out.println((double) numInt + " + " + numReal + " = " + soma + " sinal " + caracter);

        extracted2();
    }

    private static void extracted2() {
        System.exit(0);
    }

    private static char extracted(String[] entrada) {
        return (entrada[2]).charAt(0);
    }
}