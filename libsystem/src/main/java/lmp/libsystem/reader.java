
package lmp.libsystem;

public class reader {
    
    private String readerName;
    
    private String readerData;
    
    private boolean readerGenre;
    
    private int readerAge;
    
    private int readerCountry;
    
    private int readerEmail;
    
    private int readerPhone;

    public reader(String readerName, String readerData, boolean readerGenre, int readerAge, int readerCountry, int readerEmail, int readerPhone) {
        this.readerName = readerName;
        this.readerData = readerData;
        this.readerGenre = readerGenre;
        this.readerAge = readerAge;
        this.readerCountry = readerCountry;
        this.readerEmail = readerEmail;
        this.readerPhone = readerPhone;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getReaderData() {
        return readerData;
    }

    public void setReaderData(String readerData) {
        this.readerData = readerData;
    }

    public boolean isReaderGenre() {
        return readerGenre;
    }

    public void setReaderGenre(boolean readerGenre) {
        this.readerGenre = readerGenre;
    }

    public int getReaderAge() {
        return readerAge;
    }

    public void setReaderAge(int readerAge) {
        this.readerAge = readerAge;
    }

    public int getReaderCountry() {
        return readerCountry;
    }

    public void setReaderCountry(int readerCountry) {
        this.readerCountry = readerCountry;
    }

    public int getReaderEmail() {
        return readerEmail;
    }

    public void setReaderEmail(int readerEmail) {
        this.readerEmail = readerEmail;
    }

    public int getReaderPhone() {
        return readerPhone;
    }

    public void setReaderPhone(int readerPhone) {
        this.readerPhone = readerPhone;
    }

    
}
