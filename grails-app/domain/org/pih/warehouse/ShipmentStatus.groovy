package org.pih.warehouse

/**
 * Represents the Status of a Shipment.
 */
class ShipmentStatus {
	
	String name				// The name of the status
	boolean finalStatus		// Indicates whether this status indicates a completed shipment

    static constraints = {
    }
	
	String toString() { return "$name"; }
}
