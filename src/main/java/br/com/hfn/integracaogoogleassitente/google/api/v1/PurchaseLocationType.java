package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Location of the purchase (in-store / online)
 */
public enum PurchaseLocationType {
    INSTORE_PURCHASE, ONLINE_PURCHASE, UNSPECIFIED_LOCATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INSTORE_PURCHASE: return "INSTORE_PURCHASE";
            case ONLINE_PURCHASE: return "ONLINE_PURCHASE";
            case UNSPECIFIED_LOCATION: return "UNSPECIFIED_LOCATION";
        }
        return null;
    }

    @JsonCreator
    public static PurchaseLocationType forValue(String value) throws IOException {
        if (value.equals("INSTORE_PURCHASE")) return INSTORE_PURCHASE;
        if (value.equals("ONLINE_PURCHASE")) return ONLINE_PURCHASE;
        if (value.equals("UNSPECIFIED_LOCATION")) return UNSPECIFIED_LOCATION;
        throw new IOException("Cannot deserialize PurchaseLocationType");
    }
}
