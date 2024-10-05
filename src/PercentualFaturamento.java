import java.util.HashMap;

public class PercentualFaturamento {
    public static void main(String[] args) {
        HashMap<String, Double> faturamento = new HashMap<>();
        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        double total = 0;
        for (double valor : faturamento.values()) {
            total += valor;
        }

        for (String estado : faturamento.keySet()) {
            double percentual = (faturamento.get(estado) / total) * 100;
            System.out.printf("Percentual de %s: %.2f%%\n", estado, percentual);
        }
    }

}
    