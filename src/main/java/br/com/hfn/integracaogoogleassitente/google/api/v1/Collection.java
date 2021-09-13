package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A card presenting a collection of options to select from.
 *
 * A card for presenting a collection of options to select from.
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Collection {
    @lombok.Getter(onMethod_ = {@JsonProperty("imageFill")})
    @lombok.Setter(onMethod_ = {@JsonProperty("imageFill")})
    private ImageFill imageFill;
    @lombok.Getter(onMethod_ = {@JsonProperty("items")})
    @lombok.Setter(onMethod_ = {@JsonProperty("items")})
    private List<CollectionItem> items;
    @lombok.Getter(onMethod_ = {@JsonProperty("subtitle")})
    @lombok.Setter(onMethod_ = {@JsonProperty("subtitle")})
    private String subtitle;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
}
