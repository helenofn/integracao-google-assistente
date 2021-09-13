package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Optional Action responds with an OrderUpdate after receiving the order during the
 * transactions flow. On receipt of this, Google records this update to the order, and if
 * successful, displays a receipt card along with the TTS sent on display devices.
 *
 * Update to an order.
 */
@lombok.Data
public class OrderUpdate {
    @lombok.Getter(onMethod_ = {@JsonProperty("order")})
    @lombok.Setter(onMethod_ = {@JsonProperty("order")})
    private Order order;
    @lombok.Getter(onMethod_ = {@JsonProperty("reason")})
    @lombok.Setter(onMethod_ = {@JsonProperty("reason")})
    private String reason;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private OrderUpdateType type;
    @lombok.Getter(onMethod_ = {@JsonProperty("updateMask")})
    @lombok.Setter(onMethod_ = {@JsonProperty("updateMask")})
    private String updateMask;
    @lombok.Getter(onMethod_ = {@JsonProperty("userNotification")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userNotification")})
    private UserNotification userNotification;
}
