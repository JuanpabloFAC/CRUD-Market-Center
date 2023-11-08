package market.center.crud.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(
        String id,
        @NotBlank
        @NotNull
        String name,
        @NotBlank
        @NotNull
        Integer price_in_cents) {
}
