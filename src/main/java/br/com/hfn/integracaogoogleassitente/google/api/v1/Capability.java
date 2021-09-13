package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Capability {
    INTERACTIVE_CANVAS, LONG_FORM_AUDIO, RICH_RESPONSE, SPEECH, UNSPECIFIED, WEB_LINK;

    @JsonValue
    public String toValue() {
        switch (this) {
            case INTERACTIVE_CANVAS: return "INTERACTIVE_CANVAS";
            case LONG_FORM_AUDIO: return "LONG_FORM_AUDIO";
            case RICH_RESPONSE: return "RICH_RESPONSE";
            case SPEECH: return "SPEECH";
            case UNSPECIFIED: return "UNSPECIFIED";
            case WEB_LINK: return "WEB_LINK";
        }
        return null;
    }

    @JsonCreator
    public static Capability forValue(String value) throws IOException {
        if (value.equals("INTERACTIVE_CANVAS")) return INTERACTIVE_CANVAS;
        if (value.equals("LONG_FORM_AUDIO")) return LONG_FORM_AUDIO;
        if (value.equals("RICH_RESPONSE")) return RICH_RESPONSE;
        if (value.equals("SPEECH")) return SPEECH;
        if (value.equals("UNSPECIFIED")) return UNSPECIFIED;
        if (value.equals("WEB_LINK")) return WEB_LINK;
        throw new IOException("Cannot deserialize Capability");
    }
}
