package org.housearhal.under_a_jade_tree.generator;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

import static org.housearhal.under_a_jade_tree.block.UJT_Blocks.registerUJTBlock;

public class UJT_Tree {


    public String name;
    private final Supplier<? extends RotatedPillarBlock> log;
    private final Supplier<? extends LeavesBlock> leaves;
    private final Supplier<? extends SaplingBlock> sapling;


    public DeferredBlock<RotatedPillarBlock> LOG;
    public DeferredBlock<LeavesBlock> LEAVES;
    public DeferredBlock<SaplingBlock> SAPLING;


    public <T extends Block> UJT_Tree(
            String name,
            Supplier<? extends RotatedPillarBlock> log,
            Supplier<? extends LeavesBlock> leaves,
            Supplier<? extends SaplingBlock> sapling) {
        this.log = log;
        this.leaves = leaves;
        this.sapling = sapling;
    }

    public UJT_Tree build() {
        LOG = registerUJTBlock(
                String.format(
                        "%s_log",
                        name
                ),
                log::get
        );
        LEAVES = registerUJTBlock(
                String.format(
                        "%s_leaves",
                        name
                ),
                leaves::get
        );
        SAPLING = registerUJTBlock(
                String.format(
                        "%s_sapling",
                        name
                ),
                sapling::get
        );


        return this;
    }
}
