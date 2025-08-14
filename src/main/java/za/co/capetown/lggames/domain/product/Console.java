package za.co.capetown.lggames.domain.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Console {
    @Id
    private String consoleId;
    private String consoleName;
    private double consolePrice;
    @OneToMany(mappedBy = "console")
    private List<Game> games;
    private int stock;

    public Console(){}

    private Console(Builder builder) {
        this.consoleId = builder.consoleId;
        this.consoleName = builder.consoleName;
        this.consolePrice = builder.consolePrice;
        this.games = builder.games;
        this.stock = builder.stock;
    }

    public String getConsoleId() {
        return consoleId;
    }

    public String getConsoleName() {
        return consoleName;
    }

    public double getConsolePrice() {
        return consolePrice;
    }

    public List<Game> getGames() {
        return games;
    }

    public int getStock() {
        return stock;
    }

    public static class Builder{
        private String consoleId;
        private String consoleName;
        private double consolePrice;
        private List<Game> games;
        private int stock;

        public Builder setConsoleId(String consoleId) {
            this.consoleId = consoleId;
            return this;
        }

        public Builder setConsoleName(String consoleName) {
            this.consoleName = consoleName;
            return this;
        }

        public Builder setConsolePrice(double consolePrice) {
            this.consolePrice = consolePrice;
            return this;
        }

        public Builder setGames(List<Game> games) {
            this.games = games;
            return this;
        }

        public Builder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        public Builder copy(Console console){
            this.consoleId = console.consoleId;
            this.consoleName = console.consoleName;
            this.consolePrice = console.consolePrice;
            this.games = console.games;
            this.stock = console.stock;
            return this;
        }

        public Console build(){
            return new Console(this);
        }
    }
}
