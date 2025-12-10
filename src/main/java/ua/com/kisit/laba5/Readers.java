package ua.com.kisit.laba5;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Readers {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private List<Address> address;

    private Users user;
}
