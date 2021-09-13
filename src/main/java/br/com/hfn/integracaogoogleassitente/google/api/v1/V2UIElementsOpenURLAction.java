package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Action to take.
 *
 * Opens the given url.
 */
@lombok.Data
public class V2UIElementsOpenURLAction {
    @lombok.Getter(onMethod_ = {@JsonProperty("androidApp")})
    @lombok.Setter(onMethod_ = {@JsonProperty("androidApp")})
    private V2DevicesAndroidApp androidApp;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
    @lombok.Getter(onMethod_ = {@JsonProperty("urlTypeHint")})
    @lombok.Setter(onMethod_ = {@JsonProperty("urlTypeHint")})
    private URLTypeHint urlTypeHint;
}
