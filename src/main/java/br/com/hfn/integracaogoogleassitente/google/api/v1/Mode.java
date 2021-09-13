package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required. How this type should be merged with other type values.
 */
public enum Mode {
    TYPE_MERGE, TYPE_REPLACE, TYPE_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case TYPE_MERGE: return "TYPE_MERGE";
            case TYPE_REPLACE: return "TYPE_REPLACE";
            case TYPE_UNSPECIFIED: return "TYPE_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static Mode forValue(String value) throws IOException {
        if (value.equals("TYPE_MERGE")) return TYPE_MERGE;
        if (value.equals("TYPE_REPLACE")) return TYPE_REPLACE;
        if (value.equals("TYPE_UNSPECIFIED")) return TYPE_UNSPECIFIED;
        throw new IOException("Cannot deserialize Mode");
    }
}
