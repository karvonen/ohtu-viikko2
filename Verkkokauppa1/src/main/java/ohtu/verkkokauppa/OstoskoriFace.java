
package ohtu.verkkokauppa;

public interface OstoskoriFace {

    int hinta();

    void lisaa(Tuote t);

    void poista(Tuote t);
    
}
