
public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomecliente;
    private float saldo;

    public ContaTerminal(){

    }

    public ContaTerminal(int numero,String agencia,String nomecliente,float saldo){
        this.numero=numero;
        this.agencia=agencia;
        this.nomecliente=nomecliente;
        this.saldo=saldo;
    }


    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero=numero;

    }

    public String getAgencia(){
        return agencia;
    }

    public void setAgencia(String agencia){
        this.agencia=agencia;
    }

    public String getNomecliente(){
        return nomecliente;
    }

    public void setNomecliente(String nomecliente){
        this.nomecliente=nomecliente;

    }

    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo=saldo;

    }

    }
