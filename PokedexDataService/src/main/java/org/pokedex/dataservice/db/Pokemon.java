package org.pokedex.dataservice.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon
{
    @Id
    private Long id;
    private String name;
    private Integer attack;
    private Integer defense;
    private Integer stamina;
}
