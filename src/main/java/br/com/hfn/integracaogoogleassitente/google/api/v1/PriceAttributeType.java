package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: Type of money attribute.
 */
public enum PriceAttributeType {
    DELIVERY, DISCOUNT, FEE, GRATUITY, REGULAR, SUBTOTAL, TAX, TOTAL, TYPE_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DELIVERY: return "DELIVERY";
            case DISCOUNT: return "DISCOUNT";
            case FEE: return "FEE";
            case GRATUITY: return "GRATUITY";
            case REGULAR: return "REGULAR";
            case SUBTOTAL: return "SUBTOTAL";
            case TAX: return "TAX";
            case TOTAL: return "TOTAL";
            case TYPE_UNSPECIFIED: return "TYPE_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static PriceAttributeType forValue(String value) throws IOException {
        if (value.equals("DELIVERY")) return DELIVERY;
        if (value.equals("DISCOUNT")) return DISCOUNT;
        if (value.equals("FEE")) return FEE;
        if (value.equals("GRATUITY")) return GRATUITY;
        if (value.equals("REGULAR")) return REGULAR;
        if (value.equals("SUBTOTAL")) return SUBTOTAL;
        if (value.equals("TAX")) return TAX;
        if (value.equals("TOTAL")) return TOTAL;
        if (value.equals("TYPE_UNSPECIFIED")) return TYPE_UNSPECIFIED;
        throw new IOException("Cannot deserialize PriceAttributeType");
    }
}
