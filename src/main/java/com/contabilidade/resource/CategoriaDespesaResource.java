package com.contabilidade.resource;

import com.contabilidade.dto.request.CategoriaDespesaRequestDTO;
import com.contabilidade.dto.response.CategoriaDespesaResponseDTO;
import com.contabilidade.service.CategoriaDespesaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias-despesa")
public class CategoriaDespesaResource {

    private final CategoriaDespesaService service;

    public CategoriaDespesaResource(CategoriaDespesaService service) {
        this.service = service;
    }

    @PostMapping
    public CategoriaDespesaResponseDTO criar(@Valid @RequestBody CategoriaDespesaRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<CategoriaDespesaResponseDTO> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CategoriaDespesaResponseDTO buscarPorId(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public CategoriaDespesaResponseDTO atualizar(@PathVariable Long id,
                                                 @Valid @RequestBody CategoriaDespesaRequestDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
