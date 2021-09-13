package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Indicates a hint for the url type.
 */
public enum URLTypeHint {
    AMP_CONTENT, URL_TYPE_HINT_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AMP_CONTENT: return "AMP_CONTENT";
            case URL_TYPE_HINT_UNSPECIFIED: return "URL_TYPE_HINT_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static URLTypeHint forValue(String value) throws IOException {
        if (value.equals("AMP_CONTENT")) return AMP_CONTENT;
        if (value.equals("URL_TYPE_HINT_UNSPECIFIED")) return URL_TYPE_HINT_UNSPECIFIED;
        throw new IOException("Cannot deserialize URLTypeHint");
    }
}
