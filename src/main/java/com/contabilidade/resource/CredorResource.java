package com.contabilidade.resource;

import com.contabilidade.dto.request.CredorRequestDTO;
import com.contabilidade.dto.response.CredorResponseDTO;
import com.contabilidade.service.CredorService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credores")
public class CredorResource {

    private final CredorService service;

    public CredorResource(CredorService service) {
        this.service = service;
    }

    @PostMapping
    public CredorResponseDTO criar(@Valid @RequestBody CredorRequestDTO dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<CredorResponseDTO> listar() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CredorResponseDTO buscarPorId(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public CredorResponseDTO atualizar(@PathVariable Long id,
                                       @Valid @RequestBody CredorRequestDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.delete(id);
    }
}
