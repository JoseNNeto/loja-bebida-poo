public class BebidaAlcoolica extends Bebida {
    double teorAlcoolico;
    String tipoBebidaAlcoolica;

    public BebidaAlcoolica(String nome, int id, double preco, int quantidade, String tipo, String marca, String descricao, Date dataValidade, double teorAlcoolico, String tipoBebidaAlcoolica) {
        super(nome, id, preco, quantidade, tipo, marca, descricao, dataValidade);
        this.teorAlcoolico = teorAlcoolico;
        this.tipoBebidaAlcoolica = tipoBebidaAlcoolica;
    }
}
