package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata associated with an action.
 *
 * Related Metadata per action.
 */
@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class ActionMetadata {
    @lombok.Getter(onMethod_ = {@JsonProperty("expireTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("expireTime")})
    private String expireTime;
}
