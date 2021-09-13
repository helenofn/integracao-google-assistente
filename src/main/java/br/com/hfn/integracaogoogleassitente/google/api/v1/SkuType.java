package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * The type of SKU.
 */
public enum SkuType {
    APP, IN_APP, SKU_TYPE_UNSPECIFIED, SUBSCRIPTION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APP: return "APP";
            case IN_APP: return "IN_APP";
            case SKU_TYPE_UNSPECIFIED: return "SKU_TYPE_UNSPECIFIED";
            case SUBSCRIPTION: return "SUBSCRIPTION";
        }
        return null;
    }

    @JsonCreator
    public static SkuType forValue(String value) throws IOException {
        if (value.equals("APP")) return APP;
        if (value.equals("IN_APP")) return IN_APP;
        if (value.equals("SKU_TYPE_UNSPECIFIED")) return SKU_TYPE_UNSPECIFIED;
        if (value.equals("SUBSCRIPTION")) return SUBSCRIPTION;
        throw new IOException("Cannot deserialize SkuType");
    }
}
