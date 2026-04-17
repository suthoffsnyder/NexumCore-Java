package com.nexum.core.storage;

import com.nexum.core.entity.Block;
import java.util.ArrayList;
import java.util.List;

public class BlockStorage {
    private final List<Block> storage;

    public BlockStorage() {
        this.storage = new ArrayList<>();
    }

    public void saveBlock(Block block) {
        storage.add(block);
    }

    public Block getBlockByHeight(long height) {
        if (height >= storage.size()) return null;
        return storage.get((int) height);
    }
}
