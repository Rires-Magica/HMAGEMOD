package net.rires.hmagemod.machines.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.rires.hmagemod.machines.IMachine;

public class HmageFurnaceBlock extends Block implements IMachine {

  public HmageFurnaceBlock() {
    super(Material.iron);
  }

  @Override
  public double getEnergy() {
    return 0;
  }

  @Override
  public boolean isRunning() {
    return false;
  }
}
