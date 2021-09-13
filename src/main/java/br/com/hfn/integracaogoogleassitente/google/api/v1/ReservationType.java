package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Type of reservation. May be unset if none of the type options is applicable.
 */
public enum ReservationType {
    HAIRDRESSER, RESERVATION_TYPE_UNSPECIFIED, RESTAURANT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case HAIRDRESSER: return "HAIRDRESSER";
            case RESERVATION_TYPE_UNSPECIFIED: return "RESERVATION_TYPE_UNSPECIFIED";
            case RESTAURANT: return "RESTAURANT";
        }
        return null;
    }

    @JsonCreator
    public static ReservationType forValue(String value) throws IOException {
        if (value.equals("HAIRDRESSER")) return HAIRDRESSER;
        if (value.equals("RESERVATION_TYPE_UNSPECIFIED")) return RESERVATION_TYPE_UNSPECIFIED;
        if (value.equals("RESTAURANT")) return RESTAURANT;
        throw new IOException("Cannot deserialize ReservationType");
    }
}
