package br.com.bankline;

import java.math.BigDecimal;

public class ItensApurados {

    private String codigoTipoTratamentoItemPrestacaoConta;
    private String textoFaturamentoPrestacaoConta;
    // Esse valor que eu preciso
    private int valorUtilizacaoItemServicoConsolidado;
    private BigDecimal valorConsumoServicoApurado;

    private ItensApurados(ItensApuradosBuilder builder) {
        this.codigoTipoTratamentoItemPrestacaoConta = builder.codigoTipoTratamentoItemPrestacaoConta;
        this.textoFaturamentoPrestacaoConta = builder.textoFaturamentoPrestacaoConta;
        this.valorUtilizacaoItemServicoConsolidado = builder.valorUtilizacaoItemServicoConsolidado;
        this.valorConsumoServicoApurado = builder.valorConsumoServicoApurado;
    }

    public ItensApurados() {
    }

    public String getCodigoTipoTratamentoItemPrestacaoConta() {
        return codigoTipoTratamentoItemPrestacaoConta;
    }

    public void setCodigoTipoTratamentoItemPrestacaoConta(String codigoTipoTratamentoItemPrestacaoConta) {
        this.codigoTipoTratamentoItemPrestacaoConta = codigoTipoTratamentoItemPrestacaoConta;
    }

    public String getTextoFaturamentoPrestacaoConta() {
        return textoFaturamentoPrestacaoConta;
    }

    public void setTextoFaturamentoPrestacaoConta(String textoFaturamentoPrestacaoConta) {
        this.textoFaturamentoPrestacaoConta = textoFaturamentoPrestacaoConta;
    }

    public int getValorUtilizacaoItemServicoConsolidado() {
        return valorUtilizacaoItemServicoConsolidado;
    }

    public void setValorUtilizacaoItemServicoConsolidado(int valorUtilizacaoItemServicoConsolidado) {
        this.valorUtilizacaoItemServicoConsolidado = valorUtilizacaoItemServicoConsolidado;
    }

    public BigDecimal getValorConsumoServicoApurado() {
        return valorConsumoServicoApurado;
    }

    public void setValorConsumoServicoApurado(BigDecimal valorConsumoServicoApurado) {
        this.valorConsumoServicoApurado = valorConsumoServicoApurado;
    }

    public static class ItensApuradosBuilder {

        private String codigoTipoTratamentoItemPrestacaoConta;
        private String textoFaturamentoPrestacaoConta;
        // Esse valor que eu preciso
        private int valorUtilizacaoItemServicoConsolidado;
        private BigDecimal valorConsumoServicoApurado;

        public ItensApuradosBuilder codigoTipoTratamentoItemPrestacaoConta(String codigoTipoTratamentoItemPrestacaoConta) {
            this.codigoTipoTratamentoItemPrestacaoConta = codigoTipoTratamentoItemPrestacaoConta;
            return this;
        }

        public ItensApuradosBuilder textoFaturamentoPrestacaoConta(String textoFaturamentoPrestacaoConta) {
            this.textoFaturamentoPrestacaoConta = textoFaturamentoPrestacaoConta;
            return this;
        }

        public ItensApuradosBuilder valorUtilizacaoItemServicoConsolidado(int valorUtilizacaoItemServicoConsolidado) {
            this.valorUtilizacaoItemServicoConsolidado = valorUtilizacaoItemServicoConsolidado;
            return this;
        }

        public ItensApuradosBuilder valorConsumoServicoApurado(BigDecimal valorConsumoServicoApurado) {
            this.valorConsumoServicoApurado = valorConsumoServicoApurado;
            return this;
        }

        public ItensApurados build() {
            return new ItensApurados(this);
        }
    }
}
