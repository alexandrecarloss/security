package com.auth.security.domain.user;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterDTO(@NotBlank(message = "O login não pode estar vazio") String login,
                          @NotBlank(message = "A senha é obrigatória")
                          String password, @NotNull(message = "O papel é obrigatório") UserRole role) {
}
