package org.llitfkitfk.renders;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.ForgeHooksClient;

import org.llitfkitfk.MyFirstMod;
import org.llitfkitfk.proxy.ClientProxy;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderBlockClover implements ISimpleBlockRenderingHandler {

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		ForgeHooksClient.bindTexture(ClientProxy.BLOCKS_PNG, 0);
		block.blockIndexInTexture = 2;
		renderer.renderCrossedSquares(block, x, y, z);
		block.blockIndexInTexture = 18;
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getRenderId() {
		// TODO Auto-generated method stub
		return MyFirstMod.RENDER_TYPE_BLOCK_CLOVER;
	}

}
