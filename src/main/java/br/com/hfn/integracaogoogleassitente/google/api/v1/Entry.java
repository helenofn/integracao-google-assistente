package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Represents a entry for a synonym type.
 */
@lombok.Data
public class Entry {
    @lombok.Getter(onMethod_ = {@JsonProperty("display")})
    @lombok.Setter(onMethod_ = {@JsonProperty("display")})
    private EntryDisplay display;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("synonyms")})
    @lombok.Setter(onMethod_ = {@JsonProperty("synonyms")})
    private List<String> synonyms;
}
