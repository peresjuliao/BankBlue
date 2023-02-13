package br.com.bankline;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {
        Fatura fatura = UtilClassBuilder.getFatura();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String listaFatura = gson.toJson(fatura);
        System.out.println(listaFatura);

        List<ItensComposicaoConsolidados> lista = fatura.getItensComposicaoConsolidados().stream()
                .filter(fat -> fat.getCodigoComposicao().equals("USO"))
                .collect(Collectors.toList());





        List<ItensServicosConsolidados> listaItensServicosConsolidadosCompleta = lista.get(0).getItensServicosConsolidados().stream()
                .filter(itens -> itens.getCodigoServico().equals("CRC-01"))
                .collect(Collectors.toList());

        List<ItensServicosConsolidados> listaItensServicosConsolidadosSimples = lista.get(0).getItensServicosConsolidados().stream()
                .filter(itens -> itens.getCodigoServico().equals("CRS-01"))
                .collect(Collectors.toList());

        List<ItensApurados> itensApuradosCompleta = listaItensServicosConsolidadosCompleta.get(0).getItensApurados().stream()
                .filter(e -> e.getValorUtilizacaoItemServicoConsolidado() > 0)
                .collect(Collectors.toList());

        List<ItensApurados> itensApuradosSimples = listaItensServicosConsolidadosSimples.get(0).getItensApurados().stream()
                .filter(e -> e.getValorUtilizacaoItemServicoConsolidado() > 0)
                .collect(Collectors.toList());

        int valorUtilizacaoItemServicoConsolidadoCompleta = itensApuradosCompleta.get(0).getValorUtilizacaoItemServicoConsolidado();
        int valorUtilizacaoItemServicoConsolidadoSimples = itensApuradosSimples.get(0).getValorUtilizacaoItemServicoConsolidado();

        String completa = gson.toJson(valorUtilizacaoItemServicoConsolidadoCompleta);
        System.out.println(completa);
        String simples = gson.toJson(valorUtilizacaoItemServicoConsolidadoSimples);
        System.out.println(simples);


    }


}
