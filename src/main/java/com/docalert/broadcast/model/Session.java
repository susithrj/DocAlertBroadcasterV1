package com.docalert.broadcast.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Session {

    private String ssnId = "1";
    private String currToken = "0";
}
