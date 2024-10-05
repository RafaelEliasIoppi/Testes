
public class Faturamento {
    public static void main(String[] args) {
        // Dados de faturamento diário
        double[] faturamentoDiario = {100, 200, 0, 300, 400, 0, 500}; // Exemplo de faturamento

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int count = 0;

        for (double valor : faturamentoDiario) {
            if (valor > 0) {
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                soma += valor;
                count++;
            }
        }

        double media = soma / count;
        int diasAcimaMedia = 0;

        for (double valor : faturamentoDiario) {
            if (valor > media) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menor);
        System.out.println("Maior faturamento: " + maior);
        System.out.println("Número de dias acima da média: " + diasAcimaMedia);
    }
}
