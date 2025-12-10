package ua.com.kisit.laba5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AttributesHasBook {
    private Long id;
    private Attribute attribute;
    private Books book;
}
