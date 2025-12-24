//package org.housearhal.under_a_jade_tree.generator;
//
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.LeavesBlock;
//import net.minecraft.world.level.block.RotatedPillarBlock;
//import net.minecraft.world.level.block.SaplingBlock;
//import net.neoforged.neoforge.registries.DeferredBlock;
//
//import java.util.function.Supplier;
//
//import static org.housearhal.under_a_jade_tree.block.UJT_Blocks.registerUJTBlock;
//
//public class UJT_Tree {
//
//
//    public String name;
//    protected Supplier<? extends RotatedPillarBlock> log;
//    protected Supplier<? extends LeavesBlock> leaves;
//    protected Supplier<? extends SaplingBlock> sapling;
//
//
//    public DeferredBlock<Block> LOG;
//    public DeferredBlock<Block> LEAVES;
//    public DeferredBlock<Block> SAPLING;
//
//
//    public <T extends Block> UJT_Tree(
//            String name,
//            Supplier<? extends RotatedPillarBlock> log,
//            Supplier<? extends LeavesBlock> leaves,
//            Supplier<? extends SaplingBlock> sapling) {
//        this.log = log;
//        this.leaves = leaves;
//        this.sapling = sapling;
//    }
//
//    public UJT_Tree build() {
//        LOG = registerUJTBlock(
//                String.format(
//                        "%s_log",
//                        name
//                ),
//                log::get
//        );
//        LEAVES = registerUJTBlock(
//                String.format(
//                        "%s_leaves",
//                        name
//                ),
//                leaves::get
//        );
//        SAPLING = registerUJTBlock(
//                String.format(
//                        "%s_sapling",
//                        name
//                ),
//                sapling::get
//        );
//
//        return this;
//    }
//}
