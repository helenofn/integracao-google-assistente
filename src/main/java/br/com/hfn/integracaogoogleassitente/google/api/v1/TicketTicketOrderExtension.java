package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;

/**
 * Ticket order
 *
 * Order contents for ticket orders like movie, sports etc.
 */
@lombok.Data
public class TicketTicketOrderExtension {
    @lombok.Getter(onMethod_ = {@JsonProperty("ticketEvent")})
    @lombok.Setter(onMethod_ = {@JsonProperty("ticketEvent")})
    private TicketTicketEvent ticketEvent;
}
