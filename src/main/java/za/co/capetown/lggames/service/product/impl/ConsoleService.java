package za.co.capetown.lggames.service.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.capetown.lggames.domain.product.Console;
import za.co.capetown.lggames.repository.product.IConsoleRepository;
import za.co.capetown.lggames.service.product.IConsoleService;

@Service
public class ConsoleService implements IConsoleService {

    @Autowired
    private IConsoleRepository consoleRepository;

    @Override
    public void delete(String consoleId) {
        consoleRepository.deleteById(consoleId);
    }


    @Override
    public Console create(Console console) {
        return consoleRepository.save(console);
    }

    @Override
    public Console read(String s) {
        return null;
    }

    @Override
    public List<Console> getAll() {
        return consoleRepository.findAll();
    }

    @Override
    public Console update(String consoleId, Console console) {
        return null;
    }


}
