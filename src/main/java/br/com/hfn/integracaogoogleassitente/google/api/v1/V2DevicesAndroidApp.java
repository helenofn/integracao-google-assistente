package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Information about the Android App if the URL is expected to be fulfilled by an Android
 * App.
 *
 * Specification of the Android App for fulfillment restrictions
 */
@lombok.Data
public class V2DevicesAndroidApp {
    @lombok.Getter(onMethod_ = {@JsonProperty("packageName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("packageName")})
    private String packageName;
    @lombok.Getter(onMethod_ = {@JsonProperty("versions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("versions")})
    private List<V2DevicesVersionFilter> versions;
}
