package dev.mrshawn.rentableregions.rentables.impl

import dev.mrshawn.rentableregions.components.Region
import dev.mrshawn.rentableregions.rentables.IPurchasable
import dev.mrshawn.rentableregions.rentables.IPossessable
import org.bukkit.Location
import java.util.*

class RentableRegion(
	name: String,
	cornerOne: Location,
	cornerTwo: Location,
	private var owner: UUID? = null,
	private var cost: Double = 0.0
): Region(name, cornerOne, cornerTwo), IPossessable, IPurchasable {

	override fun setOwner(newOwner: UUID) {
		owner = newOwner
	}

	override fun getOwner(): UUID? {
		return owner
	}

	override fun setCost(newCost: Double) {
		cost = newCost
	}

	override fun getCost(): Double {
		return cost
	}


}
