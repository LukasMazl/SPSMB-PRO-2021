package cz.spsmb.minecraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("spsmb-mode")
public class MinecraftPluginBootloader {

    private static final Logger LOGGER = LogManager.getLogger();

    public MinecraftPluginBootloader() {
        MinecraftForge.EVENT_BUS.register(this);

        initCommands();
    }

    private void initCommands() {
    }
}
