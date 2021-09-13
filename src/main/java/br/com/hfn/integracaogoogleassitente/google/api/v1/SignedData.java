package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

/**
 * Only present for in-app purchase and in-app subs.
 */
@lombok.Data
public class SignedData {
    @lombok.Getter(onMethod_ = {@JsonProperty("inAppDataSignature")})
    @lombok.Setter(onMethod_ = {@JsonProperty("inAppDataSignature")})
    private String inAppDataSignature;
    @lombok.Getter(onMethod_ = {@JsonProperty("inAppPurchaseData")})
    @lombok.Setter(onMethod_ = {@JsonProperty("inAppPurchaseData")})
    private Map<String, Object> inAppPurchaseData;
}
