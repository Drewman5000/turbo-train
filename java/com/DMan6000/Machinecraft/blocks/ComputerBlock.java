package com.DMan6000.Machinecraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ComputerBlock extends BlockBase {
	public ComputerBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.5F);
		setResistance(4.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(11.0F);
	}

}
