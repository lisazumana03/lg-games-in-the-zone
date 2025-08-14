package za.co.capetown.lggames.service.product;

import za.co.capetown.lggames.domain.product.Console;
import za.co.capetown.lggames.service.IService;

public interface IConsoleService extends IService<Console, String> {
    void delete(String consoleId);
}
