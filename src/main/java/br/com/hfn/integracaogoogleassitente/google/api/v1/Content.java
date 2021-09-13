package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Optional. A content like a card, list or media to display to the user.
 */
@lombok.Data
public class Content {
    @lombok.Getter(onMethod_ = {@JsonProperty("card")})
    @lombok.Setter(onMethod_ = {@JsonProperty("card")})
    private Card card;
    @lombok.Getter(onMethod_ = {@JsonProperty("collection")})
    @lombok.Setter(onMethod_ = {@JsonProperty("collection")})
    private Collection collection;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private Image image;
    @lombok.Getter(onMethod_ = {@JsonProperty("list")})
    @lombok.Setter(onMethod_ = {@JsonProperty("list")})
    private GAList list;
    @lombok.Getter(onMethod_ = {@JsonProperty("media")})
    @lombok.Setter(onMethod_ = {@JsonProperty("media")})
    private Media media;
    @lombok.Getter(onMethod_ = {@JsonProperty("table")})
    @lombok.Setter(onMethod_ = {@JsonProperty("table")})
    private Table table;
}
