package ua.com.kisit.laba5;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Address {

    private Long id;
    private String street;
    private String city;
    private String zip;
    private String country;

    private Readers reader;

}
