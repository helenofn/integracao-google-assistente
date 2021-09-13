package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Optional. The image to display.
 *
 * An image displayed in the card.
 *
 * A hero image for the card. The height is fixed to 192dp. Optional.
 *
 * An image.
 *
 * A small image icon displayed on the right from the title. It's resized to 36x36 dp.
 *
 * A large image, such as the cover of the album, etc.
 *
 * Image associated with the table. Optional.
 */
@lombok.Data
public class Image {
    @lombok.Getter(onMethod_ = {@JsonProperty("alt")})
    @lombok.Setter(onMethod_ = {@JsonProperty("alt")})
    private String alt;
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
