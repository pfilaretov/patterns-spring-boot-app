package pro.filaretov.spring.patterns.blackdots.app.service.instrument;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import pro.filaretov.spring.patterns.blackdots.app.domain.Expert;

/**
 * Expert in adjusting triangles. Triangles are rare, so it is VERY expensive, and we want it to be lazy instantiated.
 */
@Expert(MusicInstrumentExpert.METAL)
@Lazy
@Slf4j
public class TriangleExpert implements MusicInstrumentExpert {

    @PostConstruct
    public void postConstruct() {
        log.info("TRIANGLE expert is here");
    }

    @Override
    public void adjust() {
        log.info("triangle adjusted");
    }
}
