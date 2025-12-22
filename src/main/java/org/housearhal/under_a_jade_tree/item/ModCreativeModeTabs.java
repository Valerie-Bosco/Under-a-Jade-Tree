package org.housearhal.under_a_jade_tree.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static org.housearhal.under_a_jade_tree.UnderAJadeTree.MODID;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB,
            MODID
    );

    public static final Supplier<CreativeModeTab> UJT_ITEMS_TAB = CREATIVE_MODE_TAB.register(
            "ujt_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(UJT_Items.RAW_JADE.get()))
                    .title(Component.translatable("creativetab.under_a_jade_tree.ujt_items"))
//                    .displayItems(
//                            (itemDisplayParameters, output) -> {
//                                output.accept(UJT_Items.RAW_JADE);
//                                output.accept(UJT_Items.JADE);
//                                output.accept(UJT_Blocks.JADEWOODTREE.LOG_ITEM);
//                            }
//                    )
                    .build()
    );


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
