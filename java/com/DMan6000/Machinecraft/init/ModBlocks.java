package com.DMan6000.Machinecraft.init;

import java.util.ArrayList;
import java.util.List;

import com.DMan6000.Machinecraft.blocks.BlockBase;
import com.DMan6000.Machinecraft.blocks.ComputerBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block COMPUTER_BLOCK = new ComputerBlock("computer_block", Material.IRON);

}
