package za.co.capetown.lggames.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.capetown.lggames.domain.product.Console;
import za.co.capetown.lggames.service.product.impl.ConsoleService;

@RestController
@RequestMapping("/api/console")
public class ConsoleController {
    @Autowired
    private ConsoleService consoleService;

    @PostMapping("/create")
    public ResponseEntity<Console> create(@RequestBody Console console) {
        return ResponseEntity.ok(consoleService.create(console));
    }

    @PutMapping("/update/{consoleId}")
    public ResponseEntity<Console> update(@PathVariable String consoleId, @RequestBody Console console) {
        consoleService.update(consoleId, console);
        return ResponseEntity.ok(console);
    }

    @GetMapping
    public ResponseEntity<List<Console>> getAll(){
        return ResponseEntity.ok(consoleService.getAll());
    }

    @DeleteMapping("/delete/{consoleId}")
    public ResponseEntity<Void> delete(@PathVariable String consoleId){
        consoleService.delete(consoleId);
        return ResponseEntity.noContent().build();
    }
}
