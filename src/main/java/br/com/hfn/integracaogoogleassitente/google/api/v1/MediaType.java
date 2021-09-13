package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MediaType {
    AUDIO, MEDIA_STATUS_ACK, MEDIA_TYPE_UNSPECIFIED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AUDIO: return "AUDIO";
            case MEDIA_STATUS_ACK: return "MEDIA_STATUS_ACK";
            case MEDIA_TYPE_UNSPECIFIED: return "MEDIA_TYPE_UNSPECIFIED";
        }
        return null;
    }

    @JsonCreator
    public static MediaType forValue(String value) throws IOException {
        if (value.equals("AUDIO")) return AUDIO;
        if (value.equals("MEDIA_STATUS_ACK")) return MEDIA_STATUS_ACK;
        if (value.equals("MEDIA_TYPE_UNSPECIFIED")) return MEDIA_TYPE_UNSPECIFIED;
        throw new IOException("Cannot deserialize MediaType");
    }
}
