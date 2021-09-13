package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * A text link that should be substituted into the template.
 */
@lombok.Data
public class TextLink {
    @lombok.Getter(onMethod_ = {@JsonProperty("displayText")})
    @lombok.Setter(onMethod_ = {@JsonProperty("displayText")})
    private String displayText;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
}
