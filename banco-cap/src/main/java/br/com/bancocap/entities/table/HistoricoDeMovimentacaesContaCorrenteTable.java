//package br.com.bancocap.entities.table;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "HISTORICO_MOVIMENTACAO")
//public class HistoricoDeMovimentacaesContaCorrenteTable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idHistorico;
//
//    @ManyToOne
//    @JoinColumn
//    private ContaCorrenteTable contaCorrenteTable;
//
//    private Date dataMovimentacao;
//
//    private Double valorDaMovimentacao;
//
//    public HistoricoDeMovimentacaesContaCorrenteTable(Long idHistorico, ContaCorrenteTable contaCorrenteTable, Date dataMovimentacao, Double valorDaMovimentacao) {
//        this.idHistorico = idHistorico;
//        this.contaCorrenteTable = contaCorrenteTable;
//        this.dataMovimentacao = dataMovimentacao;
//        this.valorDaMovimentacao = valorDaMovimentacao;
//    }
//
//    public Long getIdHistorico() {
//        return idHistorico;
//    }
//
//    public void setIdHistorico(Long idHistorico) {
//        this.idHistorico = idHistorico;
//    }
//
//    public ContaCorrenteTable getContaCorrenteTable() {
//        return contaCorrenteTable;
//    }
//
//    public void setContaCorrenteTable(ContaCorrenteTable contaCorrenteTable) {
//        this.contaCorrenteTable = contaCorrenteTable;
//    }
//
//    public Date getDataMovimentacao() {
//        return dataMovimentacao;
//    }
//
//    public void setDataMovimentacao(Date dataMovimentacao) {
//        this.dataMovimentacao = dataMovimentacao;
//    }
//
//    public Double getValorDaMovimentacao() {
//        return valorDaMovimentacao;
//    }
//
//    public void setValorDaMovimentacao(Double valorDaMovimentacao) {
//        this.valorDaMovimentacao = valorDaMovimentacao;
//    }
//}
