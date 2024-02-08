package com.udemy.spring_quest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    ItemMapper itemMapper;

    public int create(Item item) {
        return itemMapper.create(item);
    }
    public int update(Item item) {
        return itemMapper.update(item);
    }
    public Item read(int id) {
        return itemMapper.read(id);
    }
    public int delete(int id) {
        return itemMapper.delete(id);
    }
}
