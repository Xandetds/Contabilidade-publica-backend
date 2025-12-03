package com.contabilidade.resource;

import com.contabilidade.dto.request.LiquidacaoRequestDTO;
import com.contabilidade.dto.response.LiquidacaoResponseDTO;
import com.contabilidade.service.LiquidacaoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/liquidacoes")
public class LiquidacaoResource {

    private final LiquidacaoService service;

    public LiquidacaoResource(LiquidacaoService service) {
        this.service = service;
    }

    @PostMapping
    public LiquidacaoResponseDTO criar(@Valid @RequestBody LiquidacaoRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<LiquidacaoResponseDTO> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public LiquidacaoResponseDTO buscarPorId(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
