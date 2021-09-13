package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Unit: Example POUND, GRAM.
 */
public enum Unit {
    GRAM, KILOGRAM, MILLIGRAM, OUNCE, POUND, UNIT_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GRAM: return "GRAM";
            case KILOGRAM: return "KILOGRAM";
            case MILLIGRAM: return "MILLIGRAM";
            case OUNCE: return "OUNCE";
            case POUND: return "POUND";
            case UNIT_UNSPECIFIED: return "UNIT_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static Unit forValue(String value) throws IOException {
        if (value.equals("GRAM")) return GRAM;
        if (value.equals("KILOGRAM")) return KILOGRAM;
        if (value.equals("MILLIGRAM")) return MILLIGRAM;
        if (value.equals("OUNCE")) return OUNCE;
        if (value.equals("POUND")) return POUND;
        if (value.equals("UNIT_UNSPECIFIED")) return UNIT_UNSPECIFIED;
        throw new IOException("Cannot deserialize Unit");
    }
}
