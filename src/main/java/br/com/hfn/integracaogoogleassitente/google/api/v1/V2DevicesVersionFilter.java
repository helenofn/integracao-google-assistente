package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * VersionFilter should be included if specific version/s of the App are required.
 */
@lombok.Data
public class V2DevicesVersionFilter {
    @lombok.Getter(onMethod_ = {@JsonProperty("maxVersion")})
    @lombok.Setter(onMethod_ = {@JsonProperty("maxVersion")})
    private Long maxVersion;
    @lombok.Getter(onMethod_ = {@JsonProperty("minVersion")})
    @lombok.Setter(onMethod_ = {@JsonProperty("minVersion")})
    private Long minVersion;
}
