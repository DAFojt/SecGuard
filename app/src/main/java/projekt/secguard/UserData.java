package projekt.secguard;


/** Przechowywanie danych o zalogowanym userze */
public class UserData {

    private String login; //nazwa usera
    private String imie; // imie pracownika
    private String nazwisko; //nazwisko pracownika
    private String firma; // podstawowa firma przypisana do pracownika
    private String status; // status[admin,manager,pracownik]
 //test
    public UserData(String firma, String imie, String login, String nazwisko, String status) {
        this.firma = firma;
        this.imie = imie;
        this.login = login;
        this.nazwisko = nazwisko;
        this.status = status;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
