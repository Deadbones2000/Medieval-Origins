package net.itsparkielad.medievalorigins;

import net.fabricmc.api.ModInitializer;
import net.itsparkielad.medievalorigins.enchantments.ModEnchantments;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MedievalOrigins implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("medievalorigins");
	public static final String MOD_ID = "medievalorigins";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModEnchantments.registerModEnchantments();

		LOGGER.info("Hello Fabric world!");
	}
}
