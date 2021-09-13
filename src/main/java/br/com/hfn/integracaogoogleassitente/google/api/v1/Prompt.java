package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Optional. Represents the prompts to be sent to the user, these prompts will be appended
 * to previously added messages unless explicitly overwritten.
 *
 * Represent a response to a user.
 */
@lombok.Data
public class Prompt {
    @lombok.Getter(onMethod_ = {@JsonProperty("canvas")})
    @lombok.Setter(onMethod_ = {@JsonProperty("canvas")})
    private Canvas canvas;
    @lombok.Getter(onMethod_ = {@JsonProperty("content")})
    @lombok.Setter(onMethod_ = {@JsonProperty("content")})
    private Content content;
    @lombok.Getter(onMethod_ = {@JsonProperty("firstSimple")})
    @lombok.Setter(onMethod_ = {@JsonProperty("firstSimple")})
    private Simple firstSimple;
    @lombok.Getter(onMethod_ = {@JsonProperty("lastSimple")})
    @lombok.Setter(onMethod_ = {@JsonProperty("lastSimple")})
    private Simple lastSimple;
    @lombok.Getter(onMethod_ = {@JsonProperty("link")})
    @lombok.Setter(onMethod_ = {@JsonProperty("link")})
    private Link link;
    @lombok.Getter(onMethod_ = {@JsonProperty("orderUpdate")})
    @lombok.Setter(onMethod_ = {@JsonProperty("orderUpdate")})
    private OrderUpdate orderUpdate;
    @lombok.Getter(onMethod_ = {@JsonProperty("override")})
    @lombok.Setter(onMethod_ = {@JsonProperty("override")})
    private Boolean override;
    @lombok.Getter(onMethod_ = {@JsonProperty("suggestions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("suggestions")})
    private List<Suggestion> suggestions;
}
