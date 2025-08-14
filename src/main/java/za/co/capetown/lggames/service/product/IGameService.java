package za.co.capetown.lggames.service.product;

import za.co.capetown.lggames.domain.product.Game;
import za.co.capetown.lggames.service.IService;

public interface IGameService extends IService<Game, String> {
    void delete(String gameId);
}
