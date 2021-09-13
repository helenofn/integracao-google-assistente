package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * An item in the collection
 */
@lombok.Data
public class CollectionItem {
    @lombok.Getter(onMethod_ = {@JsonProperty("key")})
    @lombok.Setter(onMethod_ = {@JsonProperty("key")})
    private String key;
}
