package ie.atu.projectpayment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @JsonProperty("iban")
    private String iban;
    @JsonProperty("bic")
    private String bic;
    @JsonProperty("id")
    private String id;
}
