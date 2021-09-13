package br.com.hfn.integracaogoogleassitente.google.api.v1;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Describes a row in the table.
 */
@lombok.Data
public class TableRow {
    @lombok.Getter(onMethod_ = {@JsonProperty("cells")})
    @lombok.Setter(onMethod_ = {@JsonProperty("cells")})
    private List<TableCell> cells;
    @lombok.Getter(onMethod_ = {@JsonProperty("divider")})
    @lombok.Setter(onMethod_ = {@JsonProperty("divider")})
    private Boolean divider;
}
