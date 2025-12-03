package com.contabilidade.resource;

import com.contabilidade.dto.request.EmpenhoRequestDTO;
import com.contabilidade.dto.response.EmpenhoResponseDTO;
import com.contabilidade.service.EmpenhoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empenhos")
public class EmpenhoResource {

    private final EmpenhoService service;

    public EmpenhoResource(EmpenhoService service) {
        this.service = service;
    }

    @PostMapping
    public EmpenhoResponseDTO criar(@Valid @RequestBody EmpenhoRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<EmpenhoResponseDTO> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public EmpenhoResponseDTO buscarPorId(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
