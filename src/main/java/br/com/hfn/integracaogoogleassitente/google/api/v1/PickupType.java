package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Pick up method, such as INSTORE, CURBSIDE etc.
 */
public enum PickupType {
    CURBSIDE, INSTORE, UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CURBSIDE: return "CURBSIDE";
            case INSTORE: return "INSTORE";
            case UNSPECIFIED: return "UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static PickupType forValue(String value) throws IOException {
        if (value.equals("CURBSIDE")) return CURBSIDE;
        if (value.equals("INSTORE")) return INSTORE;
        if (value.equals("UNSPECIFIED")) return UNSPECIFIED;
        throw new IOException("Cannot deserialize PickupType");
    }
}
