package net.orca.ocean.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.orca.ocean.entity.ModEntities;
import net.orca.ocean.item.custom.EightBallItem;
import net.orca.ocean.Ocean;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Ocean.MOD_ID);

    public static final RegistryObject<Item> KELPFISH = ITEMS.register("kelpfish",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OCEAN_TAB).food(ModFoods.KELPFISH)));
    private static net.minecraft.world.food.FoodProperties FoodProperties;
    public static final RegistryObject<Item> COOKED_KELPFISH = ITEMS.register("cooked_kelpfish",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OCEAN_TAB).food(ModFoods.COOKED_KELPFISH)));
    public static final RegistryObject<Item> CLUMP = ITEMS.register("clump",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.OCEAN_TAB)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item> ORCA_SPAWN_EGG = ITEMS.register("orca_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ORCA, 0X343a42, 0Xccced5,
                    new Item.Properties().tab(ModCreativeModeTab.OCEAN_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
