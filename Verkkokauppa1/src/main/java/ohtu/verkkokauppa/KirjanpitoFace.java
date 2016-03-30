
package ohtu.verkkokauppa;

import java.util.ArrayList;


public interface KirjanpitoFace {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}
