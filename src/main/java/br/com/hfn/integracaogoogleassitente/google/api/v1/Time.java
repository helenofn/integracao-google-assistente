package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * A window if a time-range is specified or ETA if single time specified. Expected delivery
 * or pickup time.
 *
 * Time construct to represent time of an event to use when displaying an order to the
 * user.
 *
 * A window if a time-range is specified or ETA if single time specified. Expected time to
 * prepare the food. Single-time preferred.
 *
 * Time when the service/event is scheduled to occur. Can be a time range, a date, or an
 * exact date time.
 *
 * Time range that is acceptable to the user.
 *
 * Entry time, which might be different from the event start time. e.g. the event starts at
 * 9am, but entry time is 8:30am.
 *
 * End time.
 *
 * Start time.
 */
@lombok.Data
public class Time {
    @lombok.Getter(onMethod_ = {@JsonProperty("timeIso8601")})
    @lombok.Setter(onMethod_ = {@JsonProperty("timeIso8601")})
    private String timeIso8601;
}
