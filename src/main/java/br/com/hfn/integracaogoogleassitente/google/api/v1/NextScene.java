package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Optional. Information on the scene to be executed next.
 *
 * Represents the scene to be executed next.
 */
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class NextScene {
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
}
