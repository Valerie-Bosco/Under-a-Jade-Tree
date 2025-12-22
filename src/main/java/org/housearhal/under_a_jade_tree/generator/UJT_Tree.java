package org.housearhal.under_a_jade_tree.generator;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.function.Supplier;

import static org.housearhal.under_a_jade_tree.block.UJT_Blocks.registerUJTBlock;

public class UJT_Tree {


    public String name;
    private final Supplier<? extends RotatedPillarBlock> log;
    private final Supplier<? extends LeavesBlock> leaves;
    private final Supplier<? extends SaplingBlock> sapling;


    public DeferredBlock<RotatedPillarBlock> LOG;
    public DeferredItem<BlockItem> LOG_ITEM;
    public DeferredBlock<LeavesBlock> LEAVES;
    public DeferredItem<BlockItem> LEAVES_ITEM;
    public DeferredBlock<SaplingBlock> SAPLING;
    public DeferredItem<BlockItem> SAPLING_ITEM;


    public <T extends Block> UJT_Tree(String name, Supplier<? extends RotatedPillarBlock> log, Supplier<? extends LeavesBlock> leaves, Supplier<? extends SaplingBlock> sapling) {
        this.log = log;
        this.leaves = leaves;
        this.sapling = sapling;
    }

    public UJT_Tree build() {
        LOG = (DeferredBlock<RotatedPillarBlock>) registerUJTBlock(
                String.format(
                        "%s_log",
                        name
                ),
                log::get
        ).getFirst();

        LEAVES = (DeferredBlock<LeavesBlock>) registerUJTBlock(
                String.format(
                        "%s_leaves",
                        name
                ),
                leaves::get
        ).getFirst();
        SAPLING = (DeferredBlock<SaplingBlock>) registerUJTBlock(
                String.format(
                        "%s_sapling",
                        name
                ),
                sapling::get
        ).getFirst();


        return this;
    }
}
