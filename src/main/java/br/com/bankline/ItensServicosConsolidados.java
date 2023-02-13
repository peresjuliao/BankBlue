package br.com.bankline;

import java.math.BigDecimal;
import java.util.List;

public class ItensServicosConsolidados {

    private String codigoServico;
    private String codigoClassificacaoCobranca;
    private BigDecimal valorTotalServico;
    private List<ItensApurados> itensApurados;

    public ItensServicosConsolidados(ItensServicosConsolidadosBuilder builder) {
        this.codigoServico = builder.codigoServico;
        this.codigoClassificacaoCobranca = builder.codigoClassificacaoCobranca;
        this.valorTotalServico = builder.valorTotalServico;
        this.itensApurados = builder.itensApurados;
    }

    public String getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getCodigoClassificacaoCobranca() {
        return codigoClassificacaoCobranca;
    }

    public void setCodigoClassificacaoCobranca(String codigoClassificacaoCobranca) {
        this.codigoClassificacaoCobranca = codigoClassificacaoCobranca;
    }

    public BigDecimal getValorTotalServico() {
        return valorTotalServico;
    }

    public void setValorTotalServico(BigDecimal valorTotalServico) {
        this.valorTotalServico = valorTotalServico;
    }

    public List<ItensApurados> getItensApurados() {
        return itensApurados;
    }

    public void setItensApurados(List<ItensApurados> itensApurados) {
        this.itensApurados = itensApurados;
    }

    public static class ItensServicosConsolidadosBuilder {

        private String codigoServico;
        private String codigoClassificacaoCobranca;
        private BigDecimal valorTotalServico;
        private List<ItensApurados> itensApurados;

        public ItensServicosConsolidadosBuilder codigoServico(String codigoServico) {
            this.codigoServico = codigoServico;
            return this;
        }
        public ItensServicosConsolidadosBuilder codigoClassificacaoCobranca(String codigoClassificacaoCobranca) {
            this.codigoClassificacaoCobranca = codigoClassificacaoCobranca;
            return this;
        }
        public ItensServicosConsolidadosBuilder valorTotalServico(BigDecimal valorTotalServico) {
            this.valorTotalServico = valorTotalServico;
            return this;
        }
        public ItensServicosConsolidadosBuilder itensApurados(List<ItensApurados> itensApurados) {
            this.itensApurados = itensApurados;
            return this;
        }

        public ItensServicosConsolidados build() {
            return new ItensServicosConsolidados(this);
        }

    }
}
