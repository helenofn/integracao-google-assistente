package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * A List of user's entitlements related to a package name.
 */
@lombok.Data
public class PackageEntitlements {
    @lombok.Getter(onMethod_ = {@JsonProperty("entitlements")})
    @lombok.Setter(onMethod_ = {@JsonProperty("entitlements")})
    private List<Entitlement> entitlements;
    @lombok.Getter(onMethod_ = {@JsonProperty("packageName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("packageName")})
    private String packageName;
}
