package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: Type of purchase.
 */
public enum PurchaseType {
    FOOD, GROCERY, MOBILE_RECHARGE, PURCHASE_TYPE_UNSPECIFIED, RETAIL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FOOD: return "FOOD";
            case GROCERY: return "GROCERY";
            case MOBILE_RECHARGE: return "MOBILE_RECHARGE";
            case PURCHASE_TYPE_UNSPECIFIED: return "PURCHASE_TYPE_UNSPECIFIED";
            case RETAIL: return "RETAIL";
        }
        return null;
    }

    @JsonCreator
    public static PurchaseType forValue(String value) throws IOException {
        if (value.equals("FOOD")) return FOOD;
        if (value.equals("GROCERY")) return GROCERY;
        if (value.equals("MOBILE_RECHARGE")) return MOBILE_RECHARGE;
        if (value.equals("PURCHASE_TYPE_UNSPECIFIED")) return PURCHASE_TYPE_UNSPECIFIED;
        if (value.equals("RETAIL")) return RETAIL;
        throw new IOException("Cannot deserialize PurchaseType");
    }
}
