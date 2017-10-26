package net.rires.hmagemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.rires.hmagemod.machines.block.HmageFurnaceBlock;

@Mod(modid = "hmagemod")
public class HmageMod {

  public static Block hmageFurnace = new HmageFurnaceBlock();

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    GameRegistry.registerBlock(hmageFurnace, "hmagefurnace");
  }

}
