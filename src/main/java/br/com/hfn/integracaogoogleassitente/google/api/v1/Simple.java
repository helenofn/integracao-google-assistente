package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Optional. The first voice and text-only response.
 *
 * Represents a simple prompt to be send to a user.
 *
 * Optional. The last voice and text-only response.
 */
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Simple {
    @lombok.Getter(onMethod_ = {@JsonProperty("speech")})
    @lombok.Setter(onMethod_ = {@JsonProperty("speech")})
    private String speech;
    @lombok.Getter(onMethod_ = {@JsonProperty("text")})
    @lombok.Setter(onMethod_ = {@JsonProperty("text")})
    private String text;
}
