package dev.mrshawn.rentableregions.utils.messages.system

enum class MSG(private val definition: String) {

	TEST("d");

	override fun toString(): String {
		return definition
	}

}
