package adsb;

public class CartaoCredito {
	private String numero;
    private String val;
    private Cliente cliente;
    private boolean disponivel;
    
    public CartaoCredito(String numero, String val, Cliente cliente) {
        this.numero = numero;
        this.val = val;
        this.cliente = cliente;
        this.disponivel = true;
}
    
    public String getNumero() {
        return numero;
    }
    
    public String getVal() {
        return val;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public String toString() {
        return numero + " - " + cliente.getNome() + " | " + (disponivel ? "Disponível" : "Cadastrado");
    }

}