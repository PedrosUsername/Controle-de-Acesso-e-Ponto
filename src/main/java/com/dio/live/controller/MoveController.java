package com.dio.live;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movimentacao")
public class MoveController {
    @Autowired
    MoveService moveService;

    @PostMapping(path="/add")
    public Move createMove(@RequestBody Move move){
        return moveService.saveMove(move);
    }

    @GetMapping(path="/lista")
    public @ResponseBody Iterable<Move> getMoveList(){
        return moveService.findAll();

    }

    @GetMapping("/{idMove}")
    public ResponseEntity<Move>  getMoveByID(@PathVariable("idMove") Long idMove) throws Exception {
        return  ResponseEntity.ok(moveService.getById(idMove).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public Move updateMove(@RequestBody Move move){
        return moveService.updateMove(move);
    }

    @DeleteMapping("/{idMove}")
    public ResponseEntity deleteByID(@PathVariable("idMove") Long idMove) throws Exception {
       try {
           moveService.deleteMove(idMove);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        return ResponseEntity.ok("deleted");

    }



}
