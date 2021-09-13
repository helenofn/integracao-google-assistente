package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: The type of fulfillment.
 */
public enum FulfillmentType {
    DELIVERY, PICKUP, TYPE_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DELIVERY: return "DELIVERY";
            case PICKUP: return "PICKUP";
            case TYPE_UNSPECIFIED: return "TYPE_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static FulfillmentType forValue(String value) throws IOException {
        if (value.equals("DELIVERY")) return DELIVERY;
        if (value.equals("PICKUP")) return PICKUP;
        if (value.equals("TYPE_UNSPECIFIED")) return TYPE_UNSPECIFIED;
        throw new IOException("Cannot deserialize FulfillmentType");
    }
}
