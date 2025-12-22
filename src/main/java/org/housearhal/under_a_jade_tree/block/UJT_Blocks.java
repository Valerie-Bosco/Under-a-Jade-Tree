package org.housearhal.under_a_jade_tree.block;


import com.mojang.datafixers.util.Pair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.housearhal.under_a_jade_tree.generator.UJT_Tree;
import org.housearhal.under_a_jade_tree.item.UJT_Items;
import org.housearhal.under_a_jade_tree.worldgen.UJT_TreeGen;

import java.util.function.Supplier;

import static org.housearhal.under_a_jade_tree.UnderAJadeTree.MODID;


public class UJT_Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static <T extends Block> Pair<DeferredBlock<T>, DeferredItem<BlockItem>> registerUJTBlock(
            String name,
            Supplier<T> block
    ) {
        DeferredBlock<T> ujt_block = BLOCKS.register(
                name,
                block
        );
        DeferredItem<BlockItem> ujt_item = UJT_Items.ITEMS.register(
                name,
                () -> new BlockItem(
                        ujt_block.get(),
                        new Item.Properties()
                )
        );


        return new Pair<>(
                ujt_block,
                ujt_item
        );
    }

    public static final UJT_Tree JADEWOODTREE = new UJT_Tree(
            "jadewood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)),
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)),
            () -> new SaplingBlock(
                    UJT_TreeGen.JADEWOOD,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)
            )
    )
            .build();


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}


//    public static final DeferredBlock<Block> STRIPPED_JADEWOOD_LOG = registerUJTBlock(
//            "stripped_jadewood_log",
//            () -> new JadeWood_Log(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG))
//    );

//
//    public static final DeferredBlock<Block> JADEWOOD_WOOD = registerUJTBlock(
//            "jadewood_wood",
//            () -> new JadeWood_Log(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD))
//    );
//    public static final DeferredBlock<Block> STRIPPED_JADEWOOD_WOOD = registerUJTBlock(
//            "stripped_jadewood_wood",
//            () -> new JadeWood_Log(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD))
//    );


//    public static final DeferredBlock<Block> JADEWOOD_PLANKS = registerUJTBlock(
//            "jadewood_log",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG))
//    );