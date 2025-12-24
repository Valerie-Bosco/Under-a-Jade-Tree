package org.housearhal.under_a_jade_tree.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.housearhal.under_a_jade_tree.UnderAJadeTree;

public class UJT_Items {
    // Register to namespace "under_a_jade_tree:name"
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UnderAJadeTree.MODID);

    public static DeferredItem<Item> registerUJTItem(
            String name
    ) {
        return UJT_Items.ITEMS.registerItem(
                name,
                Item::new,
                new Item.Properties()
        );
    }


    // ITEMS
    public static final DeferredItem<Item> RAW_JADE = registerUJTItem(
            "raw_jade"
    );
    public static final DeferredItem<Item> JADE = registerUJTItem(
            "jade"
    );


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
