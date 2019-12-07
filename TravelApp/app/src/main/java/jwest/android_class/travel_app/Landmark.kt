package jwest.android_class.travel_app

class Landmark (id : String, authorId : String?, coordinates: Coordinates, title : String, description: String, rating: Int) {
    val id = id
    val authorId = authorId
    var coordinates = coordinates
    val title = title
    val description = description
    val rating = rating

    constructor() : this("", "", Coordinates(100.0, 100.0), "", "", 0){

    }
}