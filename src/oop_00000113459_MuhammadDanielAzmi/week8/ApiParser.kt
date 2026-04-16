package oop_00000113459_MuhammadDanielAzmi.week8

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {

        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing name"
        }

        val type = rawJson["type"] as? String

        return when (type) {
            "Electronic" -> {
                val warranty = (rawJson["warrantyMonths"] as? Int) ?: 12
                Product.Electronic(id, name, warranty)
            }

            "Clothing" -> {
                val size = (rawJson["size"] as? String) ?: "All Size"
                Product.Clothing(id, name, size)
            }

            else -> null
        }
    }
}