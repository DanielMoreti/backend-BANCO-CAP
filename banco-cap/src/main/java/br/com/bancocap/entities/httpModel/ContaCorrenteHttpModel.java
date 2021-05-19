package br.com.bancocap.entities.httpModel;

public class ContaCorrenteHttpModel {

    Long idContaConrrente;

    String codigoBanco;

    String Agencia;

    String tipoDeConta;

    String numeroDaConta;

    String digitoVerificador;

    Double saldoDaConta;

    public ContaCorrenteHttpModel(Long idContaConrrente, String codigoBanco, String agencia, String tipoDeConta, String numeroDaConta, String digitoVerificador, Double saldoDaConta) {
        this.idContaConrrente = idContaConrrente;
        this.codigoBanco = codigoBanco;
        Agencia = agencia;
        this.tipoDeConta = tipoDeConta;
        this.numeroDaConta = numeroDaConta;
        this.digitoVerificador = digitoVerificador;
        this.saldoDaConta = saldoDaConta;
    }

    public Double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(Double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public Long getIdContaConrrente() {
        return idContaConrrente;
    }

    public void setIdContaConrrente(Long idContaConrrente) {
        this.idContaConrrente = idContaConrrente;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }
}
