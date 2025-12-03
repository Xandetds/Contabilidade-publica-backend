package com.contabilidade.resource;

import com.contabilidade.dto.request.PagamentoRequestDTO;
import com.contabilidade.dto.response.PagamentoResponseDTO;
import com.contabilidade.service.PagamentoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoResource {

    private final PagamentoService service;

    public PagamentoResource(PagamentoService service) {
        this.service = service;
    }

    @PostMapping
    public PagamentoResponseDTO criar(@Valid @RequestBody PagamentoRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<PagamentoResponseDTO> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PagamentoResponseDTO buscarPorId(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
