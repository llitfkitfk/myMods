package org.llitfkitfk.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import org.llitfkitfk.proxy.ClientProxy;

public class BasicItem extends Item {

	public BasicItem(int par1) {
		super(par1);

		setItemName("Google +");
		setTextureFile(ClientProxy.ITEMS_PNG);
		setIconCoord(1, 1);
		setCreativeTab(CreativeTabs.tabTools);
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player,
			World world, int x, int y, int z, int side, float x_off,
			float y_off, float z_off) {

		if (world.isRemote)
			return true;

		// cover a piece of blocks
		for (int dx = -4; dx <= 4; dx++) {
			for (int dz = -4; dz <= 4; dz++) {
				if (Math.abs(dx) + Math.abs(dz) > 6)
					continue;

				int new_x = x + dx;
				int new_y = y;
				int new_z = z + dz;

				set_snow_or_ice(world, new_x, new_y, new_z);
			}
		}

		return true;
	}

	public void set_snow_or_ice(World world, int x, int y, int z) {
		int block_id = world.getBlockId(x, y, z);

		if (block_id == 0)
			return;
		// cover sand, grass, dirt with snow
		if (block_id == Block.sand.blockID || block_id == Block.grass.blockID
				|| block_id == Block.dirt.blockID) {

			int y1 = y + 1;
			int bid = world.getBlockId(x, y1, z);
			if (bid == 0 || bid == Block.tallGrass.blockID) {
				world.setBlock(x, y1, z, Block.snow.blockID);
			}
		}
		// cover water with ice
		if (block_id == Block.waterMoving.blockID
				|| block_id == Block.waterStill.blockID) {
			world.setBlock(x, y, z, Block.ice.blockID);
		}
	}

}
