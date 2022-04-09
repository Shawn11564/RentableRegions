package dev.mrshawn.rentableregions

import co.aikar.commands.PaperCommandManager
import dev.mrshawn.rentableregions.utils.events.EventUtils
import org.bukkit.plugin.java.JavaPlugin

class RentableRegions: JavaPlugin() {

	companion object {
		lateinit var instance: RentableRegions
	}

	override fun onEnable() {
		instance = this
		registerListeners()
		registerCommands()
	}

	override fun onDisable() {

	}

	private fun registerListeners() {
		EventUtils.registerEvents(

		)
	}

	private fun registerCommands() {
		val pcm = PaperCommandManager(this)

	}

}
