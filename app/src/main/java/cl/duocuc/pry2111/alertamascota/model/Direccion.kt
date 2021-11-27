package cl.duocuc.pry2111.alertamascota.model

class Direccion(nombre: String, comuna: Comuna, region: Region) {

    var nombre: String = nombre
    var comuna: Comuna = comuna
    var region: Region = region
}

class Region(id: Int, nombre: String){
    var id: Int = id
    var nombre: String = nombre
}

class Comuna(id: Int, nombre: String) {
    var id: Int = id
    var nombre: String = nombre
}