package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OptionalMediaControl {
    OPTIONAL_MEDIA_CONTROLS_UNSPECIFIED, PAUSED, STOPPED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case OPTIONAL_MEDIA_CONTROLS_UNSPECIFIED: return "OPTIONAL_MEDIA_CONTROLS_UNSPECIFIED";
            case PAUSED: return "PAUSED";
            case STOPPED: return "STOPPED";
        }
        return null;
    }

    @JsonCreator
    public static OptionalMediaControl forValue(String value) throws IOException {
        if (value.equals("OPTIONAL_MEDIA_CONTROLS_UNSPECIFIED")) return OPTIONAL_MEDIA_CONTROLS_UNSPECIFIED;
        if (value.equals("PAUSED")) return PAUSED;
        if (value.equals("STOPPED")) return STOPPED;
        throw new IOException("Cannot deserialize OptionalMediaControl");
    }
}
