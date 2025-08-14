package za.co.capetown.lggames.service.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.capetown.lggames.domain.product.Game;
import za.co.capetown.lggames.repository.product.IGameRepository;
import za.co.capetown.lggames.service.product.IGameService;

import java.util.List;

@Service
public class GameService implements IGameService {

    @Autowired
    private IGameRepository gameRepository;


    @Override
    public void delete(String gameId) {
        gameRepository.deleteById(gameId);
    }

    @Override
    public Game create(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Game read(String s) {
        return null;
    }

    @Override
    public List<Game> getAll() {
        return List.of();
    }

    @Override
    public Game update(String gameId, Game game) {
        return null;
    }
}
