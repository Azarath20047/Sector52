package net.silicon.sector52.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silicon.sector52.Sector52;
import net.silicon.sector52.block.Sector52Blocks;

public class Sector52Items {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Sector52.MOD_ID);
  
  // public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
  //   .alwaysEat().nutrition(1).saturationMod(2f).build())));
  
  // public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(Sector52Blocks.EXAMPLE_BLOCK.get(), new Item.Properties()));
  
  public static final RegistryObject<Item> CYBEX_BLOCK_ITEM = ITEMS.register("cybex_ore", () -> new BlockItem(Sector52Blocks.CYBEX_ORE_BLOCK.get(), new Item.Properties()));
  public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_ore", () -> new BlockItem(Sector52Blocks.TITANIUM_ORE_BLOCK.get(), new Item.Properties()));
}
