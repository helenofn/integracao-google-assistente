package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * Required. User who initiated the conversation.
 *
 * Represents the user making a request to the Action.
 *
 * Optional. Use to specify user parameters to send back.
 */
@lombok.Data
public class User {
    @lombok.Getter(onMethod_ = {@JsonProperty("accountLinkingStatus")})
    @lombok.Setter(onMethod_ = {@JsonProperty("accountLinkingStatus")})
    private AccountLinkingStatus accountLinkingStatus;
    @lombok.Getter(onMethod_ = {@JsonProperty("engagement")})
    @lombok.Setter(onMethod_ = {@JsonProperty("engagement")})
    private Engagement engagement;
    @lombok.Getter(onMethod_ = {@JsonProperty("lastSeenTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("lastSeenTime")})
    private String lastSeenTime;
    @lombok.Getter(onMethod_ = {@JsonProperty("locale")})
    @lombok.Setter(onMethod_ = {@JsonProperty("locale")})
    private String locale;
    @lombok.Getter(onMethod_ = {@JsonProperty("packageEntitlements")})
    @lombok.Setter(onMethod_ = {@JsonProperty("packageEntitlements")})
    private List<PackageEntitlements> packageEntitlements;
    @lombok.Getter(onMethod_ = {@JsonProperty("params")})
    @lombok.Setter(onMethod_ = {@JsonProperty("params")})
    private Map<String, Object> params;
    @lombok.Getter(onMethod_ = {@JsonProperty("permissions")})
    @lombok.Setter(onMethod_ = {@JsonProperty("permissions")})
    private List<Permission> permissions;
    @lombok.Getter(onMethod_ = {@JsonProperty("verificationStatus")})
    @lombok.Setter(onMethod_ = {@JsonProperty("verificationStatus")})
    private VerificationStatus verificationStatus;
}
