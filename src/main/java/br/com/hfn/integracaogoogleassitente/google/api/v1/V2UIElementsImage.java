package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Small image associated with this item, if any.
 *
 * An image displayed in the card.
 *
 * The image associated with the merchant.
 *
 * URL to a photo of the vehicle. The photo will be displayed at approximately 256x256px.
 * Must be a jpg or png. Optional.
 *
 * Performer's images.
 *
 * Image associated with the order.
 *
 * Character's images.
 */
@lombok.Data
public class V2UIElementsImage {
    @lombok.Getter(onMethod_ = {@JsonProperty("accessibilityText")})
    @lombok.Setter(onMethod_ = {@JsonProperty("accessibilityText")})
    private String accessibilityText;
    @lombok.Getter(onMethod_ = {@JsonProperty("height")})
    @lombok.Setter(onMethod_ = {@JsonProperty("height")})
    private Long height;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
    @lombok.Getter(onMethod_ = {@JsonProperty("width")})
    @lombok.Setter(onMethod_ = {@JsonProperty("width")})
    private Long width;
}
