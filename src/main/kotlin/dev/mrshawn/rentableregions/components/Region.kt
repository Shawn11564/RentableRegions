package dev.mrshawn.rentableregions.components

import org.bukkit.Location
import org.bukkit.util.BoundingBox

abstract class Region(
	val name: String,
	private val cornerOne: Location,
	private val cornerTwo: Location
) {

	private val boundingBox: BoundingBox = BoundingBox.of(cornerOne, cornerTwo)

	fun contains(location: Location) = boundingBox.contains(location.toVector())

}
