package dev.mrshawn.rentableregions.rentables

import java.util.UUID

interface IPossessable {

	fun setOwner(newOwner: UUID)

	fun getOwner(): UUID?

}
