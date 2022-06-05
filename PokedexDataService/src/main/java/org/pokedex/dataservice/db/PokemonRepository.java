package org.pokedex.dataservice.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Long, Pokemon>
{
}
