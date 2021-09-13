package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Repeat mode for the list of Media Objects.
 */
public enum RepeatMode {
    ALL, OFF, REPEAT_MODE_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ALL: return "ALL";
            case OFF: return "OFF";
            case REPEAT_MODE_UNSPECIFIED: return "REPEAT_MODE_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static RepeatMode forValue(String value) throws IOException {
        if (value.equals("ALL")) return ALL;
        if (value.equals("OFF")) return OFF;
        if (value.equals("REPEAT_MODE_UNSPECIFIED")) return REPEAT_MODE_UNSPECIFIED;
        throw new IOException("Cannot deserialize RepeatMode");
    }
}
