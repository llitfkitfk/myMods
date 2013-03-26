package org.llitfkitfk.blocks;

import org.llitfkitfk.proxy.ClientProxy;
import org.llitfkitfk.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlocks extends Block {

	public BasicBlocks(int par1) {
		super(par1, Material.wood);

		setBlockName("Basic");
		setCreativeTab(CreativeTabs.tabBlock);
		setTextureFile(ClientProxy.BLOCKS_PNG);
	
	}
	


}
