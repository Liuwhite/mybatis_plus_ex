package com.white.mp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    private Long id;
    private String activityName;
    private Integer seatNumber;
    private String parentId;
}
