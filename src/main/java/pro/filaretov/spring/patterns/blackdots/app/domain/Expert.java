package pro.filaretov.spring.patterns.blackdots.app.domain;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Component
@Qualifier
public @interface Expert {
    String value();
}
