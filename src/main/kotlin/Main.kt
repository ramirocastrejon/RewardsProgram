fun main(args: Array<String>) {


    val map = mutableMapOf<String, PersonalRewards>()
    map["323532342"] = PersonalRewards("Abe", 0.0)
    map["234295435"] = PersonalRewards("Ben", 0.0)
    map["939534012"] = PersonalRewards("Cathy", 0.0)
    map["202934543"] = PersonalRewards("Don", 0.0)
    map["330394011"] = PersonalRewards("Elle", 0.0)
    map["839047202"] = PersonalRewards("Frances", 0.0)
    map["901239409"] = PersonalRewards("Gaby", 0.0)

    map["323532342"]?.totalPurchases(52.81)
    map["234295435"]?.totalPurchases(61.62)
    map["939534012"]?.totalPurchases(91.11)
    map["202934543"]?.totalPurchases(29.54)
    map["330394011"]?.totalPurchases(29.82)
    map["839047202"]?.totalPurchases(14.34)
    map["901239409"]?.totalPurchases(3.10)
    map["939534012"]?.totalPurchases(53.92)
    map["202934543"]?.totalPurchases(68.73)
    map["330394011"]?.totalPurchases(35.94)
    map["839047202"]?.totalPurchases(7.55)
    map["901239409"]?.totalPurchases(2.70)

    for ((key, value) in map) {
        println("$key = ${value.name} = ${value.purchases}")
    }


}

class PersonalRewards(name: String, purchases: Double){
    var name = name;
    var purchases = purchases;

    fun totalPurchases(x: Double){
        purchases +=x
    }

}