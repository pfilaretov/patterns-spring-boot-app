package pro.filaretov.spring.patterns.blackdots.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO to pass bean info.
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BeanDTO {

    private String beanName;
    private String className;
}
