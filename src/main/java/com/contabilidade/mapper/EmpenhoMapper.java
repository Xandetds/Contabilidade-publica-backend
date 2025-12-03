package com.contabilidade.mapper;

import com.contabilidade.dto.request.EmpenhoRequestDTO;
import com.contabilidade.dto.response.EmpenhoResponseDTO;
import com.contabilidade.entity.*;
import com.contabilidade.enums.SituacaoEmpenho;
import org.springframework.stereotype.Component;

@Component
public class EmpenhoMapper {

    public Empenho toEntity(EmpenhoRequestDTO dto,
                            UnidadeGestora ug,
                            Credor credor,
                            CategoriaDespesa categoria,
                            Recurso recurso,
                            Usuario usuario) {

        if (dto == null) return null;

        Empenho entidade = new Empenho();
        entidade.setNumeroEmpenho(dto.getNumeroEmpenho());
        entidade.setDataEmpenho(java.time.LocalDate.parse(dto.getDataEmpenho()));
        entidade.setValorEmpenhado(dto.getValorEmpenhado());
        entidade.setSituacao(SituacaoEmpenho.valueOf(dto.getSituacao()));

        entidade.setUnidadeGestora(ug);
        entidade.setCredor(credor);
        entidade.setCategoriaDespesa(categoria);
        entidade.setRecurso(recurso);
        entidade.setUsuarioResponsavel(usuario);

        return entidade;
    }

    public EmpenhoResponseDTO toResponse(Empenho entidade) {
        if (entidade == null) return null;

        EmpenhoResponseDTO dto = new EmpenhoResponseDTO();
        dto.setId(entidade.getId());
        dto.setNumeroEmpenho(entidade.getNumeroEmpenho());
        dto.setDataEmpenho(entidade.getDataEmpenho().toString());
        dto.setValorEmpenhado(entidade.getValorEmpenhado());
        dto.setSituacao(entidade.getSituacao());

        dto.setUnidadeGestoraId(entidade.getUnidadeGestora().getId());
        dto.setUnidadeGestoraNome(entidade.getUnidadeGestora().getNome());

        dto.setCredorId(entidade.getCredor().getId());
        dto.setCredorNome(entidade.getCredor().getNome());

        dto.setCategoriaDespesaId(entidade.getCategoriaDespesa().getId());
        dto.setCategoriaDespesaCodigo(entidade.getCategoriaDespesa().getCodigo());

        dto.setRecursoId(entidade.getRecurso().getId());
        dto.setRecursoCodigo(entidade.getRecurso().getCodigo());

        dto.setUsuarioResponsavelId(entidade.getUsuarioResponsavel().getId());
        dto.setUsuarioResponsavelNome(entidade.getUsuarioResponsavel().getNome());

        return dto;
    }
}
