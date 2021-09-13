package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Contains context information about current active media session.
 */
@lombok.Data
public class MediaContext {
    @lombok.Getter(onMethod_ = {@JsonProperty("index")})
    @lombok.Setter(onMethod_ = {@JsonProperty("index")})
    private Long index;
    @lombok.Getter(onMethod_ = {@JsonProperty("progress")})
    @lombok.Setter(onMethod_ = {@JsonProperty("progress")})
    private String progress;
}
