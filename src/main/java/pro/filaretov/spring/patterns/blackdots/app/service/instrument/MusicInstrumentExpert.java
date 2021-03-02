package pro.filaretov.spring.patterns.blackdots.app.service.instrument;

import pro.filaretov.spring.patterns.blackdots.app.domain.MusicInstrument;

/**
 * Music instrument expert.
 */
public interface MusicInstrumentExpert {

    String WOODY = "woody";
    String METAL = "metal";

    /**
     * Adjust music instrument.
     * @param musicInstrument music instrument
     */
    void adjust(MusicInstrument musicInstrument);
}
