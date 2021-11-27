package cl.duocuc.pry2111.alertamascota.model

class Dueño(id: Int, nombre: String, telefono: Int, direccion: Direccion, mail: String, foto: String, mascotas: ArrayList<Mascota>) {
    var id: Int = id
    var nombre: String = nombre
    var telefono = telefono
    var direccion: Direccion = direccion
    var mail: String = mail
    var foto: String = foto
    var mascotas: ArrayList<Mascota> = mascotas

}