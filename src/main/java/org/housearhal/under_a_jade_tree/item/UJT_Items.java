package org.housearhal.under_a_jade_tree.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.housearhal.under_a_jade_tree.UnderAJadeTree;

public class UJT_Items {
    // Register to namespace "under_a_jade_tree:name"
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UnderAJadeTree.MODID);


    // ITEMS
    public static final DeferredItem<Item> RAW_JADE = ITEMS.register(
            "raw_jade",
            () -> new Item(
                    new Item.Properties()
            )
    );
    public static final DeferredItem<Item> JADE = ITEMS.register(
            "jade",
            () -> new Item(
                    new Item.Properties()
            )
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
