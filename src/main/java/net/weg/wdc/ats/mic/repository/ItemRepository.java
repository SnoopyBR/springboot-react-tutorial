package net.weg.wdc.ats.mic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.weg.wdc.ats.mic.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
