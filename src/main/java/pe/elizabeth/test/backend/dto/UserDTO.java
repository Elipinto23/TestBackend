package pe.elizabeth.test.backend.dto;

import lombok.Getter;
import lombok.Setter;
import pe.elizabeth.test.backend.enums.GenderEmun;

@Getter
@Setter
public class UserDTO {
    private Integer id;
    private String name;
    private GenderEmun gender;
}
