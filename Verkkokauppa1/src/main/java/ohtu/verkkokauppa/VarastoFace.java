
package ohtu.verkkokauppa;


public interface VarastoFace {

    Tuote haeTuote(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);

    int saldo(int id);

    public KirjanpitoFace kirjanpito();


    
}
