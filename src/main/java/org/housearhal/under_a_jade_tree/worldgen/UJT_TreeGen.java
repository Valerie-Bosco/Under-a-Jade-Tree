package org.housearhal.under_a_jade_tree.worldgen;

import net.minecraft.world.level.block.grower.TreeGrower;
import org.housearhal.under_a_jade_tree.UnderAJadeTree;

import java.util.Optional;

public class UJT_TreeGen {
    public static final TreeGrower JADEWOOD = new TreeGrower(
            String.format(
                    "%s%s",
                    UnderAJadeTree.MODID,
                    ":jadewood"
            ),
            Optional.empty(),
            Optional.empty(),
            Optional.empty()
    );
}


