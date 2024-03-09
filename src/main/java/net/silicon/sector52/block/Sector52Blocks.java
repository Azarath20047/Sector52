package net.silicon.sector52.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silicon.sector52.Sector52;

public class Sector52Blocks {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Sector52.MOD_ID);
  
  // public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
  public static final RegistryObject<Block> CYBEX_ORE_BLOCK = BLOCKS.register("cybex_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
  public static final RegistryObject<Block> TITANIUM_ORE_BLOCK = BLOCKS.register("titanium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
  public static final RegistryObject<Block> VARDA_BIG_LEAVES_BLOCK = BLOCKS.register("varda_big_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
  public static final RegistryObject<Block> VARDA_LOG_BLOCK = BLOCKS.register("varda_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
  public static final RegistryObject<Block> VARDA_SMALL_LEAVES_BLOCK = BLOCKS.register("varda_small_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
}
