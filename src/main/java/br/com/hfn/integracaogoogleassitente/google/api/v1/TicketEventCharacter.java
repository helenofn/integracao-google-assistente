package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * One event character, e.g. organizer, performer etc.
 */
@lombok.Data
public class TicketEventCharacter {
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private V2UIElementsImage image;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private EventCharacterType type;
}
