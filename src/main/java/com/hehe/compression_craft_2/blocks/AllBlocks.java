package com.hehe.compression_craft_2.blocks;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllBlocks {
	
	public static void init(){
		System.out.println("CompressionCraft2 initializing blocks!");
		ArrayList<Block> blockList =new ArrayList<Block>();
		
		for(int i=1; i<=8; i++){//Creates Compressed cobble
			String name = new String(i+"x_compressed_cobble");
			Block block = new Block(Material.ROCK);
			block.setHardness(1);
			block.setResistance(9);
			block.setLightLevel(0);
			//block.setLightOpacity(i);
			block.setRegistryName(name);
			block.setUnlocalizedName(name);
			block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
			blockList.add(block);
		}
		
		
		
		for(Block block: blockList){//registers the blocklist
			
			GameRegistry.register(block);
			GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}
		
	}
}
