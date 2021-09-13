package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * The engagement of the current user including any subscriptions to intents.
 *
 * Provides additional read-only information about what engagement mechanisms the current
 * user has registered for. For example, it can be useful to know what intents the user is
 * already subscribed to in order to avoid asking them to subscribe to the same intent
 * again. i.e. This information can be used to conditionally route to a scene to set up
 * DailyUpdates or PushNotifications only if the user has not subscribed already.
 */
@lombok.Data
public class Engagement {
    @lombok.Getter(onMethod_ = {@JsonProperty("dailyUpdateIntents")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dailyUpdateIntents")})
    private List<IntentSubscription> dailyUpdateIntents;
    @lombok.Getter(onMethod_ = {@JsonProperty("pushNotificationIntents")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pushNotificationIntents")})
    private List<IntentSubscription> pushNotificationIntents;
}
