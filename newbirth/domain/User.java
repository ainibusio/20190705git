package cn.beyond.newbirth.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String address;
    private Integer hours;//工作时长;
    private String company;

}
