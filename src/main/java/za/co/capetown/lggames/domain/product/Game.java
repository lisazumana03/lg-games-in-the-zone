package za.co.capetown.lggames.domain.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Game {
    @Id
    private String gameId;
    private String gameName;
    private GamingCategory gameCategory;
    private double gamePrice;
    @ManyToOne
    private Console console;

    public Game(){}

    private Game(Builder builder) {
        this.gameId = builder.gameId;
        this.gameName = builder.gameName;
        this.gameCategory = builder.gameCategory;
        this.gamePrice = builder.gamePrice;
        this.console = builder.console;
    }

    public static class Builder {
        private String gameId;
        private String gameName;
        private GamingCategory gameCategory;
        private double gamePrice;
        private Console console;
    }
}
