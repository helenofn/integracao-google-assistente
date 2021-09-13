package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Type of the event character, e.g. actor or director.
 */
public enum EventCharacterType {
    ACTOR, DIRECTOR, ORGANIZER, PERFORMER, TYPE_UNKNOWN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACTOR: return "ACTOR";
            case DIRECTOR: return "DIRECTOR";
            case ORGANIZER: return "ORGANIZER";
            case PERFORMER: return "PERFORMER";
            case TYPE_UNKNOWN: return "TYPE_UNKNOWN";
        }
        return null;
    }

    @JsonCreator
    public static EventCharacterType forValue(String value) throws IOException {
        if (value.equals("ACTOR")) return ACTOR;
        if (value.equals("DIRECTOR")) return DIRECTOR;
        if (value.equals("ORGANIZER")) return ORGANIZER;
        if (value.equals("PERFORMER")) return PERFORMER;
        if (value.equals("TYPE_UNKNOWN")) return TYPE_UNKNOWN;
        throw new IOException("Cannot deserialize EventCharacterType");
    }
}
