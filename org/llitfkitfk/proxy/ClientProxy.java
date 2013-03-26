package org.llitfkitfk.proxy;


import org.llitfkitfk.renders.RenderBlockClover;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;



public class ClientProxy extends CommonProxy {
	
	public static String BLOCKS_PNG = "/png/blocks.png";	
	public static String ITEMS_PNG = "/png/items.png";
	@Override
	public void init() {
		// TODO Auto-generated method stub
		//super.init();
		MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		
		//register render block clover
		RenderingRegistry.registerBlockHandler(new RenderBlockClover()); 
	}
	
}
