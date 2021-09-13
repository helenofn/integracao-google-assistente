package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * If specified, displays a notification to the user with the specified title and text.
 * Specifying a notification is a suggestion to notify and is not guaranteed to result in a
 * notification.
 *
 * Optional user notification to display as part of the Order update.
 */
@lombok.Data
public class UserNotification {
    @lombok.Getter(onMethod_ = {@JsonProperty("text")})
    @lombok.Setter(onMethod_ = {@JsonProperty("text")})
    private String text;
    @lombok.Getter(onMethod_ = {@JsonProperty("title")})
    @lombok.Setter(onMethod_ = {@JsonProperty("title")})
    private String title;
}
