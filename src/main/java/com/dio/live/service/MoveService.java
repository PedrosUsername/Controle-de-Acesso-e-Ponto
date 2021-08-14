package com.dio.live;

import com.dio.live.Move;
import com.dio.live.MoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MoveService {


    MoveRepository moveRepository;

    @Autowired
    public MoveService(MoveRepository moveRepository) {
        this.moveRepository = moveRepository;
    }

    public Move saveMove(Move move){
       return moveRepository.save(move);

    }

    public Iterable<Move> findAll() {
       return   moveRepository.findAll();
    }

    public Optional<Move> getById(Long idMove) {
        return moveRepository.findById(idMove);
    }

    public Move updateMove(Move move){
        return moveRepository.save(move);

    }

    public void deleteMove(Long idMove) {
        moveRepository.deleteById(idMove);
    }
}
