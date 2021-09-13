package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * URL of document associated with browsing carousel item. Required for browsing carousel.
 *
 * What happens when a user opens the link
 */
@lombok.Data
public class OpenURL {
    @lombok.Getter(onMethod_ = {@JsonProperty("hint")})
    @lombok.Setter(onMethod_ = {@JsonProperty("hint")})
    private Hint hint;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
}
