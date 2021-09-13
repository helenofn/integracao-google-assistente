package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Required. Represents the last matched intent.
 *
 * Represents an intent.
 */
@lombok.Data
public class Intent {
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("params")})
    @lombok.Setter(onMethod_ = {@JsonProperty("params")})
    private Map<String, Object> params;
    @lombok.Getter(onMethod_ = {@JsonProperty("query")})
    @lombok.Setter(onMethod_ = {@JsonProperty("query")})
    private String query;
}
