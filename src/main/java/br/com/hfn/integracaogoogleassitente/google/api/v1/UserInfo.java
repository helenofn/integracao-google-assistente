package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Info about the buyer.
 *
 * Information about user. This is used to represent information of the user associated with
 * an order.
 *
 * User contact for this fulfillment.
 */
@lombok.Data
public class UserInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("displayName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("displayName")})
    private String displayName;
    @lombok.Getter(onMethod_ = {@JsonProperty("email")})
    @lombok.Setter(onMethod_ = {@JsonProperty("email")})
    private String email;
    @lombok.Getter(onMethod_ = {@JsonProperty("firstName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("firstName")})
    private String firstName;
    @lombok.Getter(onMethod_ = {@JsonProperty("lastName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("lastName")})
    private String lastName;
    @lombok.Getter(onMethod_ = {@JsonProperty("phoneNumbers")})
    @lombok.Setter(onMethod_ = {@JsonProperty("phoneNumbers")})
    private List<PhoneNumber> phoneNumbers;
}
