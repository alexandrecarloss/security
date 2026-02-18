package com.auth.security.domain.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AuthenticationDTO(@NotBlank(message = "O login não pode estar vazio") String login,
                                @NotBlank(message = "A senha é obrigatória")
                                // @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
                                String password) {
}
