
public class Emprestimo {

    private String valor;
    private EmprestimoEstado estado;

    public Emprestimo() {
        this.estado = EmprestimoEstadoEmAnalise.getInstancia();
    }

    public String getCliente() {
        return valor;
    }

    public void setCliente(String valor) {
        this.valor = valor;
    }

    public void setEstado(EmprestimoEstado estado) {
        this.estado = estado;
    }

    public String concederEmprestimo( )throws Exception {
        return estado.concederEmprestimo(this);
    }
    public String depositar()throws Exception {
        return estado.depositar(this);
    }

    public String analisarCredito()  throws Exception{
        return estado.analisarCredito(this);
    }

    public String negarEmprestimo() throws Exception{
        return estado.negarEmprestimo(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }


    public EmprestimoEstado getEstado() {
        return estado;
    }
}
