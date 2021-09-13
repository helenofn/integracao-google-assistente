package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required. The current status of slot filling. This field is read-only.
 */
public enum SlotFillingStatus {
    COLLECTING, FINAL, FINALIZING, INITIALIZED, UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COLLECTING: return "COLLECTING";
            case FINAL: return "FINAL";
            case FINALIZING: return "FINALIZING";
            case INITIALIZED: return "INITIALIZED";
            case UNSPECIFIED: return "UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static SlotFillingStatus forValue(String value) throws IOException {
        if (value.equals("COLLECTING")) return COLLECTING;
        if (value.equals("FINAL")) return FINAL;
        if (value.equals("FINALIZING")) return FINALIZING;
        if (value.equals("INITIALIZED")) return INITIALIZED;
        if (value.equals("UNSPECIFIED")) return UNSPECIFIED;
        throw new IOException("Cannot deserialize SlotFillingStatus");
    }
}
