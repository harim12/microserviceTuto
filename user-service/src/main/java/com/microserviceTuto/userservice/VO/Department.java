package com.microserviceTuto.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Long departementId;
    private String departementName;
    private String DepartementDescription;
    private String departementCode;

}
