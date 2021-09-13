package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Represents a single media object
 */
@lombok.Data
public class MediaObject {
    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    @lombok.Setter(onMethod_ = {@JsonProperty("description")})
    private String description;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private MediaImage image;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
}
