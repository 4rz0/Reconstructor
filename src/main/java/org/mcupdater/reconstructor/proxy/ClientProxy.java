package org.mcupdater.reconstructor.proxy;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.mcupdater.reconstructor.ModBlocks;

@Mod.EventBusSubscriber
public class ClientProxy extends CommonProxy
{

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ModBlocks.initModels();
	}
}
