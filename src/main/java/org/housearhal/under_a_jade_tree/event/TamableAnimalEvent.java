package org.housearhal.under_a_jade_tree.event;

import net.minecraft.world.entity.TamableAnimal;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import org.housearhal.under_a_jade_tree.UnderAJadeTree;

@EventBusSubscriber(modid = UnderAJadeTree.MODID)
public class TamableAnimalEvent {

    @SubscribeEvent
    public static void livingDamage(LivingDamageEvent.Pre event) {
        if (event.getEntity() instanceof TamableAnimal && ((TamableAnimal) event.getEntity()).isTame()) {
            event.setNewDamage(0);
        }
    }
}



