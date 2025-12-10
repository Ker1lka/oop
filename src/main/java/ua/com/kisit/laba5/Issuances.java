package ua.com.kisit.laba5;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Issuances {
    private Long id;
    private Address address;
    private String name;
}
