package org.llitfkitfk;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;

import org.llitfkitfk.blocks.BasicBlocks;
import org.llitfkitfk.blocks.CloverBlock;
import org.llitfkitfk.items.BasicItem;
import org.llitfkitfk.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "MyFirstMod", name = "MyFirstMod", version = "0.1.3")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MyFirstMod {

	@Instance("MyFirstMod")
	public static MyFirstMod instance;

	@SidedProxy(clientSide = "org.llitfkitfk.proxy.ClientProxy", serverSide = "org.llitfkitfk.CommonProxy")
	public static CommonProxy proxy;

	final public static int RENDER_TYPE_BLOCK_CLOVER = 502;

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.init();
		// Basic Block
		Block basicBlocks = new BasicBlocks(501);
		ModLoader.registerBlock(basicBlocks);
		ModLoader.addName(basicBlocks, "Tuzki");

		// Clover Block
		Block cloverBlock = new CloverBlock(502);
		ModLoader.registerBlock(cloverBlock);
		ModLoader.addName(cloverBlock, "Clover");

		// Basic Item
		Item basicItem = new BasicItem(10001);
		ModLoader.addName(basicItem, "Google +");

	}

}
