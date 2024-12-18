package igobyjake.rosegoldequipment;

import igobyjake.rosegoldequipment.block.ModBlocks;
import igobyjake.rosegoldequipment.item.custom.ModItemGroups;
import igobyjake.rosegoldequipment.item.custom.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoseGoldEquipment implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("rose-gold-equipment");
	public static final String MOD_ID = "rosegoldequipment";

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Rosey world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}