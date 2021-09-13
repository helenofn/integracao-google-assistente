package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: State of the price: Estimate vs Actual.
 */
public enum State {
    ACTUAL, ESTIMATE, STATE_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACTUAL: return "ACTUAL";
            case ESTIMATE: return "ESTIMATE";
            case STATE_UNSPECIFIED: return "STATE_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static State forValue(String value) throws IOException {
        if (value.equals("ACTUAL")) return ACTUAL;
        if (value.equals("ESTIMATE")) return ESTIMATE;
        if (value.equals("STATE_UNSPECIFIED")) return STATE_UNSPECIFIED;
        throw new IOException("Cannot deserialize State");
    }
}
