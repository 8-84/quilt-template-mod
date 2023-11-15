package mass_reg_lib;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.ModDependency;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.loader.api.QuiltLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MassRegLib implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Example Mod");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		QuiltLoader.getAllMods();
	}
}
