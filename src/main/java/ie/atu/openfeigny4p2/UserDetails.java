package ie.atu.openfeigny4p2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    @NotBlank(message = "name cannot null")
    public String name;
    @NotBlank(message = "name cannot null")
    public String email;
}
