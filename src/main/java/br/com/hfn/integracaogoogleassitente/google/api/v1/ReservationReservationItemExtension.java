package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Reservation orders like restaurant, haircut etc.
 *
 * Line item contents for reservation orders like restaurant, haircut etc.
 */
@lombok.Data
public class ReservationReservationItemExtension {
    @lombok.Getter(onMethod_ = {@JsonProperty("confirmationCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("confirmationCode")})
    private String confirmationCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("location")})
    @lombok.Setter(onMethod_ = {@JsonProperty("location")})
    private V2Location location;
    @lombok.Getter(onMethod_ = {@JsonProperty("partySize")})
    @lombok.Setter(onMethod_ = {@JsonProperty("partySize")})
    private Long partySize;
    @lombok.Getter(onMethod_ = {@JsonProperty("reservationTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("reservationTime")})
    private Time reservationTime;
    @lombok.Getter(onMethod_ = {@JsonProperty("staffFacilitators")})
    @lombok.Setter(onMethod_ = {@JsonProperty("staffFacilitators")})
    private List<ReservationStaffFacilitator> staffFacilitators;
    @lombok.Getter(onMethod_ = {@JsonProperty("status")})
    @lombok.Setter(onMethod_ = {@JsonProperty("status")})
    private ReservationStatus status;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private ReservationType type;
    @lombok.Getter(onMethod_ = {@JsonProperty("userAcceptableTimeRange")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userAcceptableTimeRange")})
    private Time userAcceptableTimeRange;
    @lombok.Getter(onMethod_ = {@JsonProperty("userVisibleStatusLabel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("userVisibleStatusLabel")})
    private String userVisibleStatusLabel;
}
