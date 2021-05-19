package br.com.bancocap.entities.table;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CONTAS")
public class ContaCorrenteTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContaCorrente;

    private String codigoBanco;

    private String agencia;

    private String tipoDeConta;

    private String numeroDaConta;

    private String digitoVerificador;

    private Double saldoDaConta;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contaCorrenteTable", cascade = CascadeType.ALL)
//    private List<HistoricoDeMovimentacaesContaCorrenteTable> historicoDeMovimentacaesContaCorrenteTable;


    public ContaCorrenteTable() {
    }

    public ContaCorrenteTable(Long idContaCorrente, String codigoBanco, String agencia, String tipoDeConta, String numeroDaConta, String digitoVerificador, Double saldoDaConta) {
        this.idContaCorrente = idContaCorrente;
        this.codigoBanco = codigoBanco;
        this.agencia = agencia;
        this.tipoDeConta = tipoDeConta;
        this.numeroDaConta = numeroDaConta;
        this.digitoVerificador = digitoVerificador;
        this.saldoDaConta = saldoDaConta;
    }

    public Long getIdContaCorrente() {
        return idContaCorrente;
    }

    public void setIdContaCorrente(Long idContaCorrente) {
        this.idContaCorrente = idContaCorrente;
    }

    public Double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(Double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public Long getIdContaConrrente() {
        return idContaCorrente;
    }

    public void setIdContaConrrente(Long idContaConrrente) {
        this.idContaCorrente = idContaConrrente;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
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
