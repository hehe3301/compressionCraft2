package com.hehe.compression_craft_2;

import com.hehe.compression_craft_2.blocks.AllBlocks;
import com.hehe.compression_craft_2.items.AllItems;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = CompressionCraft2.MODID, version = CompressionCraft2.VERSION)
public class CompressionCraft2
{
    public static final String MODID = "compression_craft_2";
    public static final String VERSION = "2.0.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
    	AllBlocks.init();
        AllItems.init();
    }
}
