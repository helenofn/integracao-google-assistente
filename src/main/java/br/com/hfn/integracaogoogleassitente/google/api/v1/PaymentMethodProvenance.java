package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Provenance of the payment method used for the transaction. User may have registered the
 * same payment method with both google and merchant.
 */
public enum PaymentMethodProvenance {
    PAYMENT_METHOD_PROVENANCE_GOOGLE, PAYMENT_METHOD_PROVENANCE_MERCHANT, PAYMENT_METHOD_PROVENANCE_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case PAYMENT_METHOD_PROVENANCE_GOOGLE: return "PAYMENT_METHOD_PROVENANCE_GOOGLE";
            case PAYMENT_METHOD_PROVENANCE_MERCHANT: return "PAYMENT_METHOD_PROVENANCE_MERCHANT";
            case PAYMENT_METHOD_PROVENANCE_UNSPECIFIED: return "PAYMENT_METHOD_PROVENANCE_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static PaymentMethodProvenance forValue(String value) throws IOException {
        if (value.equals("PAYMENT_METHOD_PROVENANCE_GOOGLE")) return PAYMENT_METHOD_PROVENANCE_GOOGLE;
        if (value.equals("PAYMENT_METHOD_PROVENANCE_MERCHANT")) return PAYMENT_METHOD_PROVENANCE_MERCHANT;
        if (value.equals("PAYMENT_METHOD_PROVENANCE_UNSPECIFIED")) return PAYMENT_METHOD_PROVENANCE_UNSPECIFIED;
        throw new IOException("Cannot deserialize PaymentMethodProvenance");
    }
}
