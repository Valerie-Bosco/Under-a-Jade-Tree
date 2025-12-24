package org.housearhal.under_a_jade_tree.block;


import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.housearhal.under_a_jade_tree.item.UJT_Items;
import org.housearhal.under_a_jade_tree.worldgen.UJT_TreeGen;

import java.util.function.Function;

import static org.housearhal.under_a_jade_tree.UnderAJadeTree.MODID;

public class UJT_Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static <T extends Block> DeferredBlock<T> registerUJTBlock(
            String name,
            Function<BlockBehaviour.Properties, T> factory
    ) {
        DeferredBlock<T> ujt_block = BLOCKS.registerBlock(
                name,
                factory,
                BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)
        );

        UJT_Items.ITEMS.registerSimpleBlockItem(
                name,
                ujt_block,
                new Item.Properties()
        );
        return ujt_block;
    }

    public static final DeferredBlock<Block> JADEWOODLOG = registerUJTBlock(
            "jadewood_log",
            UJT_Log::new
    );
    public static final DeferredBlock<Block> JADEWOODWOOD = registerUJTBlock(
            "jadewood_wood",
            UJT_Log::new
    );
    public static final DeferredBlock<Block> JADEWOODLEAVES = registerUJTBlock(
            "jadewood_leaves",
            LeavesBlock::new
    );
    public static final DeferredBlock<Block> JADEWOODSAPLING = registerUJTBlock(
            "jadewood_sapling",
            properties -> new SaplingBlock(
                    UJT_TreeGen.JADEWOOD,
                    properties
            )
    );


//    new UJT_Tree(
//            "jadewood",
//            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)),
//            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)),
//            () -> new SaplingBlock(
//                    UJT_TreeGen.JADEWOOD,
//                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)
//            )
//    )  BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)
//            .build();


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