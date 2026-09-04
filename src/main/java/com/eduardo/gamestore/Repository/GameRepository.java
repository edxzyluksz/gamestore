package com.eduardo.gamestore.Repository;
import org.springframework.data.repository.CrudRepository;
import com.eduardo.gamestore.Model.Game;

public interface GameRepository extends CrudRepository <Game, Integer> {

}
