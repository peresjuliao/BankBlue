package br.com.bankline;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UtilClassBuilder {
    public static ItensApurados getItensApuradosCompleta() {
        return new ItensApurados.ItensApuradosBuilder()
                .codigoTipoTratamentoItemPrestacaoConta("P")
                .textoFaturamentoPrestacaoConta("Texto Faturamento Pre Pago")
                .valorUtilizacaoItemServicoConsolidado(3)
                .valorConsumoServicoApurado(BigDecimal.valueOf(8.64))
                .build();
    }

    public static ItensApurados getItensApuradosSimples() {
        return new ItensApurados.ItensApuradosBuilder()
                .codigoTipoTratamentoItemPrestacaoConta("P")
                .textoFaturamentoPrestacaoConta("Texto Faturamento Pre Pago")
                .valorUtilizacaoItemServicoConsolidado(2)
                .valorConsumoServicoApurado(BigDecimal.valueOf(4.05))
                .build();
    }

    public static ItensApurados getItensApuradosCompra() {
        return new ItensApurados.ItensApuradosBuilder()
                .codigoTipoTratamentoItemPrestacaoConta("P")
                .textoFaturamentoPrestacaoConta("Texto Faturamento Pre Pago")
                .valorUtilizacaoItemServicoConsolidado(1)
                .valorConsumoServicoApurado(BigDecimal.valueOf(49.95))
                .build();
    }

    public static ItensServicosConsolidados getItensServicosConsolidadosCompleta() {
        ItensApurados itensApuradosCompleta = getItensApuradosCompleta();
        List<ItensApurados> listaItensApuradosCompleta = new ArrayList<>();
        listaItensApuradosCompleta.add(itensApuradosCompleta);
        return new ItensServicosConsolidados.ItensServicosConsolidadosBuilder()
                .codigoServico("CRC-01")
                .codigoClassificacaoCobranca("USO")
                .valorTotalServico(BigDecimal.valueOf(8.64))
                .itensApurados(listaItensApuradosCompleta)
                .build();
    }

    public static ItensServicosConsolidados getItensServicosConsolidadosSimples() {
        ItensApurados itensApuradosSimples = getItensApuradosSimples();
        List<ItensApurados> listaItensApuradosSimples = new ArrayList<>();
        listaItensApuradosSimples.add(itensApuradosSimples);
        return new ItensServicosConsolidados.ItensServicosConsolidadosBuilder()
                .codigoServico("CRS-01")
                .codigoClassificacaoCobranca("USO")
                .valorTotalServico(BigDecimal.valueOf(4.05))
                .itensApurados(listaItensApuradosSimples)
                .build();
    }

    public static ItensServicosConsolidados getItensServicosConsolidadosCompra() {
        ItensApurados itensApuradosCompra = getItensApuradosCompra();
        List<ItensApurados> listaItensApuradosCompra = new ArrayList<>();
        listaItensApuradosCompra.add(itensApuradosCompra);
        return new ItensServicosConsolidados.ItensServicosConsolidadosBuilder()
                .codigoServico("CRS-01")
                .codigoClassificacaoCobranca("USO")
                .valorTotalServico(BigDecimal.valueOf(4.05))
                .itensApurados(listaItensApuradosCompra)
                .build();
    }

    public static ItensComposicaoConsolidados getItensComposicaoConsolidadosUso() {
        List<ItensServicosConsolidados> listaItensServicosConsolidadosUso = new ArrayList<>();
        ItensServicosConsolidados itensServicosConsolidadosCompleta = getItensServicosConsolidadosCompleta();
        ItensServicosConsolidados itensServicosConsolidadosSimples = getItensServicosConsolidadosSimples();
        listaItensServicosConsolidadosUso.add(itensServicosConsolidadosCompleta);
        listaItensServicosConsolidadosUso.add(itensServicosConsolidadosSimples);

        return new ItensComposicaoConsolidados.ItensComposicaoConsolidadosBuilder()
                .codigoComposicao("USO")
                .valorTotalComposicao(BigDecimal.valueOf(12.69))
                .itensServicosConsolidados(listaItensServicosConsolidadosUso)
                .builder();
    }

    public static ItensComposicaoConsolidados getItensComposicaoConsolidadosCompra() {
        List<ItensServicosConsolidados> listaItensServicosConsolidadosCompra = new ArrayList<>();
        ItensServicosConsolidados itensServicosConsolidadosCompra = getItensServicosConsolidadosCompra();
        listaItensServicosConsolidadosCompra.add(itensServicosConsolidadosCompra);

        return new ItensComposicaoConsolidados.ItensComposicaoConsolidadosBuilder()
                .codigoComposicao("COMPRA")
                .valorTotalComposicao(BigDecimal.valueOf(49.95))
                .itensServicosConsolidados(listaItensServicosConsolidadosCompra)
                .builder();
    }

    public static Fatura getFatura() {
        List<ItensComposicaoConsolidados> listaItensComposicaoConsolidados = new ArrayList<>();
        List<ItensServicosConsolidados> listaItensServicosConsolidados = new ArrayList<>();
        ItensComposicaoConsolidados itensComposicaoConsolidadosUso = getItensComposicaoConsolidadosUso();
        ItensComposicaoConsolidados itensComposicaoConsolidadosCompra = getItensComposicaoConsolidadosCompra();
        listaItensComposicaoConsolidados.add(itensComposicaoConsolidadosUso);
        listaItensComposicaoConsolidados.add(itensComposicaoConsolidadosCompra);

        return new Fatura.FaturaBuilder()
                .codigoCobranca(UUID.randomUUID().toString())
                .codigoUtilizador("rastreador")
                .codigoPacote("")
                .dataInicio("2023-02-06")
                .dataFim("2023-02-27")
                .quantidadeExcedente(BigDecimal.valueOf(0.00))
                .quantidaeUtilizada(BigDecimal.valueOf(5.00))
                .codigoFatura("")
                .valorTotalFatura(BigDecimal.valueOf(62.64))
                .itensServicosConsolidados(listaItensServicosConsolidados)
                .itensComposicaoConsolidados(listaItensComposicaoConsolidados)
                .builder();
    }


}
