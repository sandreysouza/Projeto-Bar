public class Conta {
    public Cliente cliente;
    public final double PRECO_CERVEJA = 5.00;
    public final double PRECO_REFRIGERANTE = 3.00;
    public final double PRECO_ESPETINHO = 7.00;
    public final double COUVERT = 4.00;
    public final double INGRESSO_HOMEM = 10.00;
    public final double INGRESSO_MULHER = 8.00;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularConsumo() {
        double totalCerveja = cliente.getQuantidadeCervejas() * PRECO_CERVEJA;
        double totalRefrigerante = cliente.getQuantidadeRefrigerantes() * PRECO_REFRIGERANTE;
        double totalEspetinho = cliente.getQuantidadeEspetinhos() * PRECO_ESPETINHO;
        return totalCerveja + totalRefrigerante + totalEspetinho;
    }

    public double calcularCouvert() {
        if (calcularConsumo() > 30.00) {
            return 0.00;
        }
        return COUVERT;
    }

    public double calcularIngresso() {
        if (cliente.getSexo() == 'M' || cliente.getSexo() == 'm') {
            return INGRESSO_HOMEM;
        } else if (cliente.getSexo() == 'F' || cliente.getSexo() == 'f') {
            return INGRESSO_MULHER;
        }
        return 0.00; 
    }

    public double calcularValorTotal() {
        return calcularConsumo() + calcularCouvert() + calcularIngresso();
    }
}