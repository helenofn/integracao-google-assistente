package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Represents an override for a type.
 */
@lombok.Data
public class TypeOverride {
    @lombok.Getter(onMethod_ = {@JsonProperty("mode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("mode")})
    private Mode mode;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("synonym")})
    @lombok.Setter(onMethod_ = {@JsonProperty("synonym")})
    private SynonymType synonym;
}
