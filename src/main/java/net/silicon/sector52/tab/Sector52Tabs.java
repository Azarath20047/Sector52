package net.silicon.sector52.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.silicon.sector52.Sector52;
import net.silicon.sector52.item.Sector52Items;

public class Sector52Tabs {
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sector52.MOD_ID);
  
  public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
    .withTabsBefore(CreativeModeTabs.COMBAT)
    .icon(() -> Sector52Items.EXAMPLE_ITEM.get().getDefaultInstance())
    .displayItems((parameters, output) -> {
      output.accept(Sector52Items.EXAMPLE_ITEM.get());
    }).build());
}
