package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * The event applied to all line item tickets.
 *
 * Represents a single event.
 */
@lombok.Data
public class TicketTicketEvent {
    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    @lombok.Setter(onMethod_ = {@JsonProperty("description")})
    private String description;
    @lombok.Getter(onMethod_ = {@JsonProperty("doorTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("doorTime")})
    private Time doorTime;
    @lombok.Getter(onMethod_ = {@JsonProperty("endDate")})
    @lombok.Setter(onMethod_ = {@JsonProperty("endDate")})
    private Time endDate;
    @lombok.Getter(onMethod_ = {@JsonProperty("eventCharacters")})
    @lombok.Setter(onMethod_ = {@JsonProperty("eventCharacters")})
    private List<TicketEventCharacter> eventCharacters;
    @lombok.Getter(onMethod_ = {@JsonProperty("location")})
    @lombok.Setter(onMethod_ = {@JsonProperty("location")})
    private V2Location location;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("startDate")})
    @lombok.Setter(onMethod_ = {@JsonProperty("startDate")})
    private Time startDate;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private TicketEventType type;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
}
