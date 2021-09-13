package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Indicates a hint for the url type.
 */
public enum Hint {
    AMP, LINK_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AMP: return "AMP";
            case LINK_UNSPECIFIED: return "LINK_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static Hint forValue(String value) throws IOException {
        if (value.equals("AMP")) return AMP;
        if (value.equals("LINK_UNSPECIFIED")) return LINK_UNSPECIFIED;
        throw new IOException("Cannot deserialize Hint");
    }
}
