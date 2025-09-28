package za.co.capetown.lggames.controller.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.capetown.lggames.domain.product.Game;
import za.co.capetown.lggames.service.product.impl.GameService;

@RestController
@RequestMapping("/api/game")
public class GameController {
    @Autowired
    private GameService gameService;

    @PostMapping("/create")
    public ResponseEntity<Game> create(@RequestBody Game game) {
        return ResponseEntity.ok(gameService.create(game));
    }

    @GetMapping
    public ResponseEntity<List<Game>> getAll(){
        return ResponseEntity.ok(gameService.getAll());
    }

    @DeleteMapping("/delete/{gameId}")
    public ResponseEntity<Void> delete(@PathVariable String gameId) {
        gameService.delete(gameId);
        return ResponseEntity.noContent().build();
    }
}
