package net.rires.hmagemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.rires.hmagemod.machines.block.HmageFurnaceBlock;

@Mod(modid = "hmagemod")
public class HmageMod {

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    GameRegistry.registerBlock(new HmageFurnaceBlock(), "hmagefurnace");
  }

}
