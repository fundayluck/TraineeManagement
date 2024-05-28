package com.paradigm.tech.app.model.entityDTO.response.BDClient;

import com.paradigm.tech.app.model.entityDTO.response.BDDetail.ResponseBDProfileUpdateDTO;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ResponseBDClientGetAllAvailDTO {
    private String bdClientId;
    private String clientName;
    private String clientAddress;
    private String clientEmail;
    private ResponseBDProfileUpdateDTO bdDetail;
}
