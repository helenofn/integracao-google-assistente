package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Required. Information to fulfillment on how to handle the request. For example a request
 * intending to get a fact might have a handler with a name of "getFact".
 *
 * Represents a fulfillment handler that maps event information from Actions on Google to
 * fulfillment. Use the handler name to determine what code you should run in fulfillment.
 * For instance, a handler might be used to get information on a user's order information
 * with a handler name like "OrderLookup" while another might get product information from a
 * database, with a handler name like "GetProductInfo".
 */
@lombok.Data
public class Handler {
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
}
