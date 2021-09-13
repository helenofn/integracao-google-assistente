package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Horizontal alignment of content w.r.t column. If unspecified, content will be aligned to
 * the leading edge.
 */
public enum Align {
    CENTER, LEADING, TRAILING, UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CENTER: return "CENTER";
            case LEADING: return "LEADING";
            case TRAILING: return "TRAILING";
            case UNSPECIFIED: return "UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static Align forValue(String value) throws IOException {
        if (value.equals("CENTER")) return CENTER;
        if (value.equals("LEADING")) return LEADING;
        if (value.equals("TRAILING")) return TRAILING;
        if (value.equals("UNSPECIFIED")) return UNSPECIFIED;
        throw new IOException("Cannot deserialize Align");
    }
}
