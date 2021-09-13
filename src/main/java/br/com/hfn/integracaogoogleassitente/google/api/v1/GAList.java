package br.com.hfn.integracaogoogleassitente.google.api.v1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A card presenting a list of options to select from.
 *
 * A card for presenting a list of options to select from.
 */
@lombok.Data
public class GAList {
    @lombok.Getter(onMethod_ = {@JsonProperty("items")})
    @lombok.Setter(onMethod_ = {@JsonProperty("items")})
    private List<ListItem> items;
    @lombok.Getter(onMethod_ = {@JsonProperty("subtitle")})
    @lombok.Setter(onMethod_ = {@JsonProperty("subtitle")})
    private String subtitle;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
}
