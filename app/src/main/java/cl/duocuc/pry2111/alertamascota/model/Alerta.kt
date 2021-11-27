package cl.duocuc.pry2111.alertamascota.model

import java.util.*

class Alerta(id: Int, fecha_perdida: Date, texto: String,foto: String, mascota: Mascota) {
    var id: Int = id
    var fecha_perdida: Date = fecha_perdida
    var texto: String = texto
    var foto: String = foto
    var mascota: Mascota = mascota


}