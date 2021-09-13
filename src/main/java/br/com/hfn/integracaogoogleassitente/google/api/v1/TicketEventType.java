package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Required: Type of the ticket event, e.g. movie, concert.
 */
public enum TicketEventType {
    CONCERT, EVENT_TYPE_UNKNOWN, MOVIE, SPORTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONCERT: return "CONCERT";
            case EVENT_TYPE_UNKNOWN: return "EVENT_TYPE_UNKNOWN";
            case MOVIE: return "MOVIE";
            case SPORTS: return "SPORTS";
        }
        return null;
    }

    @JsonCreator
    public static TicketEventType forValue(String value) throws IOException {
        if (value.equals("CONCERT")) return CONCERT;
        if (value.equals("EVENT_TYPE_UNKNOWN")) return EVENT_TYPE_UNKNOWN;
        if (value.equals("MOVIE")) return MOVIE;
        if (value.equals("SPORTS")) return SPORTS;
        throw new IOException("Cannot deserialize TicketEventType");
    }
}
