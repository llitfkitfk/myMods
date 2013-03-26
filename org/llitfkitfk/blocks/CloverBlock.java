package org.llitfkitfk.blocks;

import org.llitfkitfk.MyFirstMod;
import org.llitfkitfk.proxy.ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class CloverBlock extends BlockFlower {

	public CloverBlock(int par1) {
		super(par1, 18);

		setBlockName("block_clover");
		setTextureFile(ClientProxy.ITEMS_PNG);
		setCreativeTab(CreativeTabs.tabDecorations);
		setLightValue(1);
	}

	@Override
	protected boolean canThisPlantGrowOnThisBlockID(int par1) {
		// TODO Auto-generated method stub
		return par1 == Block.grass.blockID || par1 == Block.tilledField.blockID
				|| par1 == Block.dirt.blockID || par1 == Block.stone.blockID
				|| par1 == Block.sand.blockID;
	}
	
	@Override
	public int getRenderType() {
		// TODO Auto-generated method stub
		return MyFirstMod.RENDER_TYPE_BLOCK_CLOVER;
	}
}
