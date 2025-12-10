package ua.com.kisit.laba5;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Users {
    private Long id;
    private String login;
    private String password;

    private Set<Roles> roles;
}
