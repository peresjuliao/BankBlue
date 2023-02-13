package br.com.bankline;

import java.math.BigDecimal;
import java.util.List;

public class Fatura {

    private String codigoCobranca;
    private String codigoUtilizador;
    private String codigoPacote;
    private String dataInicio;
    private String dataFim;
    private BigDecimal quantidadeExcedente;
    private BigDecimal quantidaeUtilizada;
    private String codigoFatura;
    private BigDecimal valorTotalFatura;
    private List<ItensServicosConsolidados> itensServicosConsolidados;
    private List<ItensComposicaoConsolidados> itensComposicaoConsolidados;

    private Fatura(FaturaBuilder builder) {
        this.codigoFatura = builder.codigoFatura;
        this.codigoUtilizador = builder.codigoUtilizador;
        this.codigoPacote = builder.codigoPacote;
        this.dataInicio = builder.dataInicio;
        this.dataFim = builder.dataFim;
        this.quantidadeExcedente = builder.quantidadeExcedente;
        this.quantidaeUtilizada = builder.quantidaeUtilizada;
        this.codigoFatura = builder.codigoFatura;
        this.valorTotalFatura = builder.valorTotalFatura;
        this.itensServicosConsolidados = builder.itensServicosConsolidados;
        this.itensComposicaoConsolidados = builder.itensComposicaoConsolidados;
    }

    public String getCodigoCobranca() {
        return codigoCobranca;
    }

    public void setCodigoCobranca(String codigoCobranca) {
        this.codigoCobranca = codigoCobranca;
    }

    public String getCodigoUtilizador() {
        return codigoUtilizador;
    }

    public void setCodigoUtilizador(String codigoUtilizador) {
        this.codigoUtilizador = codigoUtilizador;
    }

    public String getCodigoPacote() {
        return codigoPacote;
    }

    public void setCodigoPacote(String codigoPacote) {
        this.codigoPacote = codigoPacote;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public BigDecimal getQuantidadeExcedente() {
        return quantidadeExcedente;
    }

    public void setQuantidadeExcedente(BigDecimal quantidadeExcedente) {
        this.quantidadeExcedente = quantidadeExcedente;
    }

    public BigDecimal getQuantidaeUtilizada() {
        return quantidaeUtilizada;
    }

    public void setQuantidaeUtilizada(BigDecimal quantidaeUtilizada) {
        this.quantidaeUtilizada = quantidaeUtilizada;
    }

    public String getCodigoFatura() {
        return codigoFatura;
    }

    public void setCodigoFatura(String codigoFatura) {
        this.codigoFatura = codigoFatura;
    }

    public BigDecimal getValorTotalFatura() {
        return valorTotalFatura;
    }

    public void setValorTotalFatura(BigDecimal valorTotalFatura) {
        this.valorTotalFatura = valorTotalFatura;
    }

    public List<ItensServicosConsolidados> getItensServicosConsolidados() {
        return itensServicosConsolidados;
    }

    public void setItensServicosConsolidados(List<ItensServicosConsolidados> itensServicosConsolidados) {
        this.itensServicosConsolidados = itensServicosConsolidados;
    }

    public List<ItensComposicaoConsolidados> getItensComposicaoConsolidados() {
        return itensComposicaoConsolidados;
    }

    public void setItensComposicaoConsolidados(List<ItensComposicaoConsolidados> itensComposicaoConsolidados) {
        this.itensComposicaoConsolidados = itensComposicaoConsolidados;
    }

    public static class FaturaBuilder {
        private String codigoCobranca;
        private String codigoUtilizador;
        private String codigoPacote;
        private String dataInicio;
        private String dataFim;
        private BigDecimal quantidadeExcedente;
        private BigDecimal quantidaeUtilizada;
        private String codigoFatura;
        private BigDecimal valorTotalFatura;
        private List<ItensServicosConsolidados> itensServicosConsolidados;
        private List<ItensComposicaoConsolidados> itensComposicaoConsolidados;

        public FaturaBuilder codigoCobranca(String codigoCobranca) {
            this.codigoCobranca = codigoCobranca;
            return this;
        }

        public FaturaBuilder codigoUtilizador(String codigoUtilizador) {
            this.codigoUtilizador = codigoUtilizador;
            return this;
        }

        public FaturaBuilder codigoPacote(String codigoPacote) {
            this.codigoPacote = codigoPacote;
            return this;
        }

        public FaturaBuilder dataInicio(String dataInicio) {
            this.dataInicio = dataInicio;
            return this;
        }

        public FaturaBuilder dataFim(String dataFim) {
            this.dataFim = dataFim;
            return this;
        }

        public FaturaBuilder quantidadeExcedente(BigDecimal quantidadeExcedente) {
            this.quantidadeExcedente = quantidadeExcedente;
            return this;
        }

        public FaturaBuilder quantidaeUtilizada(BigDecimal quantidaeUtilizada) {
            this.quantidaeUtilizada = quantidaeUtilizada;
            return this;
        }

        public FaturaBuilder codigoFatura(String codigoFatura) {
            this.codigoFatura = codigoFatura;
            return this;
        }

        public FaturaBuilder valorTotalFatura(BigDecimal valorTotalFatura) {
            this.valorTotalFatura = valorTotalFatura;
            return this;
        }

        public FaturaBuilder itensServicosConsolidados(List<ItensServicosConsolidados> itensServicosConsolidados) {
            this.itensServicosConsolidados = itensServicosConsolidados;
            return this;
        }

        public FaturaBuilder itensComposicaoConsolidados(List<ItensComposicaoConsolidados> itensComposicaoConsolidados) {
            this.itensComposicaoConsolidados = itensComposicaoConsolidados;
            return this;
        }

        public Fatura builder() {
            return new Fatura(this);
        }

    }
}
