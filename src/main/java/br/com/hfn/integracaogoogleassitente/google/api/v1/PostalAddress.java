package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Postal address. Requires the [DEVICE_PRECISE_LOCATION] or [DEVICE_COARSE_LOCATION]
 * permission. When the coarse location permission is granted, only the 'postal_code' and
 * 'locality' fields are expected to be populated. Precise location permission will populate
 * additional fields like 'administrative_area' and 'address_lines'.
 *
 * Represents a postal address, e.g. for postal delivery or payments addresses. Given a
 * postal address, a postal service can deliver items to a premise, P.O. Box or similar. It
 * is not intended to model geographical locations (roads, towns, mountains). In typical
 * usage an address would be created via user input or from importing existing data,
 * depending on the type of process. Advice on address input / editing: - Use an i18n-ready
 * address widget such as https://github.com/google/libaddressinput) - Users should not be
 * presented with UI elements for input or editing of fields outside countries where that
 * field is used. For more guidance on how to use this schema, please see:
 * https://support.google.com/business/answer/6397478
 *
 * Postal address. Requires the DEVICE_PRECISE_LOCATION or DEVICE_COARSE_LOCATION permission.
 */
@lombok.Data
public class PostalAddress {
    @lombok.Getter(onMethod_ = {@JsonProperty("addressLines")})
    @lombok.Setter(onMethod_ = {@JsonProperty("addressLines")})
    private List<String> addressLines;
    @lombok.Getter(onMethod_ = {@JsonProperty("administrativeArea")})
    @lombok.Setter(onMethod_ = {@JsonProperty("administrativeArea")})
    private String administrativeArea;
    @lombok.Getter(onMethod_ = {@JsonProperty("languageCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("languageCode")})
    private String languageCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("locality")})
    @lombok.Setter(onMethod_ = {@JsonProperty("locality")})
    private String locality;
    @lombok.Getter(onMethod_ = {@JsonProperty("organization")})
    @lombok.Setter(onMethod_ = {@JsonProperty("organization")})
    private String organization;
    @lombok.Getter(onMethod_ = {@JsonProperty("postalCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("postalCode")})
    private String postalCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("recipients")})
    @lombok.Setter(onMethod_ = {@JsonProperty("recipients")})
    private List<String> recipients;
    @lombok.Getter(onMethod_ = {@JsonProperty("regionCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("regionCode")})
    private String regionCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("revision")})
    @lombok.Setter(onMethod_ = {@JsonProperty("revision")})
    private Long revision;
    @lombok.Getter(onMethod_ = {@JsonProperty("sortingCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("sortingCode")})
    private String sortingCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("sublocality")})
    @lombok.Setter(onMethod_ = {@JsonProperty("sublocality")})
    private String sublocality;
}
