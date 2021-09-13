package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Image to show with the media card.
 */
@lombok.Data
public class MediaImage {
    @lombok.Getter(onMethod_ = {@JsonProperty("icon")})
    @lombok.Setter(onMethod_ = {@JsonProperty("icon")})
    private Image icon;
    @lombok.Getter(onMethod_ = {@JsonProperty("large")})
    @lombok.Setter(onMethod_ = {@JsonProperty("large")})
    private Image large;
}
