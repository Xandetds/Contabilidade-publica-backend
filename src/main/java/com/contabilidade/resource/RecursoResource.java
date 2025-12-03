package com.contabilidade.resource;

import com.contabilidade.dto.request.RecursoRequestDTO;
import com.contabilidade.dto.response.RecursoResponseDTO;
import com.contabilidade.service.RecursoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recursos")
public class RecursoResource {

    private final RecursoService service;

    public RecursoResource(RecursoService service) {
        this.service = service;
    }

    @PostMapping
    public RecursoResponseDTO criar(@Valid @RequestBody RecursoRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<RecursoResponseDTO> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public RecursoResponseDTO buscarPorId(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public RecursoResponseDTO atualizar(@PathVariable Long id,
                                        @Valid @RequestBody RecursoRequestDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
