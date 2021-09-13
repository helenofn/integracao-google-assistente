package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Represents a type with synonyms.
 */
@lombok.Data
public class SynonymType {
    @lombok.Getter(onMethod_ = {@JsonProperty("entries")})
    @lombok.Setter(onMethod_ = {@JsonProperty("entries")})
    private List<Entry> entries;
}
