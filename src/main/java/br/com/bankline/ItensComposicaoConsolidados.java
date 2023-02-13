package br.com.bankline;

import java.math.BigDecimal;
import java.util.List;

public class ItensComposicaoConsolidados {

    private String codigoComposicao;
    private BigDecimal valorTotalComposicao;
    private List<ItensServicosConsolidados> itensServicosConsolidados;

    private ItensComposicaoConsolidados(ItensComposicaoConsolidadosBuilder builder) {
        this.codigoComposicao = builder.codigoComposicao;
        this.valorTotalComposicao = builder.valorTotalComposicao;
        this.itensServicosConsolidados = builder.itensServicosConsolidados;
    }

    public String getCodigoComposicao() {
        return codigoComposicao;
    }

    public void setCodigoComposicao(String codigoComposicao) {
        this.codigoComposicao = codigoComposicao;
    }

    public BigDecimal getValorTotalComposicao() {
        return valorTotalComposicao;
    }

    public void setValorTotalComposicao(BigDecimal valorTotalComposicao) {
        this.valorTotalComposicao = valorTotalComposicao;
    }

    public List<ItensServicosConsolidados> getItensServicosConsolidados() {
        return itensServicosConsolidados;
    }

    public void setItensServicosConsolidados(List<ItensServicosConsolidados> itensServicosConsolidados) {
        this.itensServicosConsolidados = itensServicosConsolidados;
    }

    public static class ItensComposicaoConsolidadosBuilder {

        private String codigoComposicao;
        private BigDecimal valorTotalComposicao;
        private List<ItensServicosConsolidados> itensServicosConsolidados;

        public ItensComposicaoConsolidadosBuilder codigoComposicao(String codigoComposicao) {
            this.codigoComposicao = codigoComposicao;
            return this;
        }

        public ItensComposicaoConsolidadosBuilder valorTotalComposicao(BigDecimal valorTotalComposicao) {
            this.valorTotalComposicao = valorTotalComposicao;
            return this;
        }

        public ItensComposicaoConsolidadosBuilder itensServicosConsolidados(List<ItensServicosConsolidados> itensServicosConsolidados) {
            this.itensServicosConsolidados = itensServicosConsolidados;
            return this;
        }

        public ItensComposicaoConsolidados builder() {
            return new ItensComposicaoConsolidados(this);
        }
    }
}
