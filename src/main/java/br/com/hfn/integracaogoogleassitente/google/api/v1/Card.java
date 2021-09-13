package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A basic card.
 *
 * A basic card for displaying some information, e.g. an image and/or text.
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Card {
    @lombok.Getter(onMethod_ = {@JsonProperty("button")})
    @lombok.Setter(onMethod_ = {@JsonProperty("button")})
    private Link button;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private Image image;
    @lombok.Getter(onMethod_ = {@JsonProperty("imageFill")})
    @lombok.Setter(onMethod_ = {@JsonProperty("imageFill")})
    private ImageFill imageFill;
    @lombok.Getter(onMethod_ = {@JsonProperty("subtitle")})
    @lombok.Setter(onMethod_ = {@JsonProperty("subtitle")})
    private String subtitle;
    @lombok.Getter(onMethod_ = {@JsonProperty("text")})
    @lombok.Setter(onMethod_ = {@JsonProperty("text")})
    private String text;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
}
