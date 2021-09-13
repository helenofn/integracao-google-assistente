package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Presentation requirement of the disclosure.
 */
public enum PresentationRequirement {
    REQUIREMENT_OPTIONAL, REQUIREMENT_REQUIRED, REQUIREMENT_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case REQUIREMENT_OPTIONAL: return "REQUIREMENT_OPTIONAL";
            case REQUIREMENT_REQUIRED: return "REQUIREMENT_REQUIRED";
            case REQUIREMENT_UNSPECIFIED: return "REQUIREMENT_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static PresentationRequirement forValue(String value) throws IOException {
        if (value.equals("REQUIREMENT_OPTIONAL")) return REQUIREMENT_OPTIONAL;
        if (value.equals("REQUIREMENT_REQUIRED")) return REQUIREMENT_REQUIRED;
        if (value.equals("REQUIREMENT_UNSPECIFIED")) return REQUIREMENT_UNSPECIFIED;
        throw new IOException("Cannot deserialize PresentationRequirement");
    }
}
