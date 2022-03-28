package io.github.lattesyobon.audio;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AudioMod.MODID, name = AudioMod.NAME, version = AudioMod.VERSION)
public class AudioMod {
    public static final String MODID = "audiomod";
    public static final String NAME = "Audio Mod";
    public static final String VERSION = "1.0.0";

    @Mod.Metadata(MODID)
    public static ModMetadata meta;

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        ModInfo.loadInfo(meta);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
