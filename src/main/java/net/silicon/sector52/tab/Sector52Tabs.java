package net.silicon.sector52.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.silicon.sector52.Sector52;
import net.silicon.sector52.item.Sector52Items;

public class Sector52Tabs {
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sector52.MOD_ID);
  
  public static final RegistryObject<CreativeModeTab> SECTOR_52_TAB_1 = CREATIVE_MODE_TABS.register("sector_52_tab_1", () -> CreativeModeTab.builder()
    .withTabsBefore(CreativeModeTabs.COMBAT)
    .icon(() -> Sector52Items.CYBEX_BLOCK_ITEM.get().getDefaultInstance())
    .title(Component.translatable("itemGroup.sector_52_tab_1"))
    .displayItems((parameters, output) -> {
      output.accept(Sector52Items.CYBEX_BLOCK_ITEM.get());
      output.accept(Sector52Items.TITANIUM_BLOCK_ITEM.get());
      output.accept(Sector52Items.CYBEX_CHUNK_ITEM.get());
    }).build());
}
