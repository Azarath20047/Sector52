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
  
   public static final RegistryObject<Item> CYBEX_CHUNK_ITEM = ITEMS.register("cybex_chunk", () -> new Item(new Item.Properties()));
  
  // public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(Sector52Blocks.EXAMPLE_BLOCK.get(), new Item.Properties()));
  
  public static final RegistryObject<Item> CYBEX_BLOCK_ITEM = ITEMS.register("cybex_ore", () -> new BlockItem(Sector52Blocks.CYBEX_ORE_BLOCK.get(), new Item.Properties()));
  public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_ore", () -> new BlockItem(Sector52Blocks.TITANIUM_ORE_BLOCK.get(), new Item.Properties()));
  public static final RegistryObject<Item> VARDA_BIG_LEAVES_BLOCK_ITEM = ITEMS.register("varda_big_leaves", () -> new BlockItem(Sector52Blocks.VARDA_BIG_LEAVES_BLOCK.get(), new Item.Properties()));
  public static final RegistryObject<Item> VARDA_SMALL_LEAVES_BLOCK_ITEM = ITEMS.register("varda_small_leaves", () -> new BlockItem(Sector52Blocks.VARDA_SMALL_LEAVES_BLOCK.get(), new Item.Properties()));
  public static final RegistryObject<Item> VARDA_LOG_BLOCK_ITEM = ITEMS.register("varda_log", () -> new BlockItem(Sector52Blocks.VARDA_LOG_BLOCK.get(), new Item.Properties()));


}
