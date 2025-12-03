package com.contabilidade.resource;

import com.contabilidade.dto.request.UnidadeGestoraRequestDTO;
import com.contabilidade.dto.response.UnidadeGestoraResponseDTO;
import com.contabilidade.service.UnidadeGestoraService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/unidades-gestoras")
public class UnidadeGestoraResource {

    private final UnidadeGestoraService service;

    public UnidadeGestoraResource(UnidadeGestoraService service) {
        this.service = service;
    }

    @PostMapping
    public UnidadeGestoraResponseDTO criar(@Valid @RequestBody UnidadeGestoraRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<UnidadeGestoraResponseDTO> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public UnidadeGestoraResponseDTO buscarPorId(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public UnidadeGestoraResponseDTO atualizar(@PathVariable Long id,
                                               @Valid @RequestBody UnidadeGestoraRequestDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
