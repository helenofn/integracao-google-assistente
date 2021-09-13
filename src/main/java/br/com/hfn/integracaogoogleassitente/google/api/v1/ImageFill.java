package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * How the image background will be filled. Optional.
 *
 * How the image backgrounds of collection items will be filled. Optional.
 */
public enum ImageFill {
    CROPPED, GRAY, UNSPECIFIED, WHITE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CROPPED: return "CROPPED";
            case GRAY: return "GRAY";
            case UNSPECIFIED: return "UNSPECIFIED";
            case WHITE: return "WHITE";
        }
        return null;
    }

    @JsonCreator
    public static ImageFill forValue(String value) throws IOException {
        if (value.equals("CROPPED")) return CROPPED;
        if (value.equals("GRAY")) return GRAY;
        if (value.equals("UNSPECIFIED")) return UNSPECIFIED;
        if (value.equals("WHITE")) return WHITE;
        throw new IOException("Cannot deserialize ImageFill");
    }
}
